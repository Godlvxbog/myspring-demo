package com.battle_2020.pattern.simplify.command;

import java.util.Map;

public class CatelogApp2 {

    Map<String, Handler> handlerMap ;


    public void execute(){
        Handler handler = getHandler("All");
        if (handler == null){
//            Logger
            return;
        }

        handler.handler();
    }

    public CatelogApp2() {
        handlerMap.put("All" ,new AllHandler());
        handlerMap.put("New", new NewHandler());
    }


    public Handler getHandler(String actionName){
        return handlerMap.get(actionName);
    }
}
