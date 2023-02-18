package kr.code6150.ticketing;

class MyThreadB implements Runnable {

    private Ticketing ticketing = new Ticketing();
    @Override
    public void run() {
        if (ticketing.ticketing())
            System.out.println("성공");
    }
}

public class Main {

    public static void main(String[] args) {

        MyThreadB s1 = new MyThreadB();
        Thread t1 = new Thread(s1);
        Thread t2 = new Thread(s1);
        Thread t3 = new Thread(s1);

        t1.start();
        t2.start();
        t3.start();


    }

}
