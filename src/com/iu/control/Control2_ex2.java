package com.iu.control;

import java.util.Scanner;

public class Control2_ex2 {

	public static void main(String[] args) {
		//num=1, ch=a -> b
		//num=2, ch=a -> c
		//num=1, ch=z -> a
		//num=2, ch=z -> b
		//a(97) z(122)
		//A(65) Z(90)
		
		Scanner sc = new Scanner(System.in);
		System.out.println("1 ~ 5 사이의 숫자를 입력");
		int num = sc.nextInt();
		
		System.out.println("알파벳을 입력");
		char ch = sc.next().charAt(0);
		
		int result = num+ch;
		
		//소문자가 범위를 벗어났을 때
		if(result > 'z') { //자동 형변환 result>122
			result = result-'z'-1;
			result = 'a'+result; 
		}
		
		//대문자가 범위를 벗어났을 때
		if(result > 'Z' && result <'a') { //90<result<97
			result = result-'Z'-1;
			result = 'A'+result;
		}
		
		System.out.print("num="+num+", ch="+ch+" -> "+(char)result);

	}

}
