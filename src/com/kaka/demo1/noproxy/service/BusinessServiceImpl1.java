package com.kaka.demo1.noproxy.service;

import org.apache.log4j.Logger;

import com.kaka.demo1.noproxy.monitor.PerformanceMonitor1;


/**
 * 
  * @ClassName: BusinessServiceImpl
  * @Description: 从代码可以看出，性能检测代码和业务代码耦合在一起，每一处业务处理方法都会有性能检测方法的插入，破坏了业务逻辑的纯粹性。
  * 			  demo2通过代理的方式将性能监控这些横切代码从业务逻辑中完全移除，并通过JDK动态代理技术将横切代码动态织入到目标方法的相应位置。
  * @author kaka
  * @date 2014年1月27日 上午10:54:40
  *
 */
public class BusinessServiceImpl1 implements BusinessService1{
	private Logger logger = Logger.getLogger( BusinessServiceImpl1.class );
	@Override
	public void removeTopic( int topicId ) {
		//性能开始检测代码
		PerformanceMonitor1.beginMonitor( "com.kaka.demo1.noproxy.service.BusinessServiceImpl.removeTopic" );
		
		logger.info( "模拟删除Topic记录：" + topicId );//模拟业务代码
		
		try {
			Thread.sleep( 50 );
		} catch( InterruptedException e ) {
			e.printStackTrace();
		}
		
		//性能结束检测代码
		PerformanceMonitor1.endMonitor();
	}

	@Override
	public void removeForum( int forumId ) {
		//性能开始检测代码
		PerformanceMonitor1.beginMonitor( "com.kaka.demo1.noproxy.service.BusinessServiceImpl.removeForum" );
		
		logger.info( "模拟删除Forum记录：" + forumId );//模拟业务代码
		
		try {
			Thread.sleep( 50 );
		} catch( InterruptedException e ) {
			e.printStackTrace();
		}
		
		//性能结束检测代码
		PerformanceMonitor1.endMonitor();
	}

}

