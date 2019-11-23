package com.iris.serviceimpl;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.iris.daos.BugAllocationDetailDao;
import com.iris.models.BugAllocationDetail;
import com.iris.service.BugAllocationDetailService;

@Service("bugAllocationDetailService")
@Transactional


public class BugAllocationDetailServiceImpl implements BugAllocationDetailService {
	@Autowired
	BugAllocationDetailDao bugAllocationDetailDao;
	public boolean saveBugDetails(BugAllocationDetail bugAllocate) {
	return bugAllocationDetailDao.saveBugDetails(bugAllocate);
	}

}
