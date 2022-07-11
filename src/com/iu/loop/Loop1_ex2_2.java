package com.iu.loop;

import java.util.Scanner;

public class Loop1_ex2_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		int yid = 1234;//회원 가입시에 입력한 아이디
//		int ypw = 5678//회원 가입시 입력한 비밀번호
//				3.아이디 비밀번호를 입력해 로그인 판단
//				3.아이디 비밀번호를 입력해 로그인 판단
		
		int vid = 1234;
		int vpw = 5678;
		Scanner sc = new Scanner(System.in);
		int i = 0;
		for(i = 1; i <= 5; i++) {
			System.out.println("ID 입력하세요");
			int id = sc.nextInt();
			
			System.out.println("PW 입력하세요");
			int pw = sc.nextInt();
			
			if(id == vid && pw == vpw) {
				System.out.println("로그인에 성공하셨습니다.");
				break;
			}
			if (id != vid && pw != vpw ) {
				System.out.println("일치하지 않습니다. 다시 입력하세요" + i);
				 if(i == 5) {
						break;
					}
					
			}
//		==========================밑 강사님 풀이
//		int vid = 1234;
//		int vpw = 5678;
//			boolean check = flase;
//		Scanner sc = new Scanner(System.in);
//		for(int i = 0; i <= 5; i++) {
//			System.out.println("ID 입력하세요");
//			int id = sc.nextInt();
//			
//			if(id == yid && pw == ypw) {
//				System.out.println("로그인 성공");
//			check =!check;
//			}else {
//				System.out.println("로그인 실패");
//			}			
//	}
//		===========================================

}
	}
}
