package com.iu.loop;

public class Loop4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
			for(int i = 2; i < 10; i++) {// 단수
				for(int j = 1; j < 10; j++) {//1-9
					System.out.println(i + " * " + j +" = " + i*j);
				}//2포
				
			}//1포
			System.out.println("=====================================================");
		for(int y = 0; y < 3; y++) {
			for(int d = 0; d < 4; d++) {
				System.out.print("*");
			}//4포
			System.out.println("");
			}//3포
		System.out.println("=====================================================");
	for(int w = 1; w < 5; w++) {
		for(int q = 0; q < w; q++) {
			System.out.print("*");
		}//6포
		System.out.println("");
	}//5초
	}//매인

}//클래스
