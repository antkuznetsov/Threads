package ru.innopolis;

/**
 * Created by Kuznetsov on 06/04/2017.
 */
public class MyClock extends Thread {

    public void run() {
        while (true) {
            try {
                Thread.sleep(5000); // Время ожидания 5 сек.
                System.out.println("Сообщение из потока " + this.getName());
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    public MyClock() {
        this.start();
    }
}