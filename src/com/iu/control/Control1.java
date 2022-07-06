package com.iu.control;

import java.util.Scanner;

public class Control1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub]
//		제어문
//		조건식 : 어떤식을 만들든 결과가 boolean으로 나오게 함
//		1. 단일 if문
		Scanner sc = new Scanner(System.in);
		System.out.println("정수를 입력하세요.");
		int num = sc.nextInt();
		
		if (num%2==0) {
			System.out.println(num + " 은(는) 짝수 입니다.");
		}
//			중괄호 생략가능
//			단 조건식이 하나일 경우에만 생략 가능
		if (num<10) {
			System.out.println(num + " 은(는) 10 미만입니다.");
		}
			System.out.println("끝");
			
			
			
			
			
			
			
			
			
		}

	}


