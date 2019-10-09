/*
 *
 *  * Copyright (C) 2017 JalenSite. All rights reserved.
 *
 */

/**
 * <p>
 * <code>Question09</code>
 * </p>
 * Description: 递归和循环->矩形覆盖
 * 我们可以用2*1的小矩形横着或者竖着去覆盖更大的矩形。请问用n个2*1的小矩形无重叠地覆盖一个2*n的大矩形，总共有多少种方法？
 *
 * F(0) = 0
 * F(1) = 1 (2*1覆盖2*1有1种可能)
 * F(2) = 2 (2*1覆盖2*2有2种可能)
 * F(3) = 3 (2*1覆盖2*3有3种可能)
 * F(4) = 5 (2*1覆盖2*4有5种可能)
 * F(n) = F(n-1) + F(n-2)
 *
 * @author Jalen
 * @date 2019/3/3 10:34
 */
public class Question09 {
    public static void main(String[] args) {
        int result11 = RectCover1(5);
        int result12 = RectCover1(6);
        System.out.println(result11 + "," + result12);

        int result21 = RectCover2(5);
        int result22 = RectCover2(6);
        System.out.println(result21 + "," + result22);
    }

    private static int RectCover1(int target) {
        if (target <= 0) return 0;
        if (target == 1) return 1;
        if (target == 2) return 2;
        return RectCover1(target-1) + RectCover1(target-2);
    }

    private static int RectCover2(int target) {
        if (target <= 0) return 0;
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
