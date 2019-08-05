package com.middleaware.protocol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 * socket.getInputStream得到输入流
 * new inputStreamReader()得到读取到输入流的输入流的读取器
 * BufferReader（）放入到缓冲区
 * 缓冲区的 si.readLine读取客户端新兴
 *
 * 得到输入流出的socket.outPutStream
 * PrintWritter 拿到打印输出器
 * os.priniLine
 *
 * 其中如果需要外部输入的话 输入流为System.in
 * String line = sin.readLine() 所有的打印都是在缓冲区中打印的。
 *
 */
public class ServerDemo1 {

    public static void main(String[] args) {
        ServerSocket server=null;
        try{
            server=new ServerSocket(8080);
            Socket socket=server.accept(); //阻塞过程

            BufferedReader is=new BufferedReader
                    (new InputStreamReader(socket.getInputStream()));//如果请求过来了，收到了一个数据流。

            PrintWriter os=new PrintWriter(socket.getOutputStream());//获取输出流。

            BufferedReader sin=new BufferedReader(new InputStreamReader(System.in));

            System.out.println("Client:"+is.readLine()); //拿到客户端的信息

            String line=sin.readLine();
            while(!line.equals("bye")){
                os.println(line);//输出数据
                os.flush();
                System.out.println("Server:"+line);
                System.out.println("Client:"+is.readLine());
                line=sin.readLine();
            }
            os.close();
            is.close();
            socket.close();



        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }
}
