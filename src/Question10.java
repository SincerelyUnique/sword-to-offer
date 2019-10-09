/*
 *
 *  * Copyright (C) 2017 JalenSite. All rights reserved.
 *
 */

/**
 * <p>
 * <code>Question10</code>
 * </p>
 * Description: 位运算->二进制中1的个数
 * 输入一个整数，输出该数二进制表示中1的个数。其中负数用补码表示。
 *
 * @author Jalen
 * @date 2019/3/3 10:54
 */
public class Question10 {
    public static void main(String[] args) {
        int result = NumberOf1(9);
        System.out.println(result);
    }

    private static int NumberOf1(int n) {
        int count = 0;
        while (n != 0){
            int yu = n % 2;
            if (yu == 1){
                count ++;
            }
            n = n / 2;
        }
        return count;
    }
}
