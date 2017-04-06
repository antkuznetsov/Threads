package ru.innopolis;

/**
 * Created by Kuznetsov on 06/04/2017.
 */
public class MyTimer extends Thread {

    public void run() {
        while (true) {
            try {
                Thread.sleep(1000); // Время ожидания 1 сек.
                System.out.println("Сообщение из потока " + this.getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public MyTimer() {
        this.start();
    }
}