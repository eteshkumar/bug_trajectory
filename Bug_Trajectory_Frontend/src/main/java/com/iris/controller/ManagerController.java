package com.iris.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.iris.daos.UserDao;
import com.iris.models.Project;
import com.iris.models.User;
import com.iris.service.ProjectService;
import com.iris.service.UserService;

@Controller
public class ManagerController {
    @Autowired
    UserService userService;
    @Autowired
    ProjectService projectService;

    
    @RequestMapping(value="/Manager",method=RequestMethod.POST)
      public ModelAndView getProjectAllocation(@RequestParam int project,@RequestParam(required=false) int[] Developer,@RequestParam(required=false) int[] Tester){
        
    		System.out.println("project : "+project);
    	
    		
           Project pObj=projectService.getProjectById(project);
           System.out.println("pObj : "+pObj);
           
             List<User> usersList=pObj.getUsers();
                  if(Developer!=null) {
                  for(int i:Developer) {
                         
                         User uObj=userService.getUserById(i);

                         uObj.getProject().add(pObj);
                         
                         usersList.add(uObj);
                         }
                  }
                  
                  if(Tester!=null) {
                  for(int i:Tester) {
                         User uObj=userService.getUserById(i);
                         uObj.getProject().add(pObj);
                         usersList.add(uObj);
                  }
                  }
                  pObj.setUsers(usersList);
                  
                  
                  System.out.println(pObj);
                  projectService.updateProject(pObj);
                  System.out.println("Project Obj : "+pObj);
                  
       
                    
                    List<Project> projectList=projectService.getAllProject();
    
                    List<User> devloperList=userService.getAllDeveloper();
    
                    List<User> testerList=userService.getAllTesterI();
                    
                    ModelAndView mv=new ModelAndView("ManagerAllocationPage");
                    mv.addObject("ProjectList",projectList);
                    mv.addObject("devoloperList",devloperList);
                    mv.addObject("testerList",testerList);
                    
                    return mv;

	}

}
