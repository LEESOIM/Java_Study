package com.iu.loop;

import java.util.Scanner;

public class Loop1_ex2 {

	public static void main(String[] args) {
		//1. 1번 대문자, 2번 소문자
		//	 1번이면 A - Z 출력
		// 	 2번이면 a - z 출력

		Scanner sc = new Scanner(System.in);
		
		System.out.println("1.대문자 2.소문자");
		int num=sc.nextInt();
		
		switch(num) {
		case 1 :
			for(char i='A';i<='Z';i++) {
				System.out.println(i);
			}
			break;
		case 2 :
			for(char i='a';i<='z';i++) {
				System.out.println(i);
			}
			break;
		}
		
		
		//2. 1~10까지의 합 구하기

		int hap=0;
		for(int i=0;i<=10;i++) {
			hap+=i;
		}
		System.out.println("1 ~ 10까지의 합은 "+hap);
		
		
		
		//3. ID, PW입력해서 로그인 판단 - 최대 5번까지 시도 가능
		//   로그인 성공하면 즉시 종료
		
		int yId=1234;
		int yPw=5678;
		boolean check=false;
		int i=0;
		for(i=0; i<5; i++) {
			System.out.println("ID를 입력하세요");
			int id=sc.nextInt();
			
			System.out.println("PW를 입력하세요");
			int pw=sc.nextInt();
						
			if(id == yId && pw == yPw) {
				System.out.println("로그인 성공!"); 
				i=10;
				check =! check;
				break;
				
			} else {
				System.out.println("로그인 실패");
			}	
		}//for문 끝
		
		
		//1.로그인 성공
		//2.로그인 5번 전부 실패
//		if(i==5) {
//			System.out.println(">> 고객센터 문의");
//		}else {
//			System.out.println(">> 게임 시작");
//		}
		
		if(check) {
			System.out.println(">> 게임 시작");
		}else {
			System.out.println(">> 고객센터 문의");
		}
	
	}

}
