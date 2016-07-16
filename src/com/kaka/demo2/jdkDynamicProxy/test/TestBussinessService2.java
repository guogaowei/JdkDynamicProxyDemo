package com.kaka.demo2.jdkDynamicProxy.test;

import java.lang.reflect.Proxy;

import com.kaka.demo2.jdkDynamicProxy.handler.PerformanceHandler;
import com.kaka.demo2.jdkDynamicProxy.service.BusinessService2;
import com.kaka.demo2.jdkDynamicProxy.service.BusinessServiceImpl2;


public class TestBussinessService2 {
	
	public static void main( String[] args ) {
		BusinessService2 businessService = new BusinessServiceImpl2();//ϣ���������Ŀ��ҵ����
		PerformanceHandler handler = new PerformanceHandler( businessService );//��Ŀ��ҵ����ͺ��д����֯��һ��
		//���ݱ�֯��Ŀ��ҵ�����߼������ܼ��Ӻ����߼���InvocationHandlerʵ�������������
		BusinessService2 proxy = ( BusinessService2 )Proxy.newProxyInstance( 
						businessService.getClass().getClassLoader(), 
						businessService.getClass().getInterfaces(), handler );
		
		//proxy����ʵ����Ŀ��ҵ����BusinessServiceImpl�����нӿ�
		proxy.removeForum( 1001 );
		proxy.removeTopic( 2001 );
	}

}
