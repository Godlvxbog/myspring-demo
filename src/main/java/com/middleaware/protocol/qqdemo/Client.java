package com.middleaware.protocol.qqdemo;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost",8080);
            BufferedReader sin = new BufferedReader(new InputStreamReader(System.in));

            PrintWriter os = new PrintWriter(socket.getOutputStream());
            String line = sin.readLine();
            os.println(line);

            os.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
