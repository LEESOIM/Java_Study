package com.iu.array;

import java.util.Scanner;

public class Array_1 {

	public static void main(String[] args) {
		// 변수 선언 공식
		// 데이터타입 변수명;
		String name;
		Scanner sc;
		int age = 30; 
		
		// 배열 선언
		// 모으려고하는 데이터타입 [] 변수명;
		int [] nums = new int [3]; //3가지 정수형을 모으려고 한다(4바이트씩)
								//프리미티브 타입이 아닌 레퍼런스 타입(실제 값을 가르키는 주소가 들어있음)
		//Heap에 int타입 3개를 만듦 -> Heap에서 만들어진 주소를 nums(Stack)에 담아라
		//Heap 영역에는 실제 데이터가 있음
		//Stack(nums)에는 Heap을 가르키는 메모리 주소가 들어있음
	
		System.out.println(age); //30 -> 프리미티브 타입
		System.out.println(nums); // [I@37d31475 -> 레퍼런스 타입
								// [:배열 I:정수타입 @뒤:메모리주소
		nums[0] = 10;
		nums[1] = age;
		nums[2] = 50;
		System.out.println(nums[0]); //10
		System.out.println(nums[1]); //30
		System.out.println(nums[2]); //50
		
//		자바는 메모리 영역이 크게 3가지로 구분
//		1. Method - main Method : 로딩(실행)파일
//		2. Stack - main Method가 Stack에 차곡차곡 쌓인다 First In Last Out(LIFO)		
//		3. Heap - new 라고 선언된 부분이 연속으로 만들어짐

		
		
		char [] names = new char [2];
		System.out.println(names);
		System.out.println(names.toString());
		System.out.println(names.hashCode());
		
		String [] names2 = new String[3];
		System.out.println(names2);
		
//		names[0] = 'S';
//		names[1] = 'I';
//		System.out.println(names[0]);
//		System.out.println(names[1]);

		
	}

}
