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
	 *<p>功能:为一个类创建动态代理对象</p>
	 * @author kaka
	 * @date 2014年1月27日
	 * @param  clazz
	 * @return Object
	 * @throws
	 */
	public Object getProxy(Class<?> clazz){
		enhancer.setSuperclass( clazz );
		//设置需要创建子类的类
		enhancer.setCallback( this );
		//通过字节码技术动态创建子类实例
		return enhancer.create();
	}
	
	/**
	 * 
	 *<p>功能:CGLIB定义的接口方法，它拦截所有目标类方法的调用</p>
	 * @param obj 目标类实例
	 * @param method 目标类方法的反射对象
	 * @param args 方法的动态入参
	 * @param proxy 代理类实例
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
