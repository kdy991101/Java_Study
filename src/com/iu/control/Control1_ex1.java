package com.iu.control;

import java.util.Scanner;

public class Control1_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			키보드로부터, 국어, 영어, 수학 차례로 입력 총점 평균 계산
//			평균이 90점 이상이면 우등상을 수상
//			모든 학생들은 졸업
//			평균이 90점 이상이면 a학점
//			평균이 80점 이상이면 b학점
//			평균이 70점 이상이면 c학점
//			평균이 60점 이상이면 d학점
//			그 외 나머지는 f학점
		Scanner sc = new Scanner(System.in);

		System.out.println("국어 점수를 입력하세요.");
		int k = sc.nextInt();
		System.out.println("영어 점수를 입력하세요.");
		int e = sc.nextInt();
		System.out.println("수학 점수를 입력하세요.");
		int m = sc.nextInt();
		System.out.println("총점은" + (k + e + m) + "점 입니다.");
		
		
		int avg = ((k + e + m)/3);
		
		System.out.println("평균은" + (avg) + "입니다.");
		
		if(avg >= 90) {
		System.out.println("학점 A 입니다.");
		}
		if(avg >= 80 && avg < 90) {
		System.out.println("학점 B 입니다.");
		}
		if(avg >= 70 && avg < 80) {
		System.out.println("학점 C 입니다.");
		}
		if(avg >= 60 && avg < 70) {
		System.out.println("학점 D 입니다.");
		}
		if(avg < 60 ) {
		System.out.println("학점 f 입니다.");
		}
		
		System.out.println("졸업을 축하합니다!");
	
		
		
		
	


	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	}

}
