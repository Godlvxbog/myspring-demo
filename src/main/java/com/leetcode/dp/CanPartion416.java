package com.leetcode.dp;

/**
 * 416
 * https://leetcode-cn.com/problems/partition-equal-subset-sum/
 */
public class CanPartion416 {
    public static void main(String[] args) {
        int[] nums = {1, 5, 11, 5};
        boolean res = new CanPartion416().canPartition(nums);
        System.out.println(res);
    }

    //记忆化搜索用的空间：memo[i][c]标识索引为[0,i]这些元素，是否可以完全填充一个容量为 c 的背包，
    // 0 表示未计算， 1表示不可以填充，2表示可以填充
    static int[][] memo;

    /**
     * 递归方式
     * @param nums
     * @return
     */
    public  boolean canPartition2(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            assert nums[i] > 0;
            sum += nums[i];
        }

        if (sum % 2 != 0) {
            return false;
        }

        //处理逻辑：
        int n = nums.length;
        int c = sum/2 ;
        boolean[] memo = new boolean[c+1];

        for (int i = 0; i <=c ; i++) {
            memo[i] = (nums[0] == i);
        }
        //动态规划的状态转移
        for (int i = 1; i <n ; i++) {
            for(int j = c ; j >=nums[i] ; j--){
                memo[j] = memo[j] || memo[j-nums[i]];
            }
        }


        return memo[c];

    }



    public  boolean canPartition(int[] nums) {

        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            assert nums[i] > 0;
            sum += nums[i];
        }

        if (sum % 2 != 0) {
            return false;
        }

        //处理逻辑：
        memo = new int[nums.length][sum / 2 + 1];
        initMemo(memo);


        return tryPartion2(nums, nums.length - 1, sum / 2);

    }

    private void initMemo(int[][] memo) {
        for (int i = 0; i < memo.length; i++) {
            for (int j = 0; j < memo[i].length; j++) {
                memo[i][j] = -1;
            }
        }
    }

    private boolean tryPartion2(int[] nums, int index, int sum) {
        if (sum == 0) {
            return true;
        }

        //容量不够了，或者没有物品可以选了。则不能填充的了。
        if (sum < 0 || index < 0) {
            return false;
        }

        //已经被计算过了
        if (memo[index][sum] != -1) {
            return memo[index][sum] == 1;
        }

        memo[index][sum] = (tryPartion2(nums, index - 1, sum) || tryPartion2(nums, index - 1, sum - nums[index])) ? 1 : 0;

        return memo[index][sum] == 1;
    }

    /**
     * 使用nums[0...index]能否完全充满容量为sum的背包
     *
     * @param nums
     * @param index
     * @param sum
     * @return
     */
    private boolean tryPartion(int[] nums, int index, int sum) {
        if (sum == 0) {
            return true;
        }

        //容量不够了，或者没有物品可以选了。则不能填充的了。
        if (sum < 0 || index < 0) {
            return false;
        }

        //具体逻辑：策略
        return tryPartion(nums, index - 1, sum) || tryPartion(nums, index - 1, sum - nums[index]);

    }

}
