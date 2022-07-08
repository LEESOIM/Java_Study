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
			
			boolean flag=false;
			
			for(int s=0;s<60;s++) {
				System.out.println(m+"분 "+s+"초");
				
				if(s==sec && m==min) {
					flag=!flag; //if가 성립되면 true가 된다
//					m=60;	//방법1
					break; //안쪽 반복문만 종료
				}
				
			}//안쪽 for		
			
			if(flag) { 		//방법2
				break;
			}

			
//			if(m==min) {	//방법3?
//			break;
//		}
			
			
		}//바깥쪽 for

			
		
		
	}

}
