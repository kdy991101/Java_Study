package com.iu.loop;

import java.util.Scanner;

public class Loop5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//  while문
		Scanner sc = new Scanner(System.in);
		
		boolean check = true;
		
		while(check) {
		System.out.println("1.성적 입력");
		System.out.println("2.총점 계산");
		System.out.println("3.평균 계산");
		System.out.println("4.종    료");
		int select = sc.nextInt();
		if(select == 1) {
			System.out.println("성적 입력 선택");
		}else if (select == 2) {
			System.out.println("총점 계산 선택");
		}else if (select == 3) {
			System.out.println("평균 계산 선택");
		}else if (select ==4 ) {
			System.out.println("종    료 선택");
		}else {
			check = false;
//			check =!check;
//			break;
			System.out.println("잘못     선택");
		}
//		int i = 0;
//		while(i < 5) {
//			System.out.println("Hello World");
//			i++;
//		}
		
		}
			
	}

}
