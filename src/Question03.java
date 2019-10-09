/*
 *
 *  * Copyright (C) 2017 JalenSite. All rights reserved.
 *
 */

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

/**
 * <p>
 * <code>Question03</code>
 * </p>
 * Description: 输入一个链表，按链表从尾到头的顺序返回一个ArrayList。
 * 注意参数为null的检查
 *
 * @author Jalen
 * @date 2019/10/9 23:55
 */
public class Question03 {

    private static class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }

    public static void main(String[] args) {
        Question03 question03 = new Question03();
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        ArrayList<Integer> res = question03.printListFromTailToHead1(listNode);
        //ArrayList<Integer> res = question03.printListFromTailToHead(null);
        System.out.println(res);
    }

    /**
     * 根据ListNode的创建，我们首先确定如果listNode不是空的，肯定会获取第一个val值，
     * 然后通过while去遍历其next节点，将所有的next节点所对应的val获取出来，放到一个ArrayList里面,
     * 然后调用Collections的reverse反转一下该list即可
     * @param listNode 自定义节点
     * @return 反转的list
     */
    private ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
        if (listNode == null){
            return new ArrayList<>();
        }
        ArrayList<Integer> list = new ArrayList<>();
        int first = listNode.val;
        list.add(first);
        ListNode temp = listNode.next;
        while (temp !=null) {
            list.add(temp.val);
            temp = temp.next;
        }
        Collections.reverse(list);
        return list;
    }

    /**
     * 不用Collections.reverse(list)的情况下
     * @param listNode 自定义节点
     * @return 反转的list
     */
    private ArrayList<Integer> printListFromTailToHead1(ListNode listNode) {
        if (listNode == null){
            return new ArrayList<>();
        }
        ArrayList<Integer> list = new ArrayList<>();
        int first = listNode.val;
        list.add(first);
        ListNode temp = listNode.next;
        while (temp !=null) {
            list.add(temp.val);
            temp = temp.next;
        }
        int size = list.size();
        Integer[] reverseArr = new Integer[size];
        for (Integer aList : list) {
            reverseArr[size-1] = aList;
            size--;
        }
        ArrayList<Integer> reverseList = new ArrayList<>(size);
        reverseList.addAll(Arrays.asList(reverseArr));
        return reverseList;
    }
}
