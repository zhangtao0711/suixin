package com.cy.pj.activity.dao;

import java.util.List;

import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.Update;

import com.cy.pj.activity.pojo.Activity;

@Mapper
public interface ActivityDao {

	 @Select("select * from tb_activity")
	 List<Activity> findActivitys();
	 @Delete("delete from tb_activity where id=#{id}")
	 int deleteById(Long id);
	 
	 //通过mapper/xml文件执行sql语句操作
	 int insertActivity(Activity entity);
	 @Select("select id,title,category,startTime,endTime from tb_activity where id=#{id} ")
	 Activity fiandById(Long id);
	 @Update("update tb_activity set title=#{title},category=#{category} where id=#{id}")
	 int updateActivityById(Activity entity);
	 //,startTime=#{startTime},endTime=#{endTime}
}
