package com.iu.s9.himart;

public class Client {
	int money;	
	int point;
	
	public void buy(HiMart h) {
		this.money = this.money-h.price;
		this.point = this.point+h.point;
		System.out.println("최종금액 : " + this.money);
		System.out.println("최종 포인트 : " + this.point);
		
				
	}

}
