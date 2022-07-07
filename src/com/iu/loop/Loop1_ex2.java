package com.iu.loop;

import java.util.Scanner;

public class Loop1_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		1. 1번 누르면 대문자 2번이면 소문자
//		   1번이면 대문자AZ 2번이면 소문자az

		Scanner sc = new Scanner(System.in);
		System.out.println("1번\'대문자\'  2번\'소문자\' 선택하세요");
		
		 int num = sc.nextInt();	 
		
		if(num == 1) 
			for(char i = 65; i <= 90; i++) {
				System.out.println(i);
			} else if(num == 2) {
				for(char i = 97; i <=122; i++) {
					System.out.println(i);
				}
			
		}
//		==========================강사님 문제 풀이
		int i = 97;
		int j = 123;
		if(num == 1) {
			i = 65;
			j = 91;
		}
		for(int c = i; c < j; c++) {
			System.out.println((char)c);
		}
//		=====================================
	

}
}
