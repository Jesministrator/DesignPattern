package com.wxueyuan.DesignPettern.StaticProxy;

public class Teacher implements Operation{
	@Override
	public void buyTicket(Ticket t) {
		// TODO Auto-generated method stub
		System.out.println("老师买到一张票,票价为"+t.getPrice());
	}
}
