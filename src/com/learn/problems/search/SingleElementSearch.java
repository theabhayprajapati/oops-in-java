package com.learn.problems.search;

public class SingleElementSearch {
    public static void main(String[] args) {
        int nums[] = {1,1,2,2,3,3,4};
        System.out.println(checkSingleElement(nums));
    }

    private static int checkSingleElement(int[] nums) {
        int ans =-1;
        int i =0;
        while(i < nums.length){
            System.out.println("count: " + i);

            if(i+1>=nums.length){
                ans=nums[i];
                break;
            }
            if(nums[i]==nums[i+1]){
                i=i+2;
            }
            else{
                ans=nums[i];
                break;
            }
        }
        return ans;
    }

}
