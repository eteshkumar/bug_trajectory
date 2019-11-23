package com.iris.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.iris.models.BugAllocationDetail;
import com.iris.models.BugSeverity;
import com.iris.models.BugStatus;
import com.iris.models.BugType;
import com.iris.models.Project;
import com.iris.models.User;
import com.iris.service.BugAllocationDetailService;
import com.iris.service.BugSeverityService;
import com.iris.service.BugStatusService;
import com.iris.service.BugTypeService;
import com.iris.service.ProjectService;

@Controller
public class TesterController {
	
	
	
	@Autowired
	BugSeverityService bugSeverityService;
	
	@Autowired
	BugStatusService bugStatusService;

	@Autowired
	BugTypeService bugTypeService;
	
	@Autowired
	ProjectService projectService;
	

	@Autowired
	HttpSession session;
	
	@Autowired
	BugAllocationDetailService bugAllocationDetailService;

    @RequestMapping(value="/BugAllocate/{p_Id}",method=RequestMethod.GET)
    public ModelAndView getBugReport(@PathVariable("p_Id")int p_Id,@RequestParam(name="msg",required=false)String msg) {
                    List<BugType> bugList=bugTypeService.getAllBug();
                    List<BugSeverity> sevList=bugSeverityService.getBugSeverity();
                    List<BugStatus> staList=bugStatusService.getAllBugStatus();
                    System.out.println(bugList);
                    System.out.println(sevList);
                    System.out.println(staList);
                    ModelAndView mv=new ModelAndView("BugReport");
                    mv.addObject("bugListObj",bugList);
                    mv.addObject("severityList",sevList);
                    mv.addObject("statusList",staList);
                    session.setAttribute("projectObj",projectService.getProjectById(p_Id));
        
        if(msg!=null) {
                    mv.addObject("msg",msg);
        }
        
        
        return mv;
    }
    
    @RequestMapping(value="/BugSuccessfullyAllocated",method=RequestMethod.GET)
    public String getBugAllocationDetails(@RequestParam String bug,@RequestParam String severity,@RequestParam String description)
    {
                    
                    System.out.println("I m here...."+bug+" "+severity+" "+description);
                    Project pObj=(Project)session.getAttribute("projectObj");
                    User uObj=(User)session.getAttribute("userObj");
                                                    
                    BugAllocationDetail bugObj = new BugAllocationDetail();
                    bugObj.setUserid(uObj.getUserid());
                    bugObj.setStatusId("S101");;
                    bugObj.setBugTypeId(bug);
                    bugObj.setSeverityId(severity);
                    bugObj.setDescription(description);
                    bugObj.setP_Id(pObj.getP_name());
                    System.out.println(bugObj);
                    
                    bugAllocationDetailService.saveBugDetails(bugObj);
                    return "redirect:BugAllocate/"+pObj.getP_Id()+"?msg='Bug Allocated Succesfully...'";
                    
    }


}
