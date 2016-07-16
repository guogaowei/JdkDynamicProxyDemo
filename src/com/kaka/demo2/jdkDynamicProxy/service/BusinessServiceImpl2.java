package com.kaka.demo2.jdkDynamicProxy.service;

import org.apache.log4j.Logger;


/**
 * 
  * @ClassName: BusinessServiceImpl
  * @Description: demo2的运行效果和demo1的运行效果一致，但是在demo2中原来分散的横切逻辑代码(性能监控那段代码),
  * 			     已被抽取到了PerformanceHandler中，当其他业务类也需要性能监控时，只需要为他们创建对应的代理类就ok。
  * 			  JDK动态代理的局限在于：它只能为接口创建代理实例(参照invoke方法的第二个参数)。
  * 			  demo3演示的是cglib动态代理的实例，不需要创建业务接口就可以动态创建代理实例。
  * @author kaka
  * @date 2014年1月27日 上午10:54:40
  *
 */
public class BusinessServiceImpl2 implements BusinessService2{
	private Logger logger = Logger.getLogger( BusinessServiceImpl2.class );
	@Override
	public void removeTopic( int topicId ) {
		
		logger.info( "模拟删除Topic记录：" + topicId );//模拟业务代码
		
		try {
			Thread.sleep( 50 );
		} catch( InterruptedException e ) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void removeForum( int forumId ) {
		
		logger.info( "模拟删除Forum记录：" + forumId );//模拟业务代码
		
		try {
			Thread.sleep( 50 );
		} catch( InterruptedException e ) {
			e.printStackTrace();
		}
	}

}

