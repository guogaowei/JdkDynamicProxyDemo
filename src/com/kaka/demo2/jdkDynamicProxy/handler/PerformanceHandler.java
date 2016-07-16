package com.kaka.demo2.jdkDynamicProxy.handler;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

import com.kaka.demo2.jdkDynamicProxy.monitor.PerformanceMonitor2;



public class PerformanceHandler implements InvocationHandler{
	
	private Object target;//目标的业务类
	
	public PerformanceHandler(Object target){
		this.target = target;
	}
	
	/**
	 * 性能监控代码和业务代码被编织在一起
	 * @param proxy 代理实例
	 * @param method 被代理目标实例的某个具体方法
	 * @param args	 被代理实例某个方法的入参
	 * @throws
	 */
	@Override
	public Object invoke( Object proxy, Method method, Object[] args ) throws Throwable {
		
		//开始性能监控
		PerformanceMonitor2.beginMonitor( target.getClass().getName()+"."+method.getName() );
		//通过反射调用业务类的目标方法
		Object obj = method.invoke( target, args );
		//结束性能监控
		PerformanceMonitor2.endMonitor();
		
		return obj;
	}

}
