package com.iu.s6.student;

public class StudentSecondService extends StudentSeivice{
			
	@Override
	public StudentDTO setStudent() {
		//studentDTOSecond 입력 하는 코드 생성
		StudentDTOSecond studentDTOSecond = new StudentDTOSecond();
		
		return studentDTOSecond;
	}
	

}
