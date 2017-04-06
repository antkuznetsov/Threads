package ru.innopolis;

/**
 * Created by Kuznetsov on 06/04/2017.
 */
public class MyClock implements Runnable {
    public void run() {
        while(true) { //бесконечно крутим
            try {
                Thread.sleep(1000); // 4 секунды в милисекундах
                System.out.println("Сообщение каждые 5 секунд");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }
}
