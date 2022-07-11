package com.iu.array;

import java.util.Scanner;

public class Array_4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//배열은 for문과 잘 맞음
		Scanner sc = new Scanner(System.in);
		
		int[] nums = new int[5];
		
		for(int i=0; i<nums.length; i++) 
		{
			System.out.println(i + " 번 인덱스 값 입력하세요.");
			nums[i] = sc.nextInt();
		}
			for(int i = 0; i<nums.length; i++)
			{
				System.out.println("인덱스 값 : " + nums[i] + "입니다.");
			}
//			System.out.println("0번 인덱스 값 :" + nums[0] + "입니다.");
//			System.out.println("1번 인덱스 값 :" + nums[1] + "입니다.");

	}

}
