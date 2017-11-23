package com.wxueyuan.DesignPettern.proxy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//需要购买的ticket实例
		Ticket t = new Ticket(200);
		//黄牛实例
		Scalper scalper = new Scalper();
		//黄牛执行买票操作
		scalper.buyTicket(t);
	}

}
