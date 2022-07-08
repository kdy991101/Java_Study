package com.iu.loop;

import java.util.Random;
import java.util.Scanner;

public class Loop5_ex2 {

	public static void main(String[] args) {
//		nextInt() : 0부터 입력한 정수 미만 범위애서 무작위 정수를 뽑아줌	
//		0 = 가위, 1 = 주먹, 2 = 보
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
		
		boolean check = true;
		
		while(check) {
		System.out.println("컴퓨터와 가위\'0\',바위\'1\',보\'2\' 하기 \n숫자를 입력하세요.");
		int me = sc.nextInt();
		int com = random.nextInt(3);
		System.out.println("나 : " + me);
		System.out.println("컴퓨터 : " + com);
		 	if(me - com == 1 || me - com == -2) {
		 		System.out.println("승리하였습니다.");
		 		break;
		 	}else if(me == com) {
		 			System.out.println("비겼습니다 다시하세요");
		 		}else 
		 			System.out.println("패배..다시하세요");		
		}
	}

}
