package com.iu.control;

import java.util.Scanner;

public class Control2_ex1 {

	public static void main(String[] args) {
		//월급을 입력
		//1.정규직 2.계약직
		//정규직 - 국민연금 1%, 건강보험 1.4%, 고용보험 0.5%, 산재보험 0.7%
		//계약직 - 3.3%
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("월급을 입력하세요");
		double pay=sc.nextDouble();
		
		System.out.println("정규직이면 1, 계약직이면 2");
		int duty=sc.nextInt();
		
		if(duty==1) {
			//정규직 급여 계산
			pay=pay-(pay*0.01)-(pay*0.014)-(pay*0.005)-(pay*0.007);
			System.out.println("실급여는 "+(int)pay+"원");
		} else {
			//계약직 급여 계산
			pay=pay-(pay*0.033);
			System.out.println("실급여는 "+(int)pay+"원");
		}
		
	}
}
