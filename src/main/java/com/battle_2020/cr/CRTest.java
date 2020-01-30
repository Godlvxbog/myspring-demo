package com.battle_2020.cr;

import org.apache.commons.lang3.StringUtils;

public class CRTest {

    public static void main(String[] args) {
        try {
            System.out.println(testDivide(10,1));

            if (StringUtils.isEmpty(null)){
                System.out.println(1);
            }

            System.out.println(999);

        }catch (Exception e){

//            System.out.println(e.toString());
//            System.out.println(e.getMessage());
//            System.out.println("************");
        }

    }

    public static int testDivide(int num1, int num2) throws Exception{
        return num1/num2;
    }


}
