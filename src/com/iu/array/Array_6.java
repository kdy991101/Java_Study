package com.iu.array;

public class Array_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		배열 길이 변경 원래는 불가능함
//		하고싶으면 새로운 배열을 만들어야 함
		int [] nums = {1, 2, 3}; // int[] nums = new int [3];
		int [] copy = new int[nums.length-1];
		
		for(int i = 0; i<copy.length; i++)
		{
			copy[i] = nums[i];
		}
		
		nums = copy;
		
		System.out.println(nums.length);
		
		for(int i = 0; i<nums.length; i++)
		{
			System.out.println(nums[i]);
		}
	}

}
