package com.iu.control;

import java.util.Scanner;

public class Control1_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		중괄호 생략가능
//		단 조건식이 하나일 경우에만 생략 가능
		Scanner sc = new Scanner(System.in);
		
		System.out.println("정수를 입력하세요.");
		int num = sc.nextInt();
		
//		ex1
		if (num%2==0) {
			System.out.println(num + " 은(는) 짝수 입니다.");
		} else {
			System.out.println(num + " 은(는)홀수입니다");
		}

//		ex2
		String result = " 홀수";	
		if (num%2 == 0) {
			result = "짝수";
		}
		System.out.println(num + " 은(는)" + result + "입니다");
		
//		ex3
		 String result2 = num%2==0 ? "짝수입니다" : "홀수입니다";
		System.out.println(result2);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
