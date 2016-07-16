package com.kaka.demo3.cglibDynamicProxy.test;


import com.kaka.demo3.cglibDynamicProxy.interceptor.CglibProxy;
import com.kaka.demo3.cglibDynamicProxy.service.BusinessServiceImpl3;


public class TestBusinessService3 {
	public static void main( String[] args ) {
		CglibProxy cglibProxy = new CglibProxy();
		BusinessServiceImpl3 businessServiceImpl = 
				( BusinessServiceImpl3 )cglibProxy.getProxy( BusinessServiceImpl3.class );
		businessServiceImpl.removeForum( 1001 );
		businessServiceImpl.removeTopic( 2001 );
	}
}
