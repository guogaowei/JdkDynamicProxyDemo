package com.kaka.demo2.jdkDynamicProxy.monitor;

import org.apache.log4j.Logger;


/**
 * 
  * @ClassName: MethodPerformance
  * @Description: ���ڼ�¼���ܼ�����Ϣ���򵥼�¼������ʱ
  * @author kaka
  * @date 2014��1��27�� ����10:22:18
  *
 */
public class MethodPerformance2 {
	private Logger logger = Logger.getLogger( MethodPerformance2.class );
	private Long beginTime;
	private Long endTime;
	private String serviceMethod;
	
	public MethodPerformance2(String serviceMethod){
		this.serviceMethod = serviceMethod;
		beginTime = System.currentTimeMillis();
	}
	
	public void showPerformance(){
		endTime = System.currentTimeMillis();
		logger.info( serviceMethod + " ���� " + (endTime-beginTime) + " ����"); 
	}

}
