package com.iu.loop;

import java.util.Scanner;

public class Loop4_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		0분0초-59분59초
//		sca 만들어 분과 초를 입력 받아
//		ex)1분 15를 입력 받으면
		System.out.println("분을 입력하세요");
		Scanner sc = new Scanner(System.in);
		int q = sc.nextInt();
		System.out.println("초를 입력하세요.");
		int w = sc.nextInt();
	
		
		
		for(int m = 0; m < 60; m++) {// 단수
			for(int s = 0; s < 60; s++) {//1-9
				System.out.println(m + " 분 " + " : " + s +" 초 ");
					if(q == m && w == s) {
						m = 100; s = 100;
					}
					
			
			}//2포
			
		}//1포

	}

}
