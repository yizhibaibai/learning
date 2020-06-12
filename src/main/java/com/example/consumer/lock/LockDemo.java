package com.example.consumer.lock;

public class LockDemo {
    private static Object a = new Object();
    private static Object b = new Object();

    public static void main(String[] args) {
        new Thread(()->{
            System.out.printf("线程1开始执行...");
            synchronized (a){
                System.out.printf("线程1拿到a锁");
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (b){
                    System.out.printf("线程1拿到b锁");
                }
            }
        }).start();

        new Thread(() ->{
            System.out.printf("线程2开始执行...");
            synchronized (b){
                //休眠2秒
                try {
                    Thread.sleep(2000);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                synchronized (a){
                    System.out.printf("线程2拿到a锁");
                }
            }
        }).start();

    }
}
