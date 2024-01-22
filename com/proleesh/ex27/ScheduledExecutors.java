package com.proleesh.ex27;

import java.util.concurrent.*;

public class ScheduledExecutors {
    // 创建一个线程池，可以安排命令在给定的延迟后运行，或定期执行。
    // newScheduledThreadPool(int corePoolSize); corePoolSize: 保留在池中的线程数，即使它们处于空闲状态。
    private static ScheduledExecutorService schedEs = Executors.newScheduledThreadPool(10);

    public static void main(String[] args) {
//        schedule();
//        scheduleWithFixedDelay();
        scheduleAtFixedRate();
    }

    public static void schedule(){
        System.out.println("Start...");

        ScheduledFuture<String> future = schedEs.schedule(() -> "A", 2, TimeUnit.SECONDS);

        try{
            System.out.println(future.get());

        }catch(InterruptedException | ExecutionException ex){
            ex.printStackTrace();
        }finally {
            schedEs.shutdown();
        }
        System.out.println("Always at the end!");
    }

    public static void scheduleWithFixedDelay(){
        System.out.println("Start...");
        /**
         * 提交一个周期性动作，该动作在给定的初识延迟后首先启用，然后在一次执行的种植和下一次执行的开始之间有给定的延迟。
         * 任务执行顺序无限期地继续， 知道发生以下异常完成之一：
         * 任务是明确取消通过返回的未来。
         * 执行者取消，也导致任务取消。
         * 任务的执行抛出异常。在这种情况下， 对返回的future调用get将抛出ExecutionException，将异常作为其原因。
         */
        final long INITIAL_DELAY = 2000, WAIT_PERIOD_AFTER_PREVIOUS_TASK_FINISHED=300;
        schedEs.scheduleWithFixedDelay(()-> System.out.println("Thread id: " + Thread.currentThread().getId()),
                INITIAL_DELAY, WAIT_PERIOD_AFTER_PREVIOUS_TASK_FINISHED,TimeUnit.MILLISECONDS);
    }

    public static void scheduleAtFixedRate(){
        System.out.println("Start...");

        final long INITIAL_DELAY = 2000, WAIT_PERIOD_BEFORE_STARTING_NEXT_TASK=300;
        schedEs.scheduleAtFixedRate(()-> System.out.println("Thread id: " + Thread.currentThread().getId()),
                INITIAL_DELAY, WAIT_PERIOD_BEFORE_STARTING_NEXT_TASK, TimeUnit.MILLISECONDS);
    }
}
