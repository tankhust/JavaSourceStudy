package com.tank;

import java.util.concurrent.CountDownLatch;

/**
 * @author tank
 * @create 2020/05/07 16:13
 */
public class TestCountDownLatch {
    public static void main(String[] args) {
        Thread t = new Thread();
        TestCountDownLatch test = new TestCountDownLatch();
        long timetasks = test.timetasks(5, t);
        System.out.println(timetasks);
    }

    public long timetasks(int nThreads, Runnable task) {
        final CountDownLatch startGate = new CountDownLatch(1);
        final CountDownLatch endGate = new CountDownLatch(nThreads);

        for (int i = 0; i < nThreads; i++) {
            Thread t = new Thread(){
                @Override
                public void run() {
                    try {
                        startGate.await();
                        try {
                            task.run();
                        }finally {
                            endGate.countDown();
                        }
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            };
            t.start();
        }

        long start = System.nanoTime();
        startGate.countDown();
        try {
            endGate.await();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        long end = System.nanoTime();
        return end - start;
    }

}
