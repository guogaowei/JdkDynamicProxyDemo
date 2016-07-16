package com.kaka.demo2.jdkDynamicProxy.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.kaka.demo2.jdkDynamicProxy.monitor.PerformanceMonitor2;



public class PerformanceHandler implements InvocationHandler{
	
	private Object target;//Ŀ���ҵ����
	
	public PerformanceHandler(Object target){
		this.target = target;
	}
	
	/**
	 * ���ܼ�ش����ҵ����뱻��֯��һ��
	 * @param proxy ����ʵ��
	 * @param method ������Ŀ��ʵ����ĳ�����巽��
	 * @param args	 ������ʵ��ĳ�����������
	 * @throws
	 */
	@Override
	public Object invoke( Object proxy, Method method, Object[] args ) throws Throwable {
		
		//��ʼ���ܼ��
		PerformanceMonitor2.beginMonitor( target.getClass().getName()+"."+method.getName() );
		//ͨ���������ҵ�����Ŀ�귽��
		Object obj = method.invoke( target, args );
		//�������ܼ��
		PerformanceMonitor2.endMonitor();
		
		return obj;
	}

}
