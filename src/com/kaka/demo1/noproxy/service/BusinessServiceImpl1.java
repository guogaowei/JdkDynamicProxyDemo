package com.kaka.demo1.noproxy.service;

import org.apache.log4j.Logger;

import com.kaka.demo1.noproxy.monitor.PerformanceMonitor1;


/**
 * 
  * @ClassName: BusinessServiceImpl
  * @Description: �Ӵ�����Կ��������ܼ������ҵ����������һ��ÿһ��ҵ���������������ܼ�ⷽ���Ĳ��룬�ƻ���ҵ���߼��Ĵ����ԡ�
  * 			  demo2ͨ������ķ�ʽ�����ܼ����Щ���д����ҵ���߼�����ȫ�Ƴ�����ͨ��JDK��̬�����������д��붯̬֯�뵽Ŀ�귽������Ӧλ�á�
  * @author kaka
  * @date 2014��1��27�� ����10:54:40
  *
 */
public class BusinessServiceImpl1 implements BusinessService1{
	private Logger logger = Logger.getLogger( BusinessServiceImpl1.class );
	@Override
	public void removeTopic( int topicId ) {
		//���ܿ�ʼ������
		PerformanceMonitor1.beginMonitor( "com.kaka.demo1.noproxy.service.BusinessServiceImpl.removeTopic" );
		
		logger.info( "ģ��ɾ��Topic��¼��" + topicId );//ģ��ҵ�����
		
		try {
			Thread.sleep( 50 );
		} catch( InterruptedException e ) {
			e.printStackTrace();
		}
		
		//���ܽ���������
		PerformanceMonitor1.endMonitor();
	}

	@Override
	public void removeForum( int forumId ) {
		//���ܿ�ʼ������
		PerformanceMonitor1.beginMonitor( "com.kaka.demo1.noproxy.service.BusinessServiceImpl.removeForum" );
		
		logger.info( "ģ��ɾ��Forum��¼��" + forumId );//ģ��ҵ�����
		
		try {
			Thread.sleep( 50 );
		} catch( InterruptedException e ) {
			e.printStackTrace();
		}
		
		//���ܽ���������
		PerformanceMonitor1.endMonitor();
	}

}

