package Ch06;

import java.util.Scanner;

public class Solo6 {
    public static void main(String[] args) {
//        ## 문제 9. 별찍기 내림차순
//
//        줄 수 N을 입력받아 아래와 같이 출력하시오.
//
//                **실행 예시 (N=5)**
//
//```
//*****
//****
//***
//**
//*
//```
//        Scanner sc = new Scanner(System.in);
//        int N = sc.nextInt();
//        for (int i = N; i > 0; i--) {
//            for (int j =1; j <= i; j++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }
//## 문제 8. 별찍기 오름차순
//
//        줄 수 N을 입력받아 아래와 같이 출력하시오.
//
//                **실행 예시 (N=5)**
//
//```
//*
//**
//***
//****
//*****
//```
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        for (int i = 1; i <= N; i++) {
            for (int j=1; j<= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }



    }
}
