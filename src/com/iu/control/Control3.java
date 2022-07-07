package com.iu.control;

import java.util.Scanner;

public class Control3 {

	public static void main(String[] args) {
		// TODO Auto-generated method s
//			int num = 10; //메서드 안에 선언된 변수는 지역변수라 부름
//		중괄호가 열리면 살아남 
		Scanner sc =new Scanner(System.in);
			System.out.println("1~3 숫자를 입력하세요.");
				int select = sc.nextInt();
				
//				int num = 1;
				
				if(select == 1) {
					System.out.println("1 선택");
				}else if(select == 2) {
					System.out.println("2 선택");
				}else {
					System.out.println("3 선택");
				}

	}

}
