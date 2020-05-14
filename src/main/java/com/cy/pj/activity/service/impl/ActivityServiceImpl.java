package com.cy.pj.activity.service.impl;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cy.pj.activity.dao.ActivityDao;
import com.cy.pj.activity.pojo.Activity;
import com.cy.pj.activity.service.ActivityService;

@Service
public class ActivityServiceImpl implements ActivityService {
	@Autowired
	private ActivityDao activityDao;
	
	public List<Activity> findActivitys(){
		return activityDao.findActivitys();
	}

	@Override
	public int deleteById(Long id) {
		// TODO Auto-generated method stub
		return activityDao.deleteById(id);
	}

	@Override
	public int saveActivity(Activity entity) {	
		return activityDao.insertActivity(entity);
	}

	@Override
	public Activity findActivityById(Long id) {
		
		return activityDao.fiandById(id);
	}

	@Override
	public int upDateById(Activity entity) {
		 
		return activityDao.updateActivityById(entity);
	}

	
}




