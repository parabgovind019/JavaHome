package com.home.leetcode.set1;

import java.util.Arrays;
import java.util.HashMap;

public class LeetCode1 {
	
	public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> map = new HashMap<>();
        for(int i = 0 ; i < nums.length ; i++){
            if(map.containsKey(nums[i])){
                return new int[]{map.get(nums[i]),i};
            }
            map.put(target-nums[i],i);
        }
        return new int[]{};
    }

	public static void main(String[] args) {
		System.out.println(Arrays.toString(twoSum(new int[] {2,7,8,3,5,0,4},9)));
	}
}
