package com.cy.pj.activity.service;

import java.util.List;

import com.cy.pj.activity.pojo.Activity;

public interface ActivityService {

	 List<Activity> findActivitys();
	 int deleteById(Long id);
	 int saveActivity(Activity entity);
	 Activity findActivityById(Long id);
	 int upDateById(Activity entity);
	 
}
