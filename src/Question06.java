/*
 *
 *  * Copyright (C) 2017 JalenSite. All rights reserved.
 *
 */

/**
 * <p>
 * <code>Question06</code>
 * </p>
 * Description: 递归和循环->斐波那契数列
 * 大家都知道斐波那契数列，现在要求输入一个整数n，请你输出斐波那契数列的第n项（从0开始，第0项为0）。
 * n<=39
 *
 * 斐波拉契数列：1、1、2、3、5、8、13、21、34、……
 * 在数学上，斐波纳契数列以如下被以递推的方法定义：F(1)=1，F(2)=1, F(n)=F(n-1)+F(n-2)（n>=3，n∈N*）
 *
 * @author Jalen
 * @date 2019/3/2 11:57
 */
public class Question06 {
    public static void main(String[] args) {
        int result1 = Fibonacci1(6);
        System.out.println(result1);

        int result2 = Fibonacci2(6);
        System.out.println(result2);
    }

    private static int Fibonacci1(int n) {
        if (n < 1) return 0;
        if (n == 1 || n == 2) return 1;
        return Fibonacci1(n-1) + Fibonacci1(n-2);
    }

    private static int Fibonacci2(int n) {
        if (n < 1) return 0;
        if (n == 1 || n == 2) return 1;
        int one = 1;
        int two = 1;
        int result = 0;
        for (int i = 2; i < n ; i++) {
            result = one + two;
            one = two;
            two = result;
        }
        return result;
    }

}
