package com.home.leetcode.set1;

public class LeetCode3 {

	public static int lengthOfLongestSubstring(String s) {
        int max = 0;
        boolean arr[] = new boolean[128];
        int left = 0;
        int right = 0;
        while(right < s.length()){
            if(!arr[s.codePointAt(right)] == true){
                arr[s.codePointAt(right)] = true;
                max = (max < ((right-left)+1)) ? ((right-left)+1) : max;
                right++;
            }
            else{
                arr[s.codePointAt(left)] = false;
                left++;
            }
        }
        return max;
    }
	
	public static void main(String[] args) {
		System.out.println(lengthOfLongestSubstring("abcabcabc"));
	}

}
