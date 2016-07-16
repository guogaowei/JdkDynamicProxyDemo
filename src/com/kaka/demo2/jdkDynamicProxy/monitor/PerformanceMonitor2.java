package com.kaka.demo2.jdkDynamicProxy.monitor;

import org.apache.log4j.Logger;



/**
 * 
  * @ClassName: PerformanceMonitor
  * @Description: ���ܼ�ط���
  * @author kaka
  * @date 2014��1��27�� ����10:20:45
  *
 */
public class PerformanceMonitor2 {
	private static Logger logger = Logger.getLogger( PerformanceMonitor2.class );
	private static ThreadLocal<MethodPerformance2> performanceRecord = new ThreadLocal<MethodPerformance2>();
	
	public static void beginMonitor(String method){
		logger.info("begin monitor...");
		MethodPerformance2 mPerformance = new MethodPerformance2( method );
		performanceRecord.set( mPerformance );
	}
	
	public static void endMonitor(){
		logger.info( "end monitor..." );
		MethodPerformance2 mPerformance = performanceRecord.get();
		mPerformance.showPerformance();
	}

}

