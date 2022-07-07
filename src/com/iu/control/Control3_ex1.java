package com.iu.control;

import java.util.Scanner;

public class Control3_ex1 {
	public static void main(String[] args) {
		//국어, 영어, 수학 입력
		//총점, 평균 계산
		//평균 90점 이상이면 A
		//평균 80점 이상이면 B
		//평균 70점 이상이면 C
		//평균 60점 이상이면 D
		//그 외 F
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수를 입력하세요");
		int kor=sc.nextInt();
		System.out.println("영어 점수를 입력하세요");
		int eng=sc.nextInt();
		System.out.println("수학 점수를 입력하세요");
		int math=sc.nextInt();
		
		int sum=kor+eng+math;
		int avg=sum/3;
		
		if(avg>=90) {
			System.out.println("A");
		} else if(avg>=80) {
			System.out.println("B");
		} else if(avg>=70) {
			System.out.println("C");
		} else if(avg>=60) {
			System.out.println("D");
		} else {
			System.out.println("F");
		}
		
		
	}
}
