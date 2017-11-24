package com.wxueyuan.DesignPettern.DynamicProxy;

import com.wxueyuan.DesignPettern.StaticProxy.Operation;
import com.wxueyuan.DesignPettern.StaticProxy.Student;
import com.wxueyuan.DesignPettern.StaticProxy.Teacher;
import com.wxueyuan.DesignPettern.StaticProxy.Ticket;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//学生需要购买的ticket实例
		Ticket studentTicket = new Ticket(200);
		//老师需要购买的ticket实例
		Ticket adultTicket = new Ticket(300);
		
		//创建为学生买票的黄牛代理
		Operation studentProxy = (Operation) new TicketOperationInvocationHandler(new Student()).getProxy();
		studentProxy.buyTicket(studentTicket);
		
		System.out.println("---------------------------");
		
		//创建为老师买票的黄牛代理
		Operation teacherProxy = (Operation) new TicketOperationInvocationHandler(new Teacher()).getProxy();
		teacherProxy.buyTicket(adultTicket);
	}

}
