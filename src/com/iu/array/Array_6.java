package com.iu.array;

public class Array_6 {

	public static void main(String[] args) {
		//배열의 길이 변경
		int [] nums = {1, 2, 3};
		int [] copy = new int[nums.length-1]; //값은 없는 상태
		
		for(int i=0;i<copy.length;i++) {
			copy[i]=nums[i];
		}
		nums=copy; //얕은복사
		System.out.println(nums.length);

		for(int i=0;i<nums.length;i++) {
			System.out.println(nums[i]);
		}
	}

}
