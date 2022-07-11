package com.iu.array;

import java.util.Random;
import java.util.Scanner;

public class Array_ex2 {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		Random random = new Random(); //0부터 입력한 정수 미만 범위에서 무작위 정수를 뽑아준다
		//몬스터 생성
		String [] monsterNames = {"고블린","오크","트롤","골렘"};
		int [] monsterHps = {5, 7, 10, 15};
		
		//몬스터 파티 생성
		//몬스터 수 입력 (1-4) 후
		//입력한 수 만큼 몬스터를 랜덤하게 뽑고 출력
		
		System.out.println("몬스터 수 입력 (1-4)");
		int count = sc.nextInt();
		String [] monsterPartyNames = new String[count];
		int [] monsterPartyHps = new int[count];
		
		
		for(int i=0;i<monsterPartyNames.length;i++) {
			int index = random.nextInt(4);
			monsterPartyNames[i]=monsterNames[index];
			monsterPartyHps[i]=monsterHps[index];
		}
		
		
		
		for(int i=0;i<monsterPartyNames.length;i++) {
			System.out.print(monsterPartyNames[i]+" : ");
			System.out.println(monsterPartyHps[i]);
		}
		

	}

}
