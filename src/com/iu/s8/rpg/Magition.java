package com.iu.s8.rpg;

public class Magition extends Character implements Act{
	
	//마법사 is a 캐릭터
	//마법사 has a 캐릭터
	int mp;
	
	@Override
	public void attack() {
		this.spel();
		
	}

	@Override
	public void move() {
		
	}

	public void spel() {
		System.out.println("마법공격");
	}

}
