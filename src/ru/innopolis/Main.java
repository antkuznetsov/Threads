package ru.innopolis;

public class Main {

    public static void main(String[] args) {

        //MyThread thread = new MyThread();

        //System.out.println(demo);

        //long time = thread.getTime();
        /*
        new Thread(new Runnable() {
            public void run() {
                while(true) { //бесконечно крутим
                    try {
                        Thread.sleep(1000); // 4 секунды в милисекундах
                        System.out.println("Каждую секунду: " + thread.getTime());
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    }
                }
            }
        }).start();
        */

        MyTimer timer = new MyTimer();
        MyClock clock = new MyClock();

        timer.run();
        clock.run();

        //timer.run();
    }
}
