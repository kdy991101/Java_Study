package com.iu.control;

import java.util.Scanner;

public class Control3_ex1 {
//    if else = 다중 조건문
	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			국어 영어 수학 입력
//		총점 푱균 계산
//	평균이 90점 이상이면 a
//	평균이 80점 이상이면 b
//	평균이 70점 이상이면 c
//	평균이 60점 이상이면 d
//	평균이 그 외 f
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요.");
		int k = sc.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		int e = sc.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		int m = sc.nextInt();
		System.out.println("총점은" + (k + e + m) + "점 입니다.");
		
		int avg = ((k + e + m)/3);
		
		System.out.println("평균은 >> " + avg + "입니다.");
		
		if(avg >89) {
			System.out.println("학점 A 입니다.");
		}else if(avg > 79 && avg < 89) {
			System.out.println("학점 B 입니다.");
		}else if(avg > 69 && avg < 79) {
			System.out.println("학점 C 입니다.");
		}else if(avg > 59 && avg < 69) {
			System.out.println("학점 D 입니다.");
		}else {
			System.out.println("학점 F 입니다.");
		}
//		==============================아래 강사님 풀이
//		double svg = 90.3;
//		
//		if(svg >= 90) {
//			System.out.println("A");
//			
//		}else if (avg >= 80) {
//			System.out.println("B");
//		}else if (avg >= 70) {
//			System.out.println("C");
//		}else if (avg >= 60) {
//			System.out.println("D");
//		}else  {
//			System.out.println("F");
//		
	}

}
