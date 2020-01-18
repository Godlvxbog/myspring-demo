package com.leetcode.dp;

/**
 * 子序列。
 * 题号：300
 * https://leetcode-cn.com/problems/longest-increasing-subsequence/
 *
 *
 */
public class LongestIncrSub {
    static int[] memo_single;

    public int lengthOfLIS(int[] nums) {
        if (nums.length == 0){
            return 0;
        }

        //memo_single[i] 表示以nums[i]为结尾的最长上升子序列长度。
        memo_single = new int[nums.length];
        //初始化：以当前数字为结尾的最长上升的子序列长度为 1
        for (int i = 0; i < memo_single.length; i++) {
            memo_single[i] =1;
        }

        for (int i = 1; i < nums.length; i++) {
            for(int j= 0; j <  i; j++){
                if (nums[j] < nums[i]){
                    memo_single[i] = Math.max(memo_single[i], 1 + memo_single[j]);
                }
            }
        }

        //返回最长的值。
        int res  =1;
        for (int i = 0; i < nums.length; i++) {
            res = Math.max(res,memo_single[i]);
        }

        return res;
    }
}
