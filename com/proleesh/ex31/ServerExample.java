package com.proleesh.ex31;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.nio.charset.StandardCharsets;

public class ServerExample {
    public static void main(String[] args) {
        ServerSocket serverSocket = null;
        try{
            // ServerSocket 생성
            serverSocket = new ServerSocket();
            serverSocket.bind(new InetSocketAddress("localhost", 5001));
            while(true){
                System.out.println("[연결 기다림]");
                // 연결 동의(수락)
                Socket accept = serverSocket.accept();
                InetSocketAddress isa = (InetSocketAddress)accept.getRemoteSocketAddress();
                System.out.println("[연결 수락함] " + isa.getHostName());

                byte[] bytes = null;
                String message = null;

                InputStream is = accept.getInputStream();
                bytes = new byte[100];
                int readByteCount = is.read(bytes);
                message = new String(bytes, 0, readByteCount, StandardCharsets.UTF_8);
                System.out.println("[데이터 받기 성공]: " + message);

                OutputStream os = accept.getOutputStream();
                message = "Hello Client";
                bytes = message.getBytes(StandardCharsets.UTF_8);
                os.write(bytes);
                os.flush();
                System.out.println("[데이터 보내기 성공]");

                is.close();
                os.close();
                accept.close();
            }
        }catch(Exception e){
            e.printStackTrace();
        }
        if(!serverSocket.isClosed()){
            try{
                serverSocket.close();
            }catch (IOException e){
                e.printStackTrace();
            }
        }
    }
}
