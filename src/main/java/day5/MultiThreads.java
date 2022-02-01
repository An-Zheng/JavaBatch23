package day5;

import java.awt.color.ICC_ColorSpace;
import java.util.concurrent.*;

public class MultiThreads {
    public static void main(String[] args) throws InterruptedException {
        //1
//        Thread fromThread = new FromThread();
//        fromThread.start();
//
//        //2
//        Thread fromRunnable = new Thread(new FromRunnable());
//        fromRunnable.start();
//        //3 FromCallable
//        FutureTask futureTask = new FutureTask(new FromCallable());
//        Thread t3 = new Thread(futureTask);
//        t3.start();

//        fromThread.join();
//        fromRunnable.join();
//        t3.join();
       //4 ThreadPool
        ExecutorService threadPool = new ThreadPoolExecutor(3,
                5,
                1L,
                TimeUnit.SECONDS,
                new ArrayBlockingQueue<>(3),
                Executors.defaultThreadFactory(),
                new ThreadPoolExecutor.AbortPolicy()
        );

        for (int i = 0; i < 8; i++)
        {
            threadPool.execute(() ->{
                System.out.println(Thread.currentThread().getName() + ":"+"dsfsdf");
            });
        }
    }
}

class FromThread extends Thread{
    @Override
    public void run() {

        System.out.println("extends Thread class, the current thread is "
                + Thread.currentThread().getName());
    }
}

class FromRunnable implements Runnable{
    @Override
    public void run() {
        System.out.println("From runnable, the current thread is "
                + Thread.currentThread().getName());
    }
}

class FromCallable implements Callable{
    @Override
    public Integer call() throws Exception {
        System.out.println("Implements Callable interface, the current thread is "
                + Thread.currentThread().getName());
        return 200;
    }
}