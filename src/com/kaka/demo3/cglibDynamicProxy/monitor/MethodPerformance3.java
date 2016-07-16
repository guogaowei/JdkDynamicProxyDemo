package com.kaka.demo3.cglibDynamicProxy.monitor;

import org.apache.log4j.Logger;


/**
 * 
  * @ClassName: MethodPerformance
  * @Description: ���ڼ�¼���ܼ�����Ϣ���򵥼�¼������ʱ
  * @author kaka
  * @date 2014��1��27�� ����10:22:18
  *
 */
public class MethodPerformance3 {
	private Logger logger = Logger.getLogger( MethodPerformance3.class );
	private Long beginTime;
	private Long endTime;
	private String serviceMethod;
	
	public MethodPerformance3(String serviceMethod){
		this.serviceMethod = serviceMethod;
		beginTime = System.currentTimeMillis();
	}
	
	public void showPerformance(){
		endTime = System.currentTimeMillis();
		logger.info( serviceMethod + " ���� " + (endTime-beginTime) + " ����"); 
	}

}
