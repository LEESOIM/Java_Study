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
					boolean flag = true;
					for(int i=0;i<num.length;i++) { 
						if(num[i]==select) { //값이 같을때만 if문 실행 -> flag는 flase가 된다
							System.out.println("Num\tName\tTotal\tAvg");
							System.out.println(num[i]+"\t"+name[i]+"\t"+total[i]+"\t"+avg[i]);
							System.out.println("----------------------------");
							flag=!flag; //false
						}
						//flag=true인 상태로 for문 반복
					}
					
					if(flag) {
						System.out.println(">>일치하는 학생 정보가 없습니다.");
					}
					
				}else if(select==4) {//4.학생 정보 삭제
					System.out.println("[삭제할 학생의 번호를 입력]");
					select = sc.nextInt();
					
					boolean flag=false;
					
					String [] nameCopy = null;
					int [] numCopy = null;
					int [] korCopy = null;
					int [] engCopy = null;
					int [] mathCopy = null;
					int [] totalCopy = null;
					int [] avgCopy = null;
					
					int i=0;
					for(i=0;i<num.length;i++) {
						if(num[i]==select) {
							flag=!flag; //삭제할 번호와 일치하면 flag=true
							break;
						}
					}if(flag) {//true
						numCopy = new int[num.length-1];
						nameCopy = new String [numCopy.length];
						korCopy = new int[numCopy.length];
						engCopy = new int[numCopy.length];
						mathCopy = new int[numCopy.length];
						totalCopy = new int[numCopy.length];
						avgCopy = new int[numCopy.length];
						
						int index=0;
						for(int j=0;j<name.length;j++) {
							if(j==i) {
								continue;//for : 그 즉시 증감식으로 이동
							}
							nameCopy[index]=name[j];
							numCopy[index]=num[j];
							korCopy[index]=kor[j];
							engCopy[index]=eng[j];
							mathCopy[index]=math[j];
							totalCopy[index]=total[j];
							avgCopy[index]=avg[j];
							index++;
						}
						
						name=nameCopy;
						num=numCopy;
						kor=korCopy;
						eng=engCopy;
						math=mathCopy;
						total=totalCopy;
						avg=avgCopy;
					}else {
						System.out.println(">>일치하는 학생 정보가 없습니다.");
					}
					
				}else if(select==5) {//5.학생 정보 추가
					System.out.println("[학생 정보 추가]");
					int [] numCopy = new int [num.length+1]; 
					String [] nameCopy = new String [numCopy.length]; 
					int [] korCopy = new int [numCopy.length];     
					int [] engCopy = new int [numCopy.length];   
					int [] mathCopy = new int [numCopy.length];  
					int [] totalCopy = new int [numCopy.length];    
					int [] avgCopy = new int [numCopy.length];   
					
					for(int i=0; i<num.length; i++) {
						nameCopy[i]=name[i];
						numCopy[i]=num[i];
						korCopy[i]=kor[i];
						engCopy[i]=eng[i];
						mathCopy[i]=math[i];
						totalCopy[i]=total[i];
						avgCopy[i]=avg[i];
					}
					
									
					
					System.out.println("추가 학생 이름 입력");
					nameCopy[name.length]=sc.next();
					System.out.println("추가 학생 번호 입력");
					numCopy[name.length]=sc.nextInt();
					System.out.println("추가 학생 국어 입력");
					korCopy[name.length]=sc.nextInt();
					System.out.println("추가 학생 영어 입력");
					engCopy[name.length]=sc.nextInt();
					System.out.println("추가 번째 학생 수학 입력");
					mathCopy[name.length]=sc.nextInt();
					totalCopy[name.length]=korCopy[name.length]+engCopy[name.length]+mathCopy[name.length];
					avgCopy[name.length]=totalCopy[name.length]/3;
					
					name=nameCopy;
					num=numCopy;
					kor=korCopy;
					eng=engCopy;
					math=mathCopy;
					total=totalCopy;
					avg=avgCopy;
					System.out.println("====== 학생 삭제 끝 ======");
					
					
				}else {//6.프로그램 종료
					break;
				}
		
		}
		System.out.println("프로그램을 종료 합니다");
	}

}
