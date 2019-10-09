/*
 *
 *  * Copyright (C) 2017 JalenSite. All rights reserved.
 *
 */

/**
 * <p>
 * <code>Question02</code>
 * </p>
 * Description: 请实现一个函数，将一个字符串中的每个空格替换成“%20”。例如，当字符串为We Are Happy.
 * 则经过替换之后的字符串为We%20Are%20Happy。
 * 我们第一个想到的就是JDK里面关于字符串替换的方法，哈哈
 *
 * @author Jalen
 * @date 2019/10/9 23:40
 */
public class Question02 {

    public static void main(String[] args) {
        Question02 question02 = new Question02();
        StringBuffer sb = new StringBuffer("We Are Happy");
        String str = question02.replaceSpace1(sb);
        System.out.println(str);
    }

    /**
     * 最简单的就是直接用JDK提供的String replace方法
     * @param str 替换前的字符串
     * @return 替换后的字符串
     */
    private String replaceSpace(StringBuffer str) {
        return str.toString().replace(" ", "%20");
    }

    /**
     * 不用JDK提供的方法，那就要遍历这个字符串了，如果遇到空格，就转一下
     * @param str 替换前的字符串
     * @return 替换后的字符串
     */
    private String replaceSpace1(StringBuffer str) {
        char[] charArray = str.toString().toCharArray();
        StringBuilder string = new StringBuilder();
        for (char aCharArray : charArray) {
            if (aCharArray == ' ') {
                string.append("%20");
            } else {
                string.append(aCharArray);
            }
        }
        return string.toString();
    }
}
