package com.kaka.demo3.cglibDynamicProxy.interceptor;

import java.lang.reflect.Method;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import com.kaka.demo3.cglibDynamicProxy.monitor.PerformanceMonitor3;




public class CglibProxy implements MethodInterceptor{
	
	private Enhancer enhancer = new Enhancer();
	
	/**
	 * 
	 *<p>����:Ϊһ���ഴ����̬�������</p>
	 * @author kaka
	 * @date 2014��1��27��
	 * @param  clazz
	 * @return Object
	 * @throws
	 */
	public Object getProxy(Class<?> clazz){
		enhancer.setSuperclass( clazz );
		//������Ҫ�����������
		enhancer.setCallback( this );
		//ͨ���ֽ��뼼����̬��������ʵ��
		return enhancer.create();
	}
	
	/**
	 * 
	 *<p>����:CGLIB����Ľӿڷ���������������Ŀ���෽���ĵ���</p>
	 * @param obj Ŀ����ʵ��
	 * @param method Ŀ���෽���ķ������
	 * @param args �����Ķ�̬���
	 * @param proxy ������ʵ��
	 * @return 
	 * @throws Throwable 
	 * @throws
	 */
	@Override
	public Object intercept( Object obj, Method method, Object[] args, MethodProxy proxy ) throws Throwable {
		PerformanceMonitor3.beginMonitor( obj.getClass().getName() + "." + method.getName() );
		Object result = proxy.invokeSuper( obj, args );
		PerformanceMonitor3.endMonitor();
		return result;
	}

}
