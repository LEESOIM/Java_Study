package com.iu.loop;

import java.lang.reflect.WildcardType;
import java.util.Scanner;

public class Loop5 {

	public static void main(String[] args) {
		// while문 : 반복 해야할 횟수가 정해져 있지 않을 때 사용
		
//		int i=0;
//		
//		while(i<5) {
//			System.out.println("Hello World");
//			i++;
//		}
		
		Scanner sc = new Scanner(System.in);
		
		boolean check = true;
		
		while(check) {
			System.out.println("1.성적입력");
			System.out.println("2.총점계산");
			System.out.println("3.평균계산");
			System.out.println("4.종료");
			
			int select=sc.nextInt();
			if(select==1) {
				System.out.println("성적입력 선택");
			}else if(select==2) {
				System.out.println("총점계산 선택");
			}else if(select==3) {
				System.out.println("평균계산 선택");
			}else if(select==4){
				System.out.println("종료 선택");
//				check =! check; //반복문 종료 방법1
//				check = false;	//반복문 종료 방법2
				break;			//반복문 종료 방법3
			}else {
				System.out.println("1-4만 선택 가능");
			}
		}

	}

}
