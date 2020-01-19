package com.battle_2020.pattern.createmethod.create2factory;

import com.battle_2020.pattern.createmethod.create2factory.factory.NodeFactory;

public class Parse {







    public Node parse(String url, NodeFactory nodeFactory){
        StringParse stringParse = new StringParse();
        stringParse.setNodeFactory(nodeFactory);
        return stringParse.findString(url);
    }


    //    boolean shouldDecode;
//
//    boolean shouldRemoveCharacters;
//
//    public boolean isShouldDecode() {
//        return shouldDecode;
//    }
//
//    public void setShouldDecode(boolean shouldDecode) {
//        this.shouldDecode = shouldDecode;
//    }
//
//    public boolean isShouldRemoveCharacters() {
//        return shouldRemoveCharacters;
//    }
//
//    public void setShouldRemoveCharacters(boolean shouldRemoveCharacters) {
//        this.shouldRemoveCharacters = shouldRemoveCharacters;
//    }
}
