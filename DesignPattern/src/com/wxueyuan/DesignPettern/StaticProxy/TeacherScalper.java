package com.wxueyuan.DesignPettern.StaticProxy;


/**
 * Author: Jesmin
 * Description: 老师黄牛代理类，在黄牛的购票操作中，他实际上分成了4步，先收钱，然后排队，然后购票，最后将票交给老师
 *
 */
public class TeacherScalper implements Operation{
	
	private Teacher realConsumer ;
	
	public TeacherScalper(Teacher t) {
		realConsumer = t;
	}

	@Override
	public void buyTicket(Ticket t) {
		// TODO Auto-generated method stub
		System.out.println("黄牛收取购票者的钱");
		System.out.println("黄牛连夜排队");
		realConsumer.buyTicket(t);
		System.out.println("黄牛将票交给购票者");
	}
	
}
