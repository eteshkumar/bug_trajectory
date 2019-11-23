package com.iris.daosImpl;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.iris.daos.BugAllocationDetailDao;
import com.iris.models.BugAllocationDetail;

@Repository("bugAllocationDetail")
public class BugAllocationDetailDaoImpl implements BugAllocationDetailDao{
	@Autowired
	SessionFactory sessionFactory;
	

	public boolean saveBugDetails(BugAllocationDetail bugAllocate) {
		try {
			Session session=sessionFactory.getCurrentSession();
			session.save(bugAllocate);
			return true;	
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		return false;
	}

}
