package com.iu.loop;

public class Loop1 {

	public static void main(String[] args) {
		// for문 : 반복 해야할 횟수가 정해져 있을 때 사용
		
		System.out.println("Start");
		
		//for(초기식;조건식;증감식)
		for(int i=0;i<5;i++){//초기식 int만 가능
			System.out.println("Hello Wolrd");
		}

		for(int i=0;i<10;i++) {
			System.out.println(i);
		}
		
		System.out.println("Finish");

	}

}
