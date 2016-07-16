package com.kaka.demo2.jdkDynamicProxy.service;

import org.apache.log4j.Logger;


/**
 * 
  * @ClassName: BusinessServiceImpl
  * @Description: demo2������Ч����demo1������Ч��һ�£�������demo2��ԭ����ɢ�ĺ����߼�����(���ܼ���Ƕδ���),
  * 			     �ѱ���ȡ����PerformanceHandler�У�������ҵ����Ҳ��Ҫ���ܼ��ʱ��ֻ��ҪΪ���Ǵ�����Ӧ�Ĵ������ok��
  * 			  JDK��̬����ľ������ڣ���ֻ��Ϊ�ӿڴ�������ʵ��(����invoke�����ĵڶ�������)��
  * 			  demo3��ʾ����cglib��̬�����ʵ��������Ҫ����ҵ��ӿھͿ��Զ�̬��������ʵ����
  * @author kaka
  * @date 2014��1��27�� ����10:54:40
  *
 */
public class BusinessServiceImpl2 implements BusinessService2{
	private Logger logger = Logger.getLogger( BusinessServiceImpl2.class );
	@Override
	public void removeTopic( int topicId ) {
		
		logger.info( "ģ��ɾ��Topic��¼��" + topicId );//ģ��ҵ�����
		
		try {
			Thread.sleep( 50 );
		} catch( InterruptedException e ) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void removeForum( int forumId ) {
		
		logger.info( "ģ��ɾ��Forum��¼��" + forumId );//ģ��ҵ�����
		
		try {
			Thread.sleep( 50 );
		} catch( InterruptedException e ) {
			e.printStackTrace();
		}
	}

}

