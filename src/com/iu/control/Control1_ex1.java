package com.iu.control;

import java.util.Scanner;

public class Control1_ex1 {

	public static void main(String[] args) {
		//키보드로부터 국어, 영어, 수학 점수를 차례로 입력
		//총점과 평균을 계산
		//평균이 90점 이상이면 우등상 수상 출력
		//모든 학생들은 졸업 출력
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("국어 점수");
		int kor = sc.nextInt();
		System.out.println("영어 점수");
		int eng = sc.nextInt();
		System.out.println("수학 점수");
		int math = sc.nextInt();
		int sum = kor+eng+math;
		int avg = sum/3;
		
/*		if(avg>=90) {
			System.out.println("A학점");
			System.out.println("우등상 수상!");
		}else if(avg>=80){
			System.out.println("B학점");
		}else if(avg>=70) {
			System.out.println("C학점");
		}else if(avg>=60){
			System.out.println("D학점");
		}else {
			System.out.println("F학점");
		}
	*/
		
		if(avg>=90) {
			System.out.println("A학점");
			System.out.println("우등상 수상!");
		}
		if(avg<90 && avg>=80) {
			System.out.println("B학점");
		}
		if(avg<80 && avg>=70) {
			System.out.println("C학점");
		}
		if(avg<70 && avg>=60) {
			System.out.println("D학점");
		}
		if(avg<60) {
		System.out.println("F학점");
		}
		
		System.out.println("[축 졸 업]");
	}

}
