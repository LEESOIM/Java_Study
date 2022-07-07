package com.iu.control;

public class Control4 {

	public static void main(String[] args) {
	
		String select="abc";
		
		switch(select) {
		case "aaa":
			System.out.println("1일 때 진행");
			break;
		case "abc":
			System.out.println("2일 때 진행");
			break;
		default:
			System.out.println("그 외 나머지 진행");
			
		}
	}

}
