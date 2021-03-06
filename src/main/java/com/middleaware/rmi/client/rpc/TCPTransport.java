package com.middleaware.rmi.client.rpc;

import com.middleaware.rmi.server.rpc.RpcRequest;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.net.Socket;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public class TCPTransport {

//    private String host;
//
//    private int port;
    private String serviceAddr;

//    public TCPTransport(String host, int port) {
//        this.host = host;
//        this.port = port;
//    }

    public TCPTransport(String serviceAddr) {
        this.serviceAddr = serviceAddr;
    }

    //创建一个socket连接
    private Socket newSocket(){
        System.out.println("创建一个新的连接");
        Socket socket;
        try{
            String[] addrs = serviceAddr.split(":");
            socket=new Socket( addrs[0],Integer.parseInt( addrs[1]));
            return socket;
        }catch (Exception e){
            e.printStackTrace();
            throw new RuntimeException("连接建立失败");
        }
    }

    public Object send(RpcRequest request){
        Socket socket=null;
        try {
            socket = newSocket();
            //获取输出流，将客户端需要调用的远程方法参数request发送给
            ObjectOutputStream outputStream=new ObjectOutputStream
                    (socket.getOutputStream());
            outputStream.writeObject(request);
            outputStream.flush();
            //获取输入流，得到服务端的返回结果
            ObjectInputStream inputStream=new ObjectInputStream
                    (socket.getInputStream());
            Object result=inputStream.readObject();
            System.out.println("client获取到的结果为 result =" + result);
            inputStream.close();
            outputStream.close();
            return result;

        }catch (Exception e ){
            throw new RuntimeException("发起远程调用异常:",e);
        }finally {
            if(socket!=null){
                try {
                    socket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
