package com.iu.array;

import java.util.Scanner;

import javax.naming.Name;

public class Array_ex1 {

	public static void main(String[] args) {
		//키보드로부터 인원수를 입력 받아서
		//인원수만큼 이름을 입력 받아서
		//이름들을 출력
		
		System.out.println("인원수 입력");
		Scanner sc = new Scanner(System.in);
		int count = sc.nextInt();
		String [] names = new String[count]; 
		
		for(int i=0;i<names.length;i++) {
			System.out.println(i+1+"번 이름 입력");
			names[i]=sc.next();
		}
		
		for(int i=0;i<names.length;i++) {
			System.out.println(names[i]);
		}
		
		
		//각 학생의 이름별로 국어점수를 입력 후 출력
		int [] kors = new int[names.length];

		for(int i=0;i<kors.length;i++) {
			System.out.println(names[i]+" 국어점수 입력");
			kors[i]=sc.nextInt();
		}
		
		for(int i=0;i<kors.length;i++) {
			System.out.println(names[i]+" 국어점수 "+kors[i]);
		}
		
		
		//반의 국어 총점을 계산하고 출력
		int sum=0;
		for(int i=0;i<names.length;i++) {
			sum=sum+kors[i];
		}
		
		System.out.println("국어 총점 : "+sum);
	}

}
