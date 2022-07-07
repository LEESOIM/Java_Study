package com.iu.loop;

import java.util.Scanner;

public class Loop4_ex1 {

	public static void main(String[] args) {
		//0분 0초부터 59분 59초
		//분과 초를 입력받아서 그 시간에 종료
		//ex) 1, 15
		
		Scanner sc = new Scanner(System.in);
		int min = sc.nextInt();
		int sec = sc.nextInt();

		
		for(int m=0;m<60;m++) {
			
			for(int s=0;s<60;s++) {
				
				System.out.println(m+"분 "+s+"초");
				
				if(s==sec && m==min) {
					break;
				}
				
			}//안쪽 for		
			
				
			if(m==min) {	
				break;
			}
			
			
		}//바깥쪽 for

	}

}
