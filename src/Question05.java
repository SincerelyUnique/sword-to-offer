/*
 *
 *  * Copyright (C) 2017 JalenSite. All rights reserved.
 *
 */

import java.util.Arrays;
import java.util.List;

/**
 * <p>
 * <code>Question05</code>
 * </p>
 * Description:  查找和排序->旋转数组的最小数字
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。
 * 输入一个非减排序的数组的一个旋转，输出旋转数组的最小元素。
 * 例如数组{3,4,5,1,2}为{1,2,3,4,5}的一个旋转，该数组的最小值为1。
 * NOTE：给出的所有元素都大于0，若数组大小为0，请返回0。
 *
 * @author Jalen
 * @date 2019/3/2 11:49
 */
public class Question05 {
    public static void main(String[] args) {
        int[] arr = {3,4,5,1,2};
        int result = minNumberInRotateArray(arr);
        System.out.println(result);
    }

    private static int minNumberInRotateArray(int [] array) {
        int node = array[0];
        for (int currentNode: array){
            if (node > currentNode){
                node = currentNode;
            }
        }
        return node;
    }
}
