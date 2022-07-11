package com.iu.array;

public class Array_5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub	
		int [] nums1 = {1, 2, 3};
		System.out.println(nums1.length);
		int [] nums2 = nums1;
		System.out.println(nums2.length);
//	얕은 복사라 부름 주소만 복사 같은 배열을 가지고 있음 
		
		int[] nums3 = new int [3];
		for(int i = 0; i<nums1.length; i++)
		{
			nums3[i] = nums1[i];
		}
		nums2[0] = 9;
		System.out.println(nums1[0]);
		
		nums3[0] = 100;
		System.out.println(nums1[0]);
		System.out.println(nums3.length);
		nums3 = new int [5];
		System.out.println(nums3[0]);
//		깊은 복사 번지 주소가 다름 새로운 배열을 만들어 힙 영역을 복사
	}

}
