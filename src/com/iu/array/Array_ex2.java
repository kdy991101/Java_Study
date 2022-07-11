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
		
//		(마법사)캐릭터 이름 설정
		System.out.println("캐릭터 이름 생성");
		String name = sc.next();
		System.out.println("회원님의 닉네임은 \'" + name + "\'입니다.");
		
//		스킬 파이어볼
//		공격력 6
		
//		몬스터 파티 생성
//		몬스터 수 입력 1~4
//		입력한 수만큼 몬스터를 랜덤하게 뽑고 출력
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
//		1회성 공격
//		0~6미만의 랜덤한 데미지로 공격
		boolean check = true;
		
		int ok;
		
		for(int i = 0; i<monPartyNames.length; i++)
		{
			System.out.println("몬스터 이름 :\'" + monPartyNames[i] + "\'\nHP :" + monPartyHp[i]);
		}
		while(check)
		{
			int death = 0;
		System.out.println("공격 하시겠습니까?");
		ok = sc.nextInt();
		if(ok == 1)
		{
			//int q;
			for(int i = 0; i<monPartyNames.length; i++) 
			{
				int magicPower = random.nextInt(6);
			System.out.println("\'" + monPartyNames[i] + "\'을(를) 공격합니다");
			monPartyHp[i] -= magicPower;
			System.out.println("데미지" + magicPower +"만큼 들어갔습니다\n" + "몬스터의 남은 HP :" + monPartyHp[i] + "입니다.");
			if(monPartyHp[i] < 1)
			{
				death++;
				System.out.println("처치한 수" + death);
			}
		}
	}
			
				
			}
			
		
	}//main

}//class
