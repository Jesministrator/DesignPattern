package com.wxueyuan.DesignPettern.proxy;

public class TicketConsumer implements Operation{
	
	@Override
	public void buyTicket(Ticket t) {
		// TODO Auto-generated method stub
		System.out.println("购票者买到一张票,票价为"+t.getPrice());
	}

}
