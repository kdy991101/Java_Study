package com.iu.array;

import java.util.Scanner;

public class Array_2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//			배열은 어떤 데이터타입이든 상관 없음\
//		모으려고 하는 데이터타입 [] 변수명 = new모을려고하는 데이터 타입[n]
		String[] names = new String[3];
		int[] nums = new int[3];
		Scanner[] sc = new Scanner[3];
		
		System.out.println(names[0]);
		System.out.println(nums[0]);
		System.out.println(sc[0]);
//		힙 영역은 별도 지시가 없으면 자동으로 값을 초기화 시킴
		
		int [] nums2 = {1, 4, 52};
//		배열 3칸을 만들면서 값 저장을 동시
		System.out.println(nums2[0]);
		
		int nums3 []; // 대괄호를 뒤에 작성하는 것도 가능하긴 하지만 비추
		
	}

}
