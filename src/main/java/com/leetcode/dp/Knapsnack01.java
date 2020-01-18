package com.leetcode.dp;

/**
 * 0-1背包问题
 */
public class Knapsnack01 {
    static int[][] memo;
    static int[] memo_single;

    public static void main(String[] args) {
        int[] w = {1, 2, 3};
        int[] v = {6, 10, 12};
        int C = 5;

        int res = knapsnack04(w, v, C);
        System.out.println(res);

    }


    private int knapsnack01(int[] w, int[] v, int C) {
        int n = v.length;
        /**
         * 考虑每个元素，放在背包中的结果的存放
         */
        memo = new int[n][C + 1];
        return bestValue(w, v, n, C);
    }

    /**
     * @param w
     * @param v
     * @param index 考虑[0,index]填充容量为c的背包的最大价值
     * @param c
     * @return
     */
    private int bestValue(int[] w, int[] v, int index, int c) {
        if (index < 0 || c <= 0) {
            return 0;
        }

        //尝试放入新的物品
        int res = bestValue(w, v, index - 1, c);
        if (c >= w[index]) {
            res = Math.max(res, v[index] + bestValue(w, v, index - 1, c - w[index]));
        }
        return res;
    }

    /**
     * 动态规划问题
     *
     * @param w
     * @param v
     * @param c
     * @return
     */
    private int bestValue2(int[] w, int[] v, int c) {
        assert v.length == v.length;

        int n = w.length;
        if (n == 0) {
            return 0;
        }

        //处理最基础的问题
        for (int j = 0; j <= c; j++) {
            //如果背包容量大于第0号物品，那么就是 v[0],否则就是 0
            memo[0][j] = (j >= w[0] ? v[0] : 0);
        }

        //递推:考虑0~i的物品使用背包容积j可以放下的物体重量
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <= c; j++) {
                //策略一：不放入第w[i]
                memo[i][j] = memo[i - 1][j];
                //策略二：放入第w[i]
                if (j >= w[i]) {
                    memo[i][j] = Math.max(memo[i][j], v[i] + memo[i - 1][j - w[i]]);
                }
            }
        }
        return memo[n - 1][c];
    }


    private static int knapsnack03(int[] w, int[] v, int C) {
        int n = v.length;
        /**
         * 考虑每个元素，放在背包中的结果的存放
         */
        memo = new int[2][C + 1];
        return bestValue3(w, v, C);
    }

    /**
     * 动态规划问题的优化
     * 前面的时间复杂度  N * C
     * 空间复杂度为  N * C ,可以继续优化
     * <p>
     * 每次只是更新了第i行元素，只依赖于i-1的元素，因此，只需要保持两行元素就可以了。
     * 因此可以优化为 2*C
     *
     * @param w
     * @param v
     * @param c
     * @return
     */
    private static int bestValue3(int[] w, int[] v, int c) {
        assert v.length == v.length;

        int n = w.length;
        if (n == 0) {
            return 0;
        }

        //处理最基础的问题
        for (int j = 0; j <= c; j++) {
            //如果背包容量大于第0号物品，那么就是 v[0],否则就是 0
            memo[0][j] = (j >= w[0] ? v[0] : 0);
        }

        //递推:考虑0~i的物品使用背包容积j可以放下的物体重量
        for (int i = 1; i < n; i++) {
            for (int j = 0; j <= c; j++) {
                //策略一：不放入第w[i]
                memo[i % 2][j] = memo[(i - 1) % 2][j];
                //策略二：放入第w[i]
                if (j >= w[i]) {
                    memo[i % 2][j] = Math.max(memo[i % 2][j], v[i] + memo[(i - 1) % 2][j - w[i]]);
                }
            }
        }
        return memo[(n - 1) % 2][c];
    }

    /**
     * 空间复杂复杂度降低：
     * 从一行中，右边往左进行刷新
     *
     * @param w
     * @param v
     * @param c
     * @return
     */
    private static int bestValue4(int[] w, int[] v, int c) {
        assert v.length == v.length;

        int n = w.length;
        if (n == 0) {
            return 0;
        }

        //处理最基础的问题:第一行
        for (int j = 0; j <= c; j++) {
            //如果背包容量大于第0号物品，那么就是 v[0],否则就是 0
            memo_single[j] = (j >= w[0] ? v[0] : 0);
        }

        //递推:考虑0~i的物品使用背包容积j可以放下的物体重量
        for (int i = 1; i < n; i++) {
            for (int j = c; j >= w[i]; j--) {
                memo_single[j] = Math.max(memo_single[j], v[i] + memo_single[j - w[i]]);
            }
        }
        return memo_single[c];
    }


    private static int knapsnack04(int[] w, int[] v, int C) {
        /**
         * 考虑每个元素，放在背包中的结果的存放
         */
        memo_single = new int[C + 1];
        return bestValue4(w, v, C);
    }
}
