package Ch06;

import java.util.Scanner;

public class Solo4 {
//## 문제 5. 2의 배수만 출력
//
//1부터 20까지 수 중 2의 배수만 출력하시오. (for 문 사용)
//
//            **출력**
//    2 4 6 8 10 12 14 16 18 20
public static void main(String[] args) {
//    for (int i =1; i<=20; i++){
//        if (i % 2 ==0) {
//            System.out.print(i + " ");
//            i++;
//          }
//          }

//## 문제 6. A + B
//
//    두 정수를 입력받아 합을 출력하시오.
//            단, A > 0, B < 10 조건을 만족하지 않으면 재입력 받는다.
//
//            **실행 예시**
//
//```
//    첫 번째 값을 입력하세요: 7
//    두 번째 값을 입력하세요: 9
//    7 + 9 = 16
//```
    Scanner sc = new Scanner(System.in);

        int A,B;

        do{
            System.out.println("첫번째 값을 입력하세요: ");
            A = sc.nextInt();

            System.out.println("두번째 값을 입력하세요:");
            B = sc.nextInt();

            if(!(A > 0 && B < 10)) {
                System.out.println("조건을 만족하지 않습니다 다시 입력해주세요");
            }

        }while(!(A > 0 && B < 10));
         System.out.println(A + " + " + B +" = " + (A + B));
}
}

