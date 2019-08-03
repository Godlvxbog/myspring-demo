package com.middleaware.rmi.server.rpc;

import com.middleaware.rmi.server.rpc.anno.RpcAnnotation;
import com.middleaware.rmi.server.rpc.zk.RegisterCenter;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 *
 * 用于发布一个远程服务
 */
public class RpcServer {
    //创建一个线程池
    private static final ExecutorService executorService=Executors.newCachedThreadPool();

    private RegisterCenter registerCenter;

    private String serviceAddr;

    //服务名称与服务对象的关系
    Map<String ,Object> hanlderMap = new HashMap<>();

    public RpcServer(RegisterCenter registerCenter, String serviceAddr) {
        this.registerCenter = registerCenter;
        this.serviceAddr = serviceAddr;
    }

    public void bind(Object ... services){
        for (Object service: services){
            RpcAnnotation rpcAnnotation = service.getClass().getAnnotation(RpcAnnotation.class);
            String serviceName = rpcAnnotation.value().getName();
            hanlderMap.put(serviceName,service);
        }
    }


    public void publisher(){
        ServerSocket serverSocket=null;
        try{
            String[] addr = serviceAddr.split(":");
            serverSocket=new ServerSocket (Integer.parseInt( addr[1]));  //启动一个服务监听

            for (String interfacName :hanlderMap.keySet()){
                registerCenter.register(interfacName,serviceAddr);
                System.out.println("服务注册成功："+ interfacName +"->"+ serviceAddr);
            }


            while(true){ //循环监听
                Socket socket=serverSocket.accept(); //监听服务
                //通过线程池去处理请求:socket里面封装了请求，HandlerMap中获取到了处理器。处理器是在绑定时加入的。
                executorService.execute(new ProcessorHandler(socket,hanlderMap));
            }
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            if(serverSocket!=null){
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

        }
    }
}
