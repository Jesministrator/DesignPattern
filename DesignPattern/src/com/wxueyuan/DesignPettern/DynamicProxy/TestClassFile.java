package com.wxueyuan.DesignPettern.DynamicProxy;

import java.lang.reflect.Proxy;

import com.wxueyuan.DesignPettern.StaticProxy.Ticket;  

public class TestClassFile {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//学生需要购买的ticket实例
		Ticket studentTicket = new Ticket(200);
		
		System.getProperties().put("sun.misc.ProxyGenerator.saveGeneratedFiles", "true");  
        System.out.println(Proxy.getProxyClass(Operation.class.getClassLoader(), Operation.class)); 
		//创建为学生买票的黄牛代理
		Operation studentProxy = (Operation) new TicketOperationInvocationHandler(new Student()).getProxy();
		studentProxy.buyTicket(studentTicket);
	}

}
