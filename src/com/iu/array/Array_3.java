package com.iu.array;

import java.util.ArrayList;

public class Array_3 {

	public static void main(String[] args) {
		
		class StringBufferEx {

		      public static void main (String [] args) {

		StringBuffer a = new StringBuffer ("A");

		StringBuffer b = new StringBuffer ("B");

		operate (a, b);

		System.out.println(a + "," +b);

		     }

		     static void operate (StringBuffer x, StringBuffer y) {

		x.append (y);

		y = x;

		      }

		}
		

	}

}
