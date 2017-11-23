package com.wxueyuan.DesignPettern.StaticProxy;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//学生需要购买的ticket实例
		Ticket t = new Ticket(200);
		//学生黄牛代理实例
		Scalper scalper = new Scalper(new Student());
		//黄牛为学生执行买票操作
		scalper.buyTicket(t);
		
		//老师需要购买的ticket实例
		Ticket adultTicket = new Ticket(300);
		//老师黄牛代理实例
		TeacherScalper ts = new TeacherScalper(new Teacher());
		//黄牛为老师执行买票操作
		ts.buyTicket(adultTicket);
	}

}
