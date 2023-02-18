package kr.code6150;

import kr.code6150.ticketing.Timer;

import java.util.HashMap;
import java.util.Scanner;

public class ddd {

    public static void main(String[] args) {

        HashMap<String,Integer> map = new HashMap<>();

        new Timer(10).start();
        Scanner sc = new Scanner(System.in);
        System.out.print("5초 이내로 입력하세요 : ");
        sc.nextLine();

    }

}
