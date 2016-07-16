package com.kaka.demo3.cglibDynamicProxy.service;

import org.apache.log4j.Logger;

import com.kaka.demo3.cglibDynamicProxy.monitor.PerformanceMonitor3;



public class BusinessServiceImpl3 {
	private Logger logger = Logger.getLogger( BusinessServiceImpl3.class );

	public void removeTopic( int topicId ) {
		
		logger.info( "模拟删除Topic记录：" + topicId );//模拟业务代码
		
		try {
			Thread.sleep( 50 );
		} catch( InterruptedException e ) {
			e.printStackTrace();
		}
		
	}

	public void removeForum( int forumId ) {
		
		logger.info( "模拟删除Forum记录：" + forumId );//模拟业务代码
		
		try {
			Thread.sleep( 50 );
		} catch( InterruptedException e ) {
			e.printStackTrace();
		}
	}
}
