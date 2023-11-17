package com.proleesh.ex25.sec03;

import java.io.DataInputStream;
import java.io.DataOutput;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class EchoClient {
    public static void main(String[] args) {
        try {
            Socket socket = new Socket("localhost", 50001);
            System.out.println("[클라이언트] 연결 성공");

            String sendMessage = "Hello!";
            DataOutputStream dos = new DataOutputStream(socket.getOutputStream());
            dos.writeUTF(sendMessage);
            dos.flush();
            System.out.println("[클라이언트] 데이터 보냄: " + sendMessage);

            DataInputStream dis = new DataInputStream(socket.getInputStream());
            String receiveMessage = dis.readUTF();
            System.out.println("[클라이언트] 데이터 받음: " + receiveMessage);


            socket.close();
            System.out.println("[클라이언트] 연결 끊김");



        } catch (UnknownHostException e) {
            // IP 또는 도메인 표기 방법이 잘못되었을 경우
            System.out.println("UnknownHostException: " + e.toString());
        }catch(IOException e){
            // IP 또는 Port 번호가 존재하지 않을 경우
            System.out.println("IOException: " + e.toString());
        }
    }
}
