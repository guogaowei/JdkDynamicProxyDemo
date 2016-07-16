package com.kaka.demo1.noproxy.test;

import com.kaka.demo1.noproxy.service.BusinessService1;
import com.kaka.demo1.noproxy.service.BusinessServiceImpl1;


public class TestBusinessService1 {
	
	public static void main(String[] args){
		BusinessService1 businessService = new BusinessServiceImpl1();
		businessService.removeTopic( 1001 );
		businessService.removeForum( 2001 );
	}

}
