package com.xbog.javabasic.javacore;

public class BitArray {

    static byte[] bitMap = new byte[10]; //10 *8 =80个bit



    public static void main(String[] args) {
        bitMap[2] = 16;
        int pos =  21;
        int bytePos = pos >> 3;  // 21/8 = 2
        int bitPos = pos & 0x7 ; //21 % 8 = 5
        System.out.println( 1);
        bitMap[bytePos] |= 1 << (bitPos);  //a|=b的意思就是把a和b按位或然后赋值给a
        System.out.println(bitMap);

    }

    public static byte[] getBooleanArray(byte b) {
        byte[] array = new byte[8];
        for (int i = 7; i >= 0; i--) {
            array[i] = (byte)(b & 1);
            b = (byte) (b >> 1);
        }
        return array;
    }
}
