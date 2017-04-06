package ru.innopolis;

/**
 * Created by Kuznetsov on 06/04/2017.
 */
public class MyThread extends Thread {

    long startTime = System.currentTimeMillis();

    public void run() {
        System.out.println("Поток запущен");
    }

    public MyThread() {

        this.start();

    }

    public long getTime() {

        return System.currentTimeMillis() - startTime;

    }

}
