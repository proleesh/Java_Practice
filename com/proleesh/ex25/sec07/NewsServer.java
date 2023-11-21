package com.proleesh.ex25.sec07;

import java.io.UnsupportedEncodingException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketAddress;
import java.net.SocketException;
import java.util.Scanner;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class NewsServer extends Thread{
    private static DatagramSocket datagramSocket;
    private static ExecutorService executorService = Executors.newFixedThreadPool(10);

    public static void main(String[] args) {
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");
        System.out.println("서버를 종료 하려면  q 또는 Q를 입력하고 를 Enter 키를 치세요.");
        System.out.println("~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~");

        // UDP 서버 시작
        startServer();

        Scanner scanner = new Scanner(System.in);
        while(true){
            String key = scanner.nextLine();
            if(key.toLowerCase().equals("q")){
                break;
            }
        }
        scanner.close();

        // UDP 서버 종료
        stopServer();
    }

    public static void startServer(){
        Thread thread = new Thread(){
            @Override
            public void run() {
                try{
                    datagramSocket = new DatagramSocket(50001);
                    System.out.println("[서버] 시작됨");

                    while(true){
                        // 클라이언트가 구독하고 싶은 뉴스 주제 얻기
                        DatagramPacket receivePacket = new DatagramPacket(new byte[1024], 1024);
                        System.out.println("클라이언트의 희망 뉴스 종류 얻기");
                        datagramSocket.receive(receivePacket);

                        executorService.execute(()->{
                            try {
                                String newsKind = new String(receivePacket.getData(), 0,
                                        receivePacket.getLength(), "UTF-8");

                                // 클라이언트의 IP와 Port 얻기
                                SocketAddress socketAddress = receivePacket.getSocketAddress();

                                for (int i = 1; i <= 10; ++i) {
                                    String data = newsKind + ": 뉴스" + i;
                                    byte[] bytes = data.getBytes("UTF-8");
                                    DatagramPacket sendPacket = new DatagramPacket(bytes, 0, bytes.length, socketAddress);
                                    datagramSocket.send(sendPacket);
                                    Thread.sleep(1000);
                                }
                            }catch(Exception e){
                                e.printStackTrace();
                            }
                        });


                    }
                }catch(SocketException e){
                    System.out.println("[서버] " + e.getMessage());
                } catch (UnsupportedEncodingException e) {
                    throw new RuntimeException(e);
                } catch(Exception e){
                    e.printStackTrace();
                }
            }
        };
        thread.start();
    }
    public static void stopServer(){
        datagramSocket.close();
        executorService.shutdownNow();
        System.out.println("[서버] 종료됨");
    }
}
