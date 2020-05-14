package com.cy.lombok.test;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import com.cy.pj.activity.pojo.Activity;


@SpringBootTest
public class LombokTest {
	@Test
	public void test() {
		
		 Activity ac=new Activity() ;
		 ac.setId(66L);
		 System.out.println(ac.getId());
		
	}
	

}
