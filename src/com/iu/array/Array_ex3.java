package com.iu.array;

import java.util.Scanner;

public class Array_ex3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			학교 성적 프로그램
//		1. 학생 정보 입력
//		-학생 인원 수를 입력하세요
//		-이름,번호,국어,영어,수학
//		-총점,평균
//		2, 학생 정보 조회
//		-모든 학생의 이름, 번호, 총점 , 평균 출력
//		3. 학생 정보 검색
//		-검색할 학생의 번호를 입력
//		-입력한 번호와 일치하는 학생의 모든 정보 출력
//		-없으면 없는 번호 입니다 출력
///		4. 학생 정보 삭제
//		-삭제할 학생의 번호를 입력
//		-입력한 번호와 일치하는 학생은 삭제한다(배열을 한칸 삭제)
//		-일치하는 번호가 없으면 없는 번호라 출력
//		5. 학생 정보 추가
//		-배열 한칸을 더 만듬(이름,번호,국어,영어,수학, 총점,평균)
//		6. 프로그램 종료
		Scanner sc = new Scanner(System.in);
		System.out.println("학생 정보\n 학생 인원 수를 입력하세요.");
		int count = sc.nextInt();//인원수
		String[] names = new String[count];//이름
		int[] number = new int [names.length];//번호
		int[] k = new int [names.length];//국어
		int[] e = new int [names.length];//영어
		int[] m = new int [names.length];//수학
		int[] age = new int [names.length];//총점
		int[] aver= new int [names.length];//평균
		
		for(int i = 0; i<count; i++)
		{
			System.out.println(i + 1 + "이름 입력");
			names[i] = sc.next();
		}
		for(int i = 0; i<count; i++)
		{
			System.out.println(i + 1 + "번호를 입력하세요");
			number[i] = sc.nextInt();
		}
		 for(int i = 0; i<count; i++)
		{
			System.out.println(i + 1 + "국어 점수를 입력하세요");
			k[i] = sc.nextInt();
		}
		 for(int i = 0; i<count; i++)
		{
			System.out.println(i + 1 + "영어 점수를 입력하세요");
			e[i] = sc.nextInt();
		}
		 for(int i = 0; i<count; i++)
		{
			System.out.println(i + 1 + "수학 점수를 입력하세요");
			m[i] = sc.nextInt();
		}
		 for(int i = 0; i<count; i++)
		{
			
			System.out.println(names[i] + "총점");
			System.out.println("총점은 " + (k[i] + e[i] + m[i]) + "점 입니다.");
		}
		 for(int i = 0; i<count; i++)
		{
			 int q = ((k[i] + e[i] + m[i])/3);
			System.out.println(names[i] + "평균은 " + q + "점 입니다.");
		
		}
		 System.out.println("1.학생 정보 입력\n2.학생 정보 검색\n3.학생 정보 삭제\n4.학생 정보 추가\n5.프로그램 종료");
		 int w = sc.nextInt();
		 
		 
		 if (w == 1)		 
		 {System.out.println("학생 정보를 조회합니다.");
			 for(int i = 0; i<count; i++) 
			 {
			System.out.println("이름 : " + names[i] +"\t" + "번호 : " + number[i]+"\n" + "총점 : " +(k[i] + e[i] + m[i])+"\t" + "평균 : " + ((k[i] + e[i] + m[i])/3) );
			 }
			 } else if (w == 2)
		 {
		 System.out.println("학생 정보를 검색합니다.");
		 for(int i = 0; i<count; i++)
		 {
			 System.out.println("학생 번호를 입력해 주세요.");
			 int z = sc.nextInt();
			 if (z == number[i]) 
			 {
				 System.out.println("이름 : " + names[i] +"\t" + "번호 : " + number[i]+"\n" + "국어 : " + k[i] + "\n영어 : " + e[i] + "\n수학 : " + m[i] + "\n총점 : " +(k[i] + e[i] + m[i])+"\t" + "평균 : " + ((k[i] + e[i] + m[i])/3) );
			 }else if(z != number[i])
			 {
				 System.out.println("없는 번호 입니다.");
			 } 
		 }
		 }else if(w == 3)
		 {
			 System.out.println("학생 정보를 삭제합니다.");
			 for(int i = 0; i<count; i++) {
				 System.out.println("삭제할 학생의 번호를 입력하세요.");
			 int x = sc.nextInt();
			 	if(x == number[i])
			 	{
			 		
			 	}
			 }
			  
		 }else if (w == 4)
		 {
			System.out.println("학생 정보를 추가합니다."); 
			w = sc.nextInt();
			boolean flag = false;
			String[] namesCopy = null;
			int [] numberCopy = null;
			int [] kCopy = null;
			int [] eCopy = null;
			int [] mCopy = null;
			int [] ageCopy = null;
			int [] averCopy = null;
			int i = 0;
			for (i = 0; i < names.length; i++)
			{
				if (w == number[i]) 
				{
					flag= !flag;
					break;
				}
			}
			if(flag)
			{
				namesCopy = new String [names.length-1];
				numberCopy = new int [names.length];
				kCopy = new int [names.length];
				eCopy = new int [names.length];
				mCopy = new int [names.length];
				ageCopy = new int [names.length];
				averCopy = new int [names.length];
				int index = 0;
				for(int j = 0; j<names.length; j++)
				{
					if (j == 1) 
					{
//						index--;
						continue;
					}
					namesCopy[index] = names[j];
					number[index] = number[j];
					k[index] = k[j];
					e[index] = e[j];
					m[index] = m[j];
					age[index] = age[j];
					aver[index] = aver[j];
					index--;
				}
				names = namesCopy;
				number = numberCopy;
				k = kCopy;
				e = eCopy;
				m = mCopy;
				age = ageCopy;
				aver = averCopy;			
			}
			else
			{
				System.out.println("일치하는 학생 정보 없음");
			}
			System.out.println("학생 정보 삭제가 완료되었습니다.");
		 }else if(w == 5)
		 {
			 System.out.println("프로그램을 종료합니다.");
		 }
	
	
	
		
		
	}//main
}//class
