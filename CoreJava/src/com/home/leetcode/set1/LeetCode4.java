package com.home.leetcode.set1;

public class LeetCode4 {
	
	public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int arr[] = new int[nums1.length+nums2.length];
        int i = 0;
        int j = 0;
        int k = 0;
        while(i < nums1.length && j < nums2.length){
            if(nums1[i] <= nums2[j]){
                arr[k] = nums1[i];
                i++;
            }
            else{
                arr[k] = nums2[j];
                j++;
            }
            k++;
        }
        while(i < nums1.length){
            arr[k] = nums1[i];
            i++;
            k++;
        }
        while(j < nums2.length){
            arr[k] = nums2[j];
            j++;
            k++;
        }
        --k;
        if(k%2 == 0){
            return (double)arr[(k/2)];
        }
        else{
            return (double)(arr[(k/2)] + arr[(k/2)+1])/2;
        }
    }

	public static void main(String[] args) {
		System.out.println(findMedianSortedArrays(new int[] {1,2},new int[] {3,4}));
	}
}