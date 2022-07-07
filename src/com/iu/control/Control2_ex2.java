package com.iu.control;

import java.util.Scanner;

public class Control2_ex2 {

	public static void main(String[] args) {
		//num=1 a -> b
		//num=2 a -> c
		//num=1 z -> a
		//num=2 z -> b
		//a(97) z(122)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1 ~ 5 사이의 숫자를 입력");
		int num = sc.nextInt();	
		
		System.out.println("알파벳을 입력");
		char ch = sc.next().charAt(0);	
		
		ch = (char)(ch+num);
		
		if((int)ch>122) {
			ch='a';
			ch= (char)(ch+num-1);		
		}
		
		System.out.print("ch -> "+ch);
		

		//스터디에디션히히히히히히히히
		//아무거나
		

	}

}
