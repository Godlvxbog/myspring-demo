package com.battle_2020.pattern.createmethod.create2factory;

public class DecodingNode implements Node {

    StringNode stringNode;

    public DecodingNode(StringNode stringNode) {
        this.stringNode = stringNode;
    }

    public StringNode getStringNode() {
        return stringNode;
    }

    public void setStringNode(StringNode stringNode) {
        this.stringNode = stringNode;
    }
}
