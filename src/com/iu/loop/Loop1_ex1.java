package com.iu.loop;

import java.util.Scanner;

public class Loop1_ex1 {

	public static void main(String[] args) {
		// 0 ~ 9 출력하는 반복문
		// 단, 출력은 짝수만 출력	
		for(int i=0;i<10;i++) {
			if(i%2==0) {
				System.out.println(i);
			}
		}
		
		System.out.println("ㅡㅡㅡㅡㅡ");
		
		// if문을 사용하지 않고 출력
		for(int i=0;i<10;i+=2) {
			System.out.println(i);
		}
		
		System.out.println("ㅡㅡㅡㅡㅡ");
		
		for(int i=0;i<10;i++) {
			System.out.println(i);
			i++;
		}
		
		
		//멍멍 출력
		//출력하는 횟수를 입력 받기
		
		Scanner sc=new Scanner(System.in);
		
		System.out.println("횟수를 입력");
		int count = sc.nextInt();
		
		for(int i=0;i<count;i++) {
			System.out.println("멍멍");
		}
	}

}
