package com.iu.array;

public class Array_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] nums = new int[3];
		nums[0] = 100;
		nums[1] = 200;
		nums[2] = 300;
		
		int[] nums2 = nums;//이런 것을 얕은 복사라 함
		System.out.println(nums2[0]);
		nums2[0] = 99;
		System.out.println(nums[0]);
		

	}

}
