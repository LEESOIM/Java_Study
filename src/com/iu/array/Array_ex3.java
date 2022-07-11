package com.iu.array;

import java.util.Scanner;

public class Array_ex3 {

	public static void main(String[] args) {
		//학교 성적 프로그램
		//1.학생 정보 입력
		//	-학생 수를 입력
		//	-이름, 번호, 국어, 영어, 수학 입력 후 총점, 평균 계산
		//2.학생 정보 조회
		//	-모든 학생의 이름, 번호, 총점, 평균 출력
		//3.학생 정보 검색
		//	-검색할 학생의 번호를 입력
		//	-입력한 번호와 일치하는 학생의 모든 정보 출력
		//	-일치하는 번호가 없으면 없는 학생이다 출력
		//4.학생 정보 삭제
		//	-삭제할 학생의 번호를 입력
		//	-입력한 번호와 일치하는 학생의 정보를 삭제(배열을 한칸 삭제)
		//	-일치하는 번호가 없으면 없는 학생이다 출력
		//5.학생 정보 추가
		//	-이름, 번호, 국어, 영어, 수학 입력 후 총점, 평균 계산
		//6.프로그램 종료
		
		Scanner sc = new Scanner(System.in);
		boolean check = true;
		
		String [] name = null;
		int [] num = null;
		int [] kor = null;
		int [] eng = null;
		int [] math = null;
		int [] total = null;
		int [] avg = null;
		
		while(check) {
			System.out.println("1.학생 정보 입력");
			System.out.println("2.학생 정보 조회");
			System.out.println("3.학생 정보 검색");
			System.out.println("4.학생 정보 삭제");
			System.out.println("5.학생 정보 추가");
			System.out.println("6.프로그램 종료");
			int select = sc.nextInt();
			
			if(select==1) {//1.학생 정보 입력
				System.out.println("[학생 수 입력]");
				select = sc.nextInt();
				num = new int[select];
				name = new String[num.length];
				kor = new int[num.length];
				eng = new int[num.length];
				math = new int[num.length];
				total = new int[num.length];
				avg = new int[num.length];
				
					for(int i=0;i<num.length;i++) {
						System.out.println("번호 입력");
						num [i] = sc.nextInt();
						System.out.println("이름 입력");
						name [i] = sc.next();
						System.out.println("국어 점수 입력");
						kor [i] = sc.nextInt();
						System.out.println("영어 점수 입력");
						eng [i] = sc.nextInt();
						System.out.println("수학 점수 입력");
						math [i] = sc.nextInt();
						
						total[i] = kor[i]+eng[i]+math[i];
						avg[i] = total[i]/3;
						
						System.out.println("Num\tName\tTotal\tAvg");
						System.out.println(num[i]+"\t"+name[i]+"\t"+total[i]+"\t"+avg[i]);
						System.out.println("----------------------------");
					}
					
				}else if(select==2){//2.학생 정보 조회
					System.out.println("[모든 학생 정보 조회]");
					if(name!=null) {
						System.out.println("Num\tName\tTotal\tAvg");
						for(int i=0; i<num.length; i++) {
							System.out.println(num[i]+"\t"+name[i]+"\t"+total[i]+"\t"+avg[i]);
						}
						System.out.println("----------------------------");
					}else {
						System.out.println(">>학생 정보가 없습니다.");
					}
				}else if(select==3){//3.학생 정보 검색
					System.out.println("[검색할 학생의 번호 입력]");
					select = sc.nextInt();

					for(int i=0;i<num.length;i++) {
						if(num[i]==select) {
							System.out.println("Num\tName\tTotal\tAvg");
							System.out.println(num[i]+"\t"+name[i]+"\t"+total[i]+"\t"+avg[i]);
							System.out.println("----------------------------");
							break;
						}
					}
					
				}else if(select==4) {//4.학생 정보 삭제
					System.out.println("[삭제할 학생의 번호를 입력]");
					select = sc.nextInt();
					System.out.println("Num\tName\tTotal\tAvg");
					for(int i=0;i<num.length;i++) {
						if(num[i]==select) {
							num[i]=0;
							name[i]="0";
							total[i]=0;
							avg[i]=0;
						}
						System.out.println(num[i]+"\t"+name[i]+"\t"+total[i]+"\t"+avg[i]);
					}

					
				}else if(select==5) {//5.학생 정보 추가
					System.out.println("[학생 정보 추가]");
					num = new int[num.length+1];
					name = new String[num.length+1];
					kor = new int[num.length+1];
					eng = new int[num.length+1];
					math = new int[num.length+1];
					total = new int[num.length+1];
					avg = new int[num.length+1];
					
					for(int i=num.length; i<num.length+1; i++) {
						System.out.println("번호 입력");
						num [i] = sc.nextInt();
						System.out.println("이름 입력");
						name [i] = sc.next();
						System.out.println("국어 점수 입력");
						kor [i] = sc.nextInt();
						System.out.println("영어 점수 입력");
						eng [i] = sc.nextInt();
						System.out.println("수학 점수 입력");
						math [i] = sc.nextInt();
						
						total[i] = kor[i]+eng[i]+math[i];
						avg[i] = total[i]/3;
						
						System.out.println("Num\tName\tTotal\tAvg");
						System.out.println(num[i]+"\t"+name[i]+"\t"+total[i]+"\t"+avg[i]);
						System.out.println("----------------------------");
					}
					
					
				System.out.println();
					
					
				}else if(select==6) {//6.프로그램 종료
					break;
				}
		
		}
	}

}
