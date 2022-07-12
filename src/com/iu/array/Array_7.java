package com.iu.array;

public class Array_7 {

	public static void main(String[] args) {
		int [] ar = {4,7,1,3,9};
		//내림차순 9 7 4 3 1
		
		for(int i=0;i<ar.length-1;i++) {
			//i=0일 때, j=1234 ->0인덱스와 1234인덱스와 비교 
			//i=1일 때, j=234
			//i=2일 때, j=34
			//i=3일 때, j=4
			
			for(int j=i+1;j<ar.length;j++) {
				if(ar[i]<ar[j]) { //오름차순으로 할 땐 괄호를 바꿔준다
					int tmp=ar[j]; //빈공간에 꺼내둔다
					ar[j]=ar[i];
					ar[i]=tmp;
				}
			}
		}
		
		for(int i=0;i<ar.length;i++) {
			System.out.println(ar[i]);
		}
	}

}
