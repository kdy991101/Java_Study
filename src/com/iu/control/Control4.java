package com.iu.control;

import java.util.Scanner;

public class Control4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		스위치는 if문과 다르게 조건식이 아닌 문자열,정수식임
//		 case값은 변수x
		Scanner sc = new Scanner(System.in);
		
		int select =sc.nextInt();
		
		switch(select) {
		case 1:
			System.out.println("1 진행");
			break;
		case 2:
			System.out.println("2 진행");
			break;
		default:
			System.out.println("나머지 진행");
			
			
		}
	
	}

}
