package com.wxueyuan.DesignPettern.proxy;

/**
 * Author: Jesmin
 * Description: 由于黄牛和购票者都需要买票，我们抽象出一个Operation接口，提供一个公共方法buyTicket
 * 				用来表示买票操作
 *
 */
public interface Operation {
	void buyTicket(Ticket t);
}
