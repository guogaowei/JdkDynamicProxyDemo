package com.kaka.demo1.noproxy.monitor;

import org.apache.log4j.Logger;


/**
 * 
  * @ClassName: PerformanceMonitor
  * @Description: 性能监控方法
  * @author kaka
  * @date 2014年1月27日 上午10:20:45
  *
 */
public class PerformanceMonitor1 {
	private static Logger logger = Logger.getLogger( PerformanceMonitor1.class );
	private static ThreadLocal<MethodPerformance1> performanceRecord = new ThreadLocal<MethodPerformance1>();
	
	public static void beginMonitor(String method){
		logger.info("begin monitor...");
		MethodPerformance1 mPerformance = new MethodPerformance1( method );
		performanceRecord.set( mPerformance );
	}
	
	public static void endMonitor(){
		logger.info( "end monitor..." );
		MethodPerformance1 mPerformance = performanceRecord.get();
		mPerformance.showPerformance();
	}

}
