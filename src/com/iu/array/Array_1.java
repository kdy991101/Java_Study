package com.iu.array;

import java.util.Scanner;

public class Array_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		변수 선언 공식
//		데이터 타입 변수명;
//		String name;
//		Scanner sc;
//		배열 선언
//		배열은 모으려고하는 데이터타입[] 변수명
		int age = 30;
//		기본타입 = 실제 값이 담겨있음
//		참조타입 = 실제 값이 담긴 주소가 저장되는 것
		int[] nums = new int[3]; //nums는 int타입이 아님
		char[] names = new char[3];
		
		nums[0] = 10;
		nums[1] = 30;
//		or
//		nums[1] = age;
		nums[2] = 50;
		System.out.println(age);
		System.out.println(nums);
//		결과값 = [I@515f550a @뒤에가 주솜임
		System.out.println(nums[0]);
		System.out.println(nums[1]);
		System.out.println(nums[2]);
		
		names[0] = '김';
		names[1] = '도';
		names[2] = '영';
		System.out.print(names[0]);
		System.out.print(names[1]);
		System.out.println(names[2]);
		
	}

}
