package com.iu.loop;

import java.util.Scanner;

public class Loop4_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		FPS
//		총알 : 30발, 3개
		
//		1. 단발 2. 점사
//    소리 탕.
			Scanner sc = new Scanner(System.in);
			for(int q = 0; q < 3; q++) {
			System.out.println("1번\'단발\'  2번\'점사\' 선택하세요");
			
			 int num = sc.nextInt();	 
			String tang = "탕";
			String tang2 = "탕탕탕\t";
			
				if(num == 1) {
					
					for(int i = 0; i <= 30; i++) 
						System.out.print(tang);
					} else {
						for(int j = 0; j <= 10; j++) 
							System.out.print(tang2);
						
					}
			}
//	==================================================================강사님 풀이1.
//						Scanner sc = new Scanner(System.in);
//						for(int mag = 0; mag < 3; mag++) {
						
//						System.out.println("1. 단발 2.점사");
//						int select = sc.nextInt();
//						if(select == 1) {
//							fot(int b = 0; b < 30; b++)
//						System.out.println("탄창 : " + mag + " 총알:" + b + "탕");
//							
//						}else {
//							fot(int b = 0; b < 10; b++)
//						System.out.println("탄창 : " + mag + " 총알:" + b + "탕탕탕");
//							
//						}
//===================================================================================2.
//			Scanner sc = new Scanner(System.in);	 
//			for(int mag = 0; mag < 3; mag++) {
//				System.out.println("1단발 2점사");
//				 int select = sc.nextInt();
//				 int count = 10;
//				 String sound = "탕탕탕";
//				 if(select == 1) {
//					 count = 30;
//					 sound = "탕";
//				 }
//				for (int b = 0; b<count; b++) {
//					System.out.println(sound);
//			}
//						
//					
//		}
//	}
//====================================================================================3.
//			Scanner sc = new Scanner(System.in);	 
//			for(int mag = 0; mag < 3; mag++) {
//				System.out.println("1단발 2점사");
//				 int select = sc.nextInt();
//				int inc = 3;
//				String sound = "탕탕탕";
//				if(select == 1) {
//					inc = 1;
//					sound = "탕";
//				}
//				for(int b = 0; b<3; b+=inc) {
//					System.out.println(sound);
//				}
//======================================================================================			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
			
	}			

}
