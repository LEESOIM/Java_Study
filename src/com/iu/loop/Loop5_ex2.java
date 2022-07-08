package com.iu.loop;

import java.util.Random;
import java.util.Scanner;

public class Loop5_ex2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random random = new Random();
//		nexInt(정수) : 0부터 입력한 정수 미만 범위에서 무작위 정수를 뽑아준다
//		int num=random.nextInt(10);
//		System.out.println(num);
		
		//0 : 가위  1
		//1 : 바위  2
		//2 : 보   0
		//사용자가 하나 입력, 컴퓨터가 하나 뽑아서 두개 비교
		//사용자가 이길 경우만 종료
		//비기거나 지면 다시 실행

		boolean check = true;	
		
		while(check) {
			System.out.println("0.✌ 1.✊ 2.🖐");		
			int user = sc.nextInt();
			int com = random.nextInt(3);
			String user_str = Integer.toString(user);
			String com_str = Integer.toString(com);
			
			if(user==0) {
				user_str="✌";
			}else if(user==1) {
				user_str="✊";
			}else {
				user_str="🖐";
			}
				
			if(com==0) {
				com_str="✌";
			}else if(com==1) { 
				com_str="✊";
			}else {
				com_str="🖐";
			}
						
			
			System.out.println("사용자 "+user_str+" vs 컴퓨터 "+com_str);
			
			if(user==com+1) {
				System.out.println(">>> YOU WIN");
				break;			
			}else if(user==0&&com==2) {
				System.out.println(">>> YOU WIN");
				break;
			}else if(user==com) {
				System.out.println(">>> 비겼다링");
				System.out.println();
			}else {
				System.out.println(">>> 저부려쓰ㅠㅠ");
				System.out.println();
			}

			
		}
		

	}

}
