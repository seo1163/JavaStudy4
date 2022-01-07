package com.iu.s9.himart;

public class ElectronicMain {

	public static void main(String[] args) {
		// Tv, Computer, Phone  정보 입력
		
		Computer pc = new Computer();
		pc.company = "Samsung";
		pc.brand = "갤럭시북";
		pc.cpu = "i7";
		pc.price = 200;
		pc.point = 20;
		
		Phone hp = new Phone();
		hp.company = "Samsung";
		hp.brand = "갤럭시 S21";
		hp.pixel = 100;
		hp.price = 150;
		hp.point = 10;
		
		Tv tv = new Tv();
		tv.company = "LG";
		tv.brand = "올레드 TV";
		tv.price = 400;
		tv.point = 40;

		Client iu = new Client();
		iu.money=1000;
		iu.point=0;
		iu.buy(pc);
		
	}

}
