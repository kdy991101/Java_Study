package com.iu.loop;

import java.util.Scanner;

public class Loop5_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
// 로그인을 안했으면 프로그램이 종료
// 로그인 성공 게임이 시작
//			RPG
//	시작 레벨은 1
//	만랩 15
//	골드 시작 천원
//	5랩 달성시 천원
//	10랩 달성시 2천원
//	15랩 달성시 3천원
//	모든 몬스터의 경험치는 동일
//	1 -> 2 : 3
//	2 -> 3 : 6
//	3 -> 4 : 9
//	4 -> 5 : 12
//	14 -> 15 : ?? 
//	
		Scanner sc = new Scanner(System.in);
		int yid = 12;
		int ypw = 12;

		boolean ch = true;

		while (ch) {
			System.out.println("게임을 시작하려면 1을 누르세요.");
			int num2 = sc.nextInt();
			if (num2 == 1)
				System.out.println("1. 로그인 2. 뒤로가기");
			int num = sc.nextInt();

			int q = 1;
			int w = 2;
			int won = 1000;
			int nuu = 0;

			if (num == q) {
				System.out.println("ID입력하세요");
				int p = sc.nextInt();

				System.out.println("PW입력");
				int m = sc.nextInt();

				if (p == yid && m == ypw) {
					System.out.println("로그인 성공");

					for (int i = 1; i <= 15; i++) {
						System.out.println("랩업을 축하합니다! " + i + "랩 입니다.");

						for (int exp = 1; exp <= 3 * i; exp++) {
							nuu++;
							System.out.println(exp + "몬스터를 처치하였습니다.");
							System.out.println("누적 처치 몬스터 :" + nuu);

							if (i % 5 == 0) {
								System.out.println("골드:" + ((i / 5) * 1000));
								won += ((i / 5) * 1000);
								break;
							}
							nuu = exp;
						}
					}
					System.out.println("보유 골드:" + won + "원");
				}
				break;
			} else {
				System.out.println("실패");
			}
		}
	}
}
