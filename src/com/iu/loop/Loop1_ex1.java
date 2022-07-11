package com.iu.loop;

import java.util.Scanner;

public class Loop1_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 0~9 출력하는 반복문
//		단 출력은 짝수만 	
//		단 출력은 짝수만 	
		for(int i=0; i<10; i++) {
		System.out.println(i);
		i++;//i=i+1;
	}
//	====================================== 강사님 풀이
		for(int i=0; i<10; i++){
			if(i%2 == 0) {
				System.out.println(i);
			}	
		}
//	=======================================
//		0~9사이의 짝수만 출력
//		단, if문을 사용하지 않고
		for (int i=0; i<10; i+=2) { //i = i + 2
			System.out.println(i);
		}
			
//			scanner로 부터 '멍멍' 출력
//			출력 횟수 입력받기
			
			System.out.println("횟수를 입력하세요");
			Scanner sc = new Scanner(System.in);
			
					
			int mung = sc.nextInt();
			for (int i = 0; i<mung; i++) {
				System.out.println("멍멍");
			
//				for(int i=0; i<cont; i++) {
//					System.out.println("횟수를 입력하세요.");
				}
			
					
				}
		}
