package com.iu.array;

import java.util.Random;
import java.util.Scanner;

public class Array_ex2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		몬스터 생성
		Random random = new Random(4);
		Scanner sc = new Scanner(System.in);
		String[] monNames = {"고블린", "오크", "트롤", "골렘"};
		int [] monHp = {5, 7, 10, 15};
		int count;
//		몬스터 파티 생성
//		몬스터 수 입력 1~4
//		입력한 수만큼 몬스터를 랜덤라게 뽑고 출력
		System.out.println("몬스터 수를 입력하세요");
		count = sc.nextInt();
		System.out.println("입력하신 몬스터 수 :" + count);
		String[] monPartyNames = new String[count];
		int[] monPartyHp = new int[count];
		
		for(int i = 0; i < monPartyNames.length; i++ ) 
		{
			int index = random.nextInt(4);
			monPartyNames[i] = monNames[index];
			monPartyHp[i] = monHp[index];
		}
		for(int i = 0; i<monPartyNames.length; i++)
		{
			System.out.println("몬스터 이름 :" + monPartyNames[i] + "\nHP :" + monPartyHp[i]);
		}
	}

}
