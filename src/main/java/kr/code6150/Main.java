package kr.code6150;

import java.util.*;

public class Main {


    int a = 10; // 인스턴스 (맴버) 변수 ->
    static int b; // 전역 변수 -> data 메모리

    //(String args) args 매개변수 -> stack 메모리
    public static void main(String[] args) {

        int a = 10; // 정수 1개 지역 변수 -> stack 메모리
        //배열
        int[] arr = new int[10];

        // [List, Set], Map
        // 제네릭 -> 기본형 타입 올 수 없다.
        // int, short, long, char, byte, double, boolean, float -> (기본형)
        //  - 해당 변수가 선언 된 공간에 타입에 맞는 값을 저장.
        // 기본현을 제외한 타입은 모두 -> 참조형
        // Wrapper class -> 기본형을 class로 표현

        int num; // (타입) (이름);
        ArrayList<Integer> list = new ArrayList<>(); // (타입) (이름);
        String s = "Can't nobody tell me nothing. You can't tell me nothing.";
        // 중복 (o) , 추가한 순서대로 저장
        list.add(10);
        list.add(15);
        list.add(20);

        // 객체의 주소를 비교 remove(Object o) 해당 객체의 주소가 같으면
        list.remove(new Integer(10));

        if(list.contains(10)) System.out.println("d");

        HashSet<String> set = new HashSet<>();
        // 중복(x) , 객체의 값 순서대로 저장, 정렬 불가
        set.add("add");
        set.add("abb");
        set.add("acv");

        //=============================================

        // K = Key   => 키 타입
        // V = Value => 값 타입
        // 키:값
        HashMap<String,Integer> map = new HashMap<>();

        map.put("홍길동", 19);
        map.get("홍길동");

        //computeIfAbsent -> 없다면
        //computeIfPresent -> 있다면

        map.computeIfPresent("홍길동", (key, value) -> {
            return 19;
        });


//        ArrayList<String> list1 = new ArrayList<>();
//        HashSet set1 = new HashSet();

    }
}
