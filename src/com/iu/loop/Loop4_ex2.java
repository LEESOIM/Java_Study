package com.iu.loop;

import java.util.Scanner;

public class Loop4_ex2 {

	public static void main(String[] args) {
		//FBS
		//총알 : 탕 출력
		//탄창 : 30발, 3개
		//1. 단발은 30번 	2. 점사는 10번(3발씩 나감)
		
		Scanner sc = new Scanner(System.in);	
		
		for(int count=0;count<3;count++) {
			
			System.out.println("1.단발  2.점사");
			int num = sc.nextInt();
			
			if(num==1) {
				for(int i=0;i<30;i++) { //단발
					 System.out.println(i+1 +".탕💥");
				 }
			} else {
				for(int i=0;i<10;i++) { //점사
					System.out.println(i+1 +".탕💥 탕💥 탕💥");
				 }
			}
			
			if(count<2) {
				System.out.println("----------재충전----------");
			}
			
		}//count
		

	}
	

}
