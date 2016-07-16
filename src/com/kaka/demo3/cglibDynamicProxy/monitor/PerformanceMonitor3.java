package com.kaka.demo3.cglibDynamicProxy.monitor;

import org.apache.log4j.Logger;


/**
 * 
  * @ClassName: PerformanceMonitor
  * @Description: 性能监控方法
  * @author kaka
  * @date 2014年1月27日 上午10:20:45
  *
 */
public class PerformanceMonitor3 {
	private static Logger logger = Logger.getLogger( PerformanceMonitor3.class );
	private static ThreadLocal<MethodPerformance3> performanceRecord = new ThreadLocal<MethodPerformance3>();
	
	public static void beginMonitor(String method){
		logger.info("begin monitor...");
		MethodPerformance3 mPerformance = new MethodPerformance3( method );
		performanceRecord.set( mPerformance );
	}
	
	public static void endMonitor(){
		logger.info( "end monitor..." );
		MethodPerformance3 mPerformance = performanceRecord.get();
		mPerformance.showPerformance();
	}

}
