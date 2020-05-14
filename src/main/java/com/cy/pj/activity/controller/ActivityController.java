package com.cy.pj.activity.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cy.pj.activity.pojo.Activity;
import com.cy.pj.activity.service.ActivityService;

@Controller
@RequestMapping("/activity/")

public class ActivityController {

	@Autowired
	private ActivityService activityService;
	@ResponseBody
	@RequestMapping("doFindActivitys")
	public List<Activity> doFindActivitys() {	
		return activityService.findActivitys();
	}
	@RequestMapping("doActivityUI")
	public String doActivityUI() {
	//	return "activity";
	return"activity-jQuery3";	
	}
	@RequestMapping("dodeleteById")
	@ResponseBody
	public String dodeleteById(Long id) {
		activityService.deleteById(id);
	//	List<Activity> list=activityService.findActivitys();
	//	model.addAttribute("list", list);
		return "delete ok";
	}	
	@RequestMapping("doSaveActivity")
	@ResponseBody
	public String doSaveActivity(Activity entity) {		
			activityService.saveActivity(entity);					
		return "save ok";
	}
	@RequestMapping("dofindById")
	public String dofindById(Long id,Model model) {
		Activity activity=activityService.findActivityById(id);
		model.addAttribute("ac", activity);		
		model.addAttribute("list", activityService.findActivitys());
		return "activity";
	}
}
