package com.proleesh.ex33.thread;

/**
 * 调用start() 会导致两个thread(线程)并发运行
 * 一个调用start()方法的当前线程, 另外一个是执行run()方法的线程
 * 注意: 如果重复调用start()是一个非法操作， 会导致IllegalThreadStateException异常
 */
public class ThreadTest4 {
    void main(){
        for(int i = 0; i < 5; ++i) {
            Thread th = new Thread(new RunnableWithThread2());
            th.start();
            System.out.println(th.getId());
            System.out.println(th.getName());
        }
    }
}
class RunnableWithThread2 implements Runnable{
    @Override
    public void run() {
        System.out.println("Thread was running...");
    }
}
