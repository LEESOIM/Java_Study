package com.iu.control;

import java.util.Scanner;

public class Control4_ex1 {

	public static void main(String[] args) {
		//국어, 영어, 수학 입력
		//총점, 평균 계산
		//평균 90점 이상이면 A
		//평균 80점 이상이면 B
		//평균 70점 이상이면 C
		//평균 60점 이상이면 D
		//그 외 F
		
		Scanner sc = new Scanner(System.in);
		
		int kor=sc.nextInt();
		int eng=sc.nextInt();
		int math=sc.nextInt();
		int sum=kor+eng+math;
		int avg=sum/3;
		
		
		switch(avg/10) { //공통점을 찾아라!!
		case 10:
			System.out.println("A+");
			break;
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
			break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
		default :
			System.out.println("F");
		}

	}

}
