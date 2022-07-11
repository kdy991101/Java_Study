package com.iu.array;

import java.util.Scanner;

public class Array_ex1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//키보드로부터 인원수를 입력받아서
//		인원수 만큼 이름을 입력 받아서
//		마지막에 이름들을 출력
//		Scanner sc = new Scanner(System.in);
//		 
//		String[] names = new String[2];
//		for(int i = 0; i<=names.length; i++)
//		{
//			System.out.println("인원수 :" + i);
//			names[i] = sc.next();
//			
//		}
//		System.out.println();
//		//=================================강사님
//		각 학생의 이름별로 국어 점수를 입력 후 출력
		Scanner sc = new Scanner(System.in);
		System.out.println("인원수를 입력하세요");
		int count = sc.nextInt();
		int total_kor = 0;
		String[] names = new String[count];
		int[] kor = new int[names.length];
		
		for(int i=0; i<names.length; i++)
		{
			System.out.println(i + 1 + "번 이름 입력");
			names[i] = sc.next();
		}
		for(int i = 0; i<names.length; i++)
		{
			System.out.print(names[i] + "\n");
		}
		for(int i=0; i<names.length; i++)
		{
			total_kor = total_kor + kor[i];
		}
			for(int i=0; i<kor.length; i++)
			{
				System.out.println(names[i] + "국어 점수를 입력하세여");
//			국어 점수 총점을 계산하고 출력
			kor[i] = sc.nextInt();
			}
			System.out.println("국어 총점은 :" + total_kor);
			
		}
		
	}


