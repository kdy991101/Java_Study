package com.iu.loop;

import java.util.Scanner;

public class Loop1_ex2_1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//1-10까지의 합
//1-10까지의 합
		
		
		Scanner sc = new Scanner(System.in);
		int sum = 0;
		for(int i = 1; i <=10; i++) {
			sum += i;
		}
		System.out.println("1부터10까지의 합은" + sum + "입니다.");
	
	
	int num = 0;
	for(int sta = 1; sta < 11; sta++) {
		num +=sta;
		System.out.println(num);
	}
	}

}
