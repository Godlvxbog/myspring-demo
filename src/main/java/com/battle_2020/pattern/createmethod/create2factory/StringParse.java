package com.battle_2020.pattern.createmethod.create2factory;


import com.battle_2020.pattern.createmethod.create2factory.factory.NodeFactory;

public class StringParse {

    NodeFactory nodeFactory = new NodeFactory();

    public NodeFactory getNodeFactory() {
        return nodeFactory;
    }

    public void setNodeFactory(NodeFactory nodeFactory) {
        this.nodeFactory = nodeFactory;
    }

    Parse parse = new Parse();

    public Parse getParse() {
        return parse;
    }

    public void setParse(Parse parse) {
        this.parse = parse;
    }

    public Node findString(String buffer){
        return nodeFactory.createStringNode(buffer,nodeFactory.isShouldDecode(),nodeFactory.isShouldRemoveCharacters());
    }
}
