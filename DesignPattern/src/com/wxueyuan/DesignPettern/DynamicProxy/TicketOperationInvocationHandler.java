package com.wxueyuan.DesignPettern.DynamicProxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class TicketOperationInvocationHandler implements InvocationHandler {
	
	//将需要代理的委托对象传入Handler中
	private Object target; 
	
	public TicketOperationInvocationHandler(Object target) {
		this.target = target;
	}

	//获得帮助购票者买票的代理
	public Object getProxy() {
		return Proxy.newProxyInstance(Thread.currentThread()  
                .getContextClassLoader(), target.getClass().getInterfaces(),  
                this);  
	}

	//实际上黄牛执行的购票操作
	@Override
	public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
		// TODO Auto-generated method stub
		System.out.println("黄牛收取购票者的钱");
		System.out.println("黄牛连夜排队");
		Object ret = method.invoke(target, args);
		System.out.println("黄牛将票交给购票者");
		return ret;
	}

}
