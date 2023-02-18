package kr.code6150.ticketing;

public class Timer extends Thread  {

    // 기본 생성자
    // public Timer() {}

    //맴버 (인스턴스) 변수 -> 객체 생성시 생성, 객체 소멸시 소멸

    private int timer;
    public Timer(int timer) {
        this.timer = timer;
    }

    @Override
    public void run() {
        //해당 스레드가 start() 되었을 때, 자동으로 실행 될 메서드
        for(int i = 0; i < timer; i++) {
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        System.out.println(timer+"초가 지났습니다.");
        System.exit(1);

    }

}
