package com.iu.s1.modifire;

class Test {
//같은 패키지 안에서는 public 생략가능	

	private int num;
	
	public Test() {
		
	}
	
	public void info(int num) {
			this.num = num;
			System.out.println(this.num);
	}
	
}
