package com.battle_2020.pattern.createmethod.create2factory;

public class StringNode implements Node {

    String buffer;

    public StringNode(String buffer) {
        this.buffer = buffer;
    }

//    public static Node createStringNode(String buffer, boolean shouldDecode, boolean shouldRemoveCharacters){
//        if (shouldDecode){
//            return new DecodingNode(new StringNode(buffer));
//        }
//        return  new StringNode(buffer);
//
//    }
}
