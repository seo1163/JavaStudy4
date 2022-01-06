package com.iu.s3.member;

public class MemberMain {

	public static void main(String[] args) {
		
		Member member = new Member();
		member.setAge(29);
	
		System.out.println(member.getAge());
		
		member.setCm(177);
		System.out.println(member.getCm());
		
		member.setEmail("skgmlckd@naver.com wp");
		System.out.println(member.getEmail());
		
	}

}
