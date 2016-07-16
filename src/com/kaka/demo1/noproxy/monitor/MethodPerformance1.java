package com.kaka.demo1.noproxy.monitor;

import org.apache.log4j.Logger;


/**
 * 
  * @ClassName: MethodPerformance
  * @Description: ���ڼ�¼���ܼ�����Ϣ���򵥼�¼������ʱ
  * @author kaka
  * @date 2014��1��27�� ����10:22:18
  *
 */
public class MethodPerformance1 {
	private Logger logger = Logger.getLogger( MethodPerformance1.class );
	private Long beginTime;
	private Long endTime;
	private String serviceMethod;
	
	public MethodPerformance1(String serviceMethod){
		this.serviceMethod = serviceMethod;
		beginTime = System.currentTimeMillis();
	}
	
	public void showPerformance(){
		endTime = System.currentTimeMillis();
		logger.info( serviceMethod + " ���� " + (endTime-beginTime) + " ����"); 
	}

}
