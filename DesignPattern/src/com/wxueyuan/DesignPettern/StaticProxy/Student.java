package com.wxueyuan.DesignPettern.StaticProxy;

public class Student implements Operation{
	
	@Override
	public void buyTicket(Ticket t) {
		// TODO Auto-generated method stub
		System.out.println("学生买到一张票,票价为"+t.getPrice());
	}

}
