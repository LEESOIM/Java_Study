package com.iu.loop;

import java.util.Scanner;

public class Loop5_ex1 {

	public static void main(String[] args) {
		//ID입력, PW입력
		//로그인 판단하여 성공하면 종료, 실패하면 다시 입력
		
		Scanner sc = new Scanner(System.in);
		int yId=1234;
		int yPw=5678;
		boolean check=true;
		
				
			while(check) {
				System.out.println("로그인 하시겠습니까? 1.예 2.아니오");
				int select = sc.nextInt();
				
				if(select==1) {
					System.out.println("아이디를 입력하세요");
					int id = sc.nextInt();
					System.out.println("비밀번호를 입력하세요");
					int pw = sc.nextInt();
					
					if(id==yId && pw==yPw) {
						System.out.println("로그인 성공!");
						check =! check; //반복문 종료 방법1
//						check = false;	//반복문 종료 방법2
//						break;			//반복문 종료 방법3
						
					} else {
						System.out.println("로그인 실패");
					}			
					
				}else {
					System.out.println("프로그램 종료");
					break;
				}
				
		}//while 끝
		
			
		//-----------------------------
		//로그인 안했으면 프로그램 종료
		//로그인 성공했으면 게임 시작
		//시작레벨 1 ~ 만렙 15
		//모든 몬스터의 경험치는 동일
		//레벨 1 -> 2 : 3마리
		//레벨 2 -> 3 : 6마리
		//레벨 3 -> 4 : 9마리
		//레벨 4 -> 5 : 12마리
		//...
		//레벨 14 -> 15 : 
		//gold 1000원
		//5레벨 달성시 축하금 1000원 지급
		//10레벨 달성시 축하금 2000원 지급
		//15레벨 달성시 축하금 3000원 지급
			
		
		
		if(check==false) {
			System.out.println("<<<<<<<<<<게임 시작>>>>>>>>>>");
			
			int monster=3;
			int gold=1000;
			
			for(int l=1;l<=15;l++) {
				
				System.out.println("1.몬스터 사냥하기");
				
				int input = sc.nextInt();
				if(input==1) {
					System.out.println("현재 레벨 : "+ (l));

					if(l<15) {
						System.out.println("몬스터 사냥 : "+monster+"마리");
						monster+=3;
						
						System.out.println("----ㅡㅡLEVEL UPㅡㅡ-----");	
				
					}
		
					if((l)%5==0) {
						System.out.println("💎"+gold+" Gold 지급💎");
						gold=gold+1000;
					}
					
				}
			}						
					

		}
	}

}
