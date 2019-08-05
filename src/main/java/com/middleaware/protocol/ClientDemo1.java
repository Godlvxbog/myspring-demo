package com.middleaware.protocol;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

/**
 * 腾讯课堂搜索 咕泡学院
 * 加群获取视频：608583947
 * 风骚的Michael 老师
 */
public class ClientDemo1 {

    public static void main(String[] args) {
        try{
           Socket socket=new Socket("127.0.0.1",8080);
           BufferedReader sin=new BufferedReader(new InputStreamReader(System.in));
           PrintWriter os=new PrintWriter(socket.getOutputStream());
           BufferedReader is=new BufferedReader(new InputStreamReader(socket.getInputStream()));
           String line=sin.readLine();
           while(!line.equals("bye")){
               os.println(line);
               os.flush();  //输出出去之后要做清空缓存取
               System.out.println("Client:"+line);
               System.out.println("Server:"+is.readLine());

               line=sin.readLine();//读下一行。
           }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {

        }
    }
}
