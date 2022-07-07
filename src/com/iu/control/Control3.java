package com.iu.control;

import java.util.Scanner;

public class Control3 {

	public static void main(String[] args) {
		
		int num = 10; // 1)지역 변수 : 클래스 영역을 제외한 {메서드} 안에 선언된 변수
		
		//int num = 1;  오류 >> 중복선언
		
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1 ~ 3 숫자 입력");
		
		int select = sc.nextInt();
		
		
		
		if(select==1) {
			int count = 1; // 2)지역변수 -> {해당 지역}에서만 사용 가능, {해당 영역}이 끝나면 메모리에서 같이 종료
			
			System.out.println("1 선택");
			
		}else if(select==2) {
			int count = 1; //지역변수
			
			System.out.println("2 선택");
			
		}else {
			int count = 1; //지역변수
			
			System.out.println("3 선택");
			
		}
		
		System.out.println(num);
		
		
		//System.out.println(count); 오류 >> {해당영역} 종료되면 변수들도 사라짐

	}

}
