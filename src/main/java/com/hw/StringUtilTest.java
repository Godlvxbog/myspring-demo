package com.hw;

import org.apache.commons.lang3.StringUtils;

public class StringUtilTest {

    public static void main(String[] args) {
        testStringUtils();
    }

    private static void testStringUtils(){
        //空：null+无字符串：空串也是
        System.out.println(StringUtils.isEmpty(null));
        System.out.println(StringUtils.isEmpty(""));
        System.out.println(StringUtils.isEmpty("  "));//非空
        System.out.println(StringUtils.isEmpty("xbog"));//非空
        System.out.println("============");

        //blank:判断某字符串是否为空或长度为0或由空白符(whitespace) 构成
        System.out.println(StringUtils.isBlank(null));
        System.out.println(StringUtils.isBlank(""));
        System.out.println(StringUtils.isBlank(" "));
        System.out.println(StringUtils.isBlank("\t  \n  \f \r"));

        //去掉控制符
        System.out.println(StringUtils.trim(null));
        System.out.println(StringUtils.trim(""));
        System.out.println(StringUtils.trim(" "));
        System.out.println(StringUtils.trim(" \n test \t"));
        System.out.println(StringUtils.trim(" ddd \n test \t sss "));


    }
}
