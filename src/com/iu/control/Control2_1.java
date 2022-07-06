package com.iu.control;

import java.util.Scanner;

public class Control2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		월급을 입력
//		1 입력하면 정규직
//		2 입력하면 계약직
//		정규직 - 국민연금 1%, 건강보험 1.4%, 고용보험 0.5%, 산재보험 0.7%
////		계약직 - 3.3%
//		
		Scanner sc = new Scanner(System.in);
//		System.out.println("월급을 입력하세요");
//		int num = sc.nextInt();
//		System.out.println("월급: " + num);
//		System.out.println("정규직 1, 계약직2");
//		
//		
//		int a = 1;
//		int b = 2;
//		
//		if(a == 1) {
//			
//		}
//		if(b == 2) {
		double wage = 0;
		double num = 0;
		double j = 0;
		double g = 0;
		
		System.out.println("월급을 입력");
		wage = sc.nextDouble();
		System.out.println("정규직1, 계약직2");
		num = sc.nextDouble();
		
		if(num == 1) {
			j = wage-(wage*0.036);
			//wage -= wage*0.036
			System.out.println(j + "원");
		} else if (num ==2) {
			g = wage-(wage*0.033);
			System.out.println(g + "원");
		}
	
		
		
		
		
	}

}
