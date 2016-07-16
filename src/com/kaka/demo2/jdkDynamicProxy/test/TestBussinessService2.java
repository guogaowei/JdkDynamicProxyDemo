package com.kaka.demo2.jdkDynamicProxy.test;

import java.lang.reflect.Proxy;

import com.kaka.demo2.jdkDynamicProxy.handler.PerformanceHandler;
import com.kaka.demo2.jdkDynamicProxy.service.BusinessService2;
import com.kaka.demo2.jdkDynamicProxy.service.BusinessServiceImpl2;


public class TestBussinessService2 {
	
	public static void main( String[] args ) {
		BusinessService2 businessService = new BusinessServiceImpl2();//希望被代理的目标业务类
		PerformanceHandler handler = new PerformanceHandler( businessService );//将目标业务类和横切代码编织到一起
		//根据编织了目标业务类逻辑和性能监视横切逻辑的InvocationHandler实例创建代理对象
		BusinessService2 proxy = ( BusinessService2 )Proxy.newProxyInstance( 
						businessService.getClass().getClassLoader(), 
						businessService.getClass().getInterfaces(), handler );
		
		//proxy代理实现了目标业务类BusinessServiceImpl的所有接口
		proxy.removeForum( 1001 );
		proxy.removeTopic( 2001 );
	}

}
