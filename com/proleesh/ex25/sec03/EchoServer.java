package com.proleesh.ex25.sec03;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class EchoServer {
    private static ServerSocket serverSocket; // field 가 자동 초기화 하기 때문에 null 없어도 된다.

    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("서버를 종료 하려면  q 또는 Q를 입력하고 를 Enter 키를 치세요.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // TCP 서버 시작
        startServer();

        // 키보드 입력
        Scanner scanner = new Scanner(System.in);
        while(true){
            String key = scanner.nextLine();
            if(key.toLowerCase().equals("q")){
                break;
            }
        }
        scanner.close();

        // TCP 서버 종료
        stopServer();
    }

    public static void startServer(){
        // 작업 스레드 정의
        Thread thread = new Thread(){
            @Override
            public void run() {
                try {
                    // ServerSocket 생성 및 Port 바인딩
                    serverSocket = new ServerSocket(50001);
                    System.out.println("[서버] 시작됨");

                    while(true){
                        System.out.println("\n[서버] 연결 요청을 기다림\n");
                        // 연결 수락
                        Socket socket = serverSocket.accept();

                        // 연결된 클라이언트 정보 얻기
                        InetSocketAddress isa =
                                (InetSocketAddress) socket.getRemoteSocketAddress();
                        System.out.println("[서버] " +isa.getHostName() + "의 연결 요청을 수락함");

                        // 연결 끊기
                        socket.close();
                        System.out.println("[서버] " + isa.getHostName() + "의 연결을 끊음");

                        InputStream is = socket.getInputStream();
                        byte[] bytes = new byte[1024];
                        int readByteCount = is.read(bytes);
                        String message = new String(bytes, 0, readByteCount,"UTF-8");

                        OutputStream os = socket.getOutputStream();
                        bytes = message.getBytes("UTF-8");
                        os.write(bytes);
                        os.flush();
                        System.out.println("[서버] 받은 데이터를 다시 보냄: " + message );
                    }

                }catch(IOException e){
                    System.out.println("[서버] " + e.getMessage());
                }
            }
        };
        // 스레드 시작
        thread.start();
    }

    public static void stopServer(){
        try{
            // ServerSocket을 닫고 Port 언바인딩
            serverSocket.close();
            System.out.println("[서버] 종료됨");
        }catch(IOException e){

        }
    }

}