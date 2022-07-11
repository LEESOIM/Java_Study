package com.iu.array;

public class Array_3 {

	public static void main(String[] args) {
		int [] nums = new int [3]; //int배열 타입
		nums[0] = 100; //int 타입
		nums[1] = 200;
		nums[2] = 300;
		
		int [] nums2 = nums; //int배열 : 같은 타입끼리 가능
		System.out.println(nums2[2]);

	}

}
