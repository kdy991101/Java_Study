package com.iu.array;

public class Array_7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] ar = {4, 7, 1, 3, 9};
		//내림차순 9 7 4 3 1
		for(int i = 0; i < ar.length-1; i++)//전체 
		{
//			i = 0; , 1234
//			i = 1; , 234
//			i = 2; , 34
//			i = 3; , 4
			for(int j = i+1; j<ar.length; j++)
			{
				if(ar[i] < ar[j])
				{
					//빈 공간 하나를 만들어 미리 옮겨준 뒤 나중에 값을 가져옴
					int tmp = ar[j];
					ar[j] = ar[i];
					ar[i] = tmp;
				}
			}
		}
		
		for(int i = 0; i<ar.length; i++)
		{
			System.out.println(ar[i]);
		}

	}

}
