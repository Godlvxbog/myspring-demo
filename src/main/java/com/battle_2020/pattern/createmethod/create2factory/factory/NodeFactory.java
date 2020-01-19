package com.battle_2020.pattern.createmethod.create2factory.factory;

import com.battle_2020.pattern.createmethod.create2factory.DecodingNode;
import com.battle_2020.pattern.createmethod.create2factory.Node;
import com.battle_2020.pattern.createmethod.create2factory.StringNode;

public class NodeFactory {

    private boolean shouldDecode;

    private boolean shouldRemoveCharacters;

    public boolean isShouldDecode() {
        return shouldDecode;
    }

    public void setShouldDecode(boolean shouldDecode) {
        this.shouldDecode = shouldDecode;
    }

    public boolean isShouldRemoveCharacters() {
        return shouldRemoveCharacters;
    }

    public void setShouldRemoveCharacters(boolean shouldRemoveCharacters) {
        this.shouldRemoveCharacters = shouldRemoveCharacters;
    }


    public Node createStringNode(String buffer, boolean shouldDecode, boolean shouldRemoveCharacters){
        if (shouldDecode){
            return new DecodingNode(new StringNode(buffer));
        }
        return  new StringNode(buffer);

    }
}
