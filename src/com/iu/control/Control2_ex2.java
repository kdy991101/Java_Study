package com.iu.control;

import java.util.Scanner;

public class Control2_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
		Scanner sc = new Scanner(System.in);
			System.out.println("오늘의숫자1~5");
				int num = sc.nextInt();
			System.out.println("알파벳 입력");
				char ch = sc.next().charAt(0);
				
				int result = ch + num;
//				소문자가 범위를 벗어났을 때
				if(result > 122) { //122말고 z를 넣어도 상관없음
					result = result - 122 -1; //2
					result = 96 + result;//96말고 a상관없음
				}
				
//				대문자가 범위를 벗어났을 때
				if(result > 'Z' && result < 'a') {
					result = result - 'Z' -1 ;
					result = 'A' + result;
				}
				
				ch = (char)result;
				System.out.println("ch : " + ch);
//			========================================위에는 강사님 풀이	
//				
//				if(num == 1) {
//					ch +=1;
//				} else if(num == 2) {
//					ch +=2;
//				} else if(num == 3) {
//					ch +=3;
//				} else if(num == 4) {
//					ch +=4;
//				} else if(num == 5) {
//					ch +=5;
//				}
//				if(ch>=122) {
//					ch -= 26;
//				}
//				System.out.println(ch);
//			 
//			 
//			 study
// 			home
		
	}

}
