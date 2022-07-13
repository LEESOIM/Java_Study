package com.iu.array;

public class Array_5 {

	public static void main(String[] args) {
		int [] nums1 = {1,2,3};
		System.out.println(nums1.length);
		
		//얕은 복사(주소만 공유)
		int [] nums2 = nums1;
		System.out.println(nums2.length);
		
		//깊은 복사(독립적)
		int [] nums3 = new int[3];
		for(int i=0;i<nums1.length;i++) {
			nums3[i]=nums1[i];
		}

		nums2[0]=9;
		System.out.println(nums1[0]);
		
		System.out.println(nums3.length);
		
		nums3[0]=100;
		System.out.println(nums1[0]);

		
		nums3 = new int [5]; //new : 배열을 새로 만들어라
		System.out.println(nums3[0]); //int(프리미티브)타입 초기값 : 0
	}

}
