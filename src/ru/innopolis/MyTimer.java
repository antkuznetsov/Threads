package ru.innopolis;

/**
 * Created by Kuznetsov on 06/04/2017.
 */
public class MyTimer implements Runnable{

    public void run() {
        while(true) { //бесконечно крутим
            try {
                Thread.sleep(1000);
                System.out.println("Сообщение каждую секунду");
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

}
