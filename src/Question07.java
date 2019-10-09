/*
 *
 *  * Copyright (C) 2017 JalenSite. All rights reserved.
 *
 */

/**
 * <p>
 * <code>Question07</code>
 * </p>
 * Description: 递归和循环->	跳台阶
 * 一只青蛙一次可以跳上1级台阶，也可以跳上2级。求该青蛙跳上一个n级的台阶总共有多少种跳法（先后次序不同算不同的结果）。
 * 跳1级台阶--1种  F(1) = 1
 * 跳2级台阶--2种  F(2) = 2
 * 跳3级台阶--3种  F(3) = 3
 * 跳4级台阶--5种  F(4) = 5
 * 跳n级台阶......     F(n) = F(n-1) + F(n-2)
 *
 * @author Jalen
 * @date 2019/3/2 12:06
 */
public class Question07 {
    public static void main(String[] args) {
        int result1 = JumpFloor1(5);
        System.out.println(result1);

        int result2 = JumpFloor2(5);
        System.out.println(result2);

        int result3 = JumpFloor2(6);
        System.out.println(result3);
    }

    private static int JumpFloor1(int target) {
        if (target < 0) return 0;
        if (target == 1) return 1;
        if (target == 2) return 2;
        if (target > 2) return JumpFloor1(target-1) + JumpFloor1(target-2);
        return 0;
    }

    private static int JumpFloor2(int target){
        if (target < 0) return 0;
        if (target == 1) return 1;
        if (target == 2) return 2;
        int one = 1;
        int two = 2;
        int result = 0;
        for (int i = 2; i < target ; i++) {
            result = one + two;
            one = two;
            two = result;
        }
        return result;
    }
}
