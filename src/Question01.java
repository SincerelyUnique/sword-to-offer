/*
 *
 *  * Copyright (C) 2017 JalenSite. All rights reserved.
 *
 */

/**
 * <p>
 * <code>Question01</code>
 * </p>
 * Description: 在一个二维数组中（每个一维数组的长度相同），每一行都按照从左到右递增的顺序排序，
 * 每一列都按照从上到下递增的顺序排序。请完成一个函数，输入这样的一个二维数组和一个整数，判断数组中是否含有该整数。
 * Solution: 可以将该二维数组看作一个二维的表格（table），从左向右递增，从上向下递增
 * Attention: 该二维数组有可能是空的，注意边界检查
 *
 * @author Jalen
 * @date 2019/10/9 23:06
 */
public class Question01 {

    public static void main(String[] args) {
        Question01 question01 = new Question01();
        int target = 10;
        //int [][] array = {{1,2,3,4,5},{6,7,8,9,10},{11,12,13,14,15}};
        //int [][] array = {{1,2,3,4,5},{6,7,8,9,11},{12,13,15,16,18}};
        int[][] array= {{}};
        boolean result = question01.find(target, array);
        System.out.println(result);
    }

    /**
     * 最笨的办法就是将这个二维数组全部去遍历，然后一个一个对照比较
     * @param target 整数n
     * @param array 二维数组
     * @return 状态
     */
    private boolean find(int target, int [][] array) {
        for (int[] anArray : array) {
            if (anArray.length == 0){
                continue;
            }
            for (int anAnArray : anArray) {
                if (anAnArray == target) {
                    return true;
                }
            }
        }
        return false;
    }

    /**
     * 稍微好一些的办法，就是先遍历第一个维度的（即每一行），取最后一个值，先比较该值是不是大于或等于target，
     * 如果是，那么只需要再遍历这一行即可，不用每行都遍历，这样太傻了
     * @param target 整数n
     * @param array 二维数组
     * @return 状态
     */
    private boolean find1(int target, int [][] array) {
        for (int[] anArray : array) {
            if (anArray.length == 0) {
                continue;
            }
            if (anArray[anArray.length-1] >= target) {
                for (int anAnArray : anArray) {
                    if (target == anAnArray) {
                        return true;
                    }
                }
            }
        }
        return false;
    }
}
