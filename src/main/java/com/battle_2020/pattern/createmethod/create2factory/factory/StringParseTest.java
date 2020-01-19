package com.battle_2020.pattern.createmethod.create2factory.factory;

import com.battle_2020.pattern.createmethod.create2factory.Parse;

public class StringParseTest {

    public static void main(String[] args) {
        Parse parse = new Parse();
        NodeFactory nodeFactory = new NodeFactory();
        nodeFactory.setShouldDecode(true);
        nodeFactory.setShouldDecode(true);

        parse.parse("www.baidu.com",nodeFactory);
    }
}
