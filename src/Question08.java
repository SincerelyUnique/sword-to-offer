/*
 *
 *  * Copyright (C) 2017 JalenSite. All rights reserved.
 *
 */

/**
 * <p>
 * <code>Question08</code>
 * </p>
 * Description: 递归和循环->变态跳台阶
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级……它也可以跳上n级。求该青蛙跳上一个n级的台阶总共有多少种跳法。
 *
 * F(1) = 1
 * F(2) = 2
 * F(3) = 4
 * F(4) = 8 (1-1, 2-4, 3-2, 4-1)
 * F(5) = ... ...
 * F(n) = 2^(n-1)
 *
 * @author Jalen
 * @date 2019/3/3 10:17
 */
public class Question08 {
    public static void main(String[] args) {
        int result11 = JumpFloorII1(5);
        int result12 = JumpFloorII1(6);
        System.out.println(result11 + "," + result12);

        int result21 = JumpFloorII2(5);
        int result22 = JumpFloorII2(6);
        System.out.println(result21 + "," + result22);
    }

    private static int JumpFloorII1(int target) {
        return (int)Math.pow(2, target-1);
    }

    private static int JumpFloorII2(int target) {
        if (target == 1) return 1;
        int one = 1;
        int result = 0;
        for (int i = 1; i < target ; i++) {
            result = one * 2;
            one = result;
        }
        return result;
    }
}
