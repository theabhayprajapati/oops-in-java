package com.learn.problems.search;

import java.util.Arrays;

public class maxValue {
    public static void main(String[] args) {
        System.out.println(getmaxValue(6,1, 10));
    }
    public static int getmaxValue(int n, int index, int maxSum) {
        // how to improve dsa
        int[] ans = new int[n];
        for (int i = 0; i < n; i++) {
            ans[i] =i;
        }
        System.out.println(Arrays.toString(ans));
        return 0;
    }
}

