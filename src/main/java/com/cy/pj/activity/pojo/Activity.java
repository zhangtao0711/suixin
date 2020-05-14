package com.cy.pj.activity.pojo;

import java.time.LocalDateTime;

import org.springframework.format.annotation.DateTimeFormat;

import com.fasterxml.jackson.annotation.JsonFormat;

import lombok.Data;

/**
 * create table tb_activity(
     id bigint primary key auto_increment,
     title varchar(100) not null,
     category varchar(100) not null,
	 startTime datetime not null,
	 endTime datetime not null,
	 remark text,
	 state tinyint,
     createdTime datetime not null,
	 createdUser varchar(100)
    )engine=InnoDB;
 * @author qilei
 *
 */
@Data
public class Activity {
	private Long id;
	private String title;
	private String category;
	@DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss")
	@JsonFormat(pattern =  "yyyy/MM/dd HH:mm:ss")
	private LocalDateTime startTime;
	@DateTimeFormat(pattern = "yyyy/MM/dd HH:mm:ss")
	@JsonFormat(pattern =  "yyyy/MM/dd HH:mm:ss")
	private LocalDateTime endTime;
	private String remark;
	private Integer	state=1;
	private LocalDateTime createdTime;
	private String createdUser;
	
}



