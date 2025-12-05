package com.home.leetcode.set1;

public class LeetCode5 {

	public static String longestPalindrome(String s) {
        String a1 = "";
        String a2 = "";
        if(s.length() == 1){
            return s;
        }
        if(s.length() == 2 && s.charAt(0) != s.charAt(1)){
            return s.substring(0,1);
        }
        int max1 = 1;
        for(int i = 0 ; i < s.length() ; i++){
            int l1 = i-1;
            int r1 = i+1;
            int count1 = 1;
            while(l1 >= 0 && r1 < s.length()){
                if(s.charAt(l1) == s.charAt(r1)){
                    count1 = count1 + 2;
                    if(max1 < count1){
                        max1 = count1;
                        a1 = s.substring(l1,r1+1);
                    }
                    l1--;
                    r1++;
                }
                else{
                    break;
                }
            }
        }
        int max2 = 0;
        for(int i = 1 ; i < s.length() ; i++){
            if(s.charAt(i-1) == s.charAt(i)){
                int count2 = 2;
                int c1 = i-2;
                int c2 = i+1;
                while(c1 >= 0 && c2 < s.length()){
                    if(s.charAt(c1) == s.charAt(c2)){
                        count2 = count2 + 2;
                        c1--;
                        c2++;
                    }
                    else{
                        break;
                    }
                }
                if(max2 < count2){
                    max2 = count2;
                    a2 = s.substring(c1+1, c2);
                }
            }
        }

        return (a1.length() == 0 && a2.length() == 0)?(s.substring(0,1)):(a1.length() > a2.length())?a1:a2;
    }
	
	public static void main(String[] args) {
		System.out.println(longestPalindrome("aaaaa"));
	}
}