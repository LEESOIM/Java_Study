package com.iu.loop;

public class Loop3 {

	public static void main(String[] args) {
		//반복문 보조문
		//1. break
		//		반복문 내에서 break를 만나면 그 즉시 반복문 종료


		for(int i=0;i<5;i++) {
			System.out.println("1.대문자 2.소문자 3.종료");
	
			
			
			int select=1;
			switch(select) {
			case 1:
				System.out.println("대문자");
				break; //switch-case만 벗어남 -> for 반복문 종료 안됨

			case 2:
				System.out.println("소문자");
				break;
			default:
				System.out.println("종료");
			}
			
		}
		
		

	}

}
