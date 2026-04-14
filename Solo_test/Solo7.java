package Ch06;

import java.util.Scanner;

public class Solo7 {
    public static void main(String[] args) {
//        ## 문제 10. 구구단
//
//        단수 N을 입력받아 구구단을 출력하시오.
//
//                **실행 예시 (N=3)**
//
//```
//        3 × 1 = 3
//        3 × 2 = 6
//...
//        3 × 9 = 27
//```
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();

        for (int i= 1; i<=9; i++ ) {
            System.out.println(N +"x" + i + "=" +(N * i));
        }


    }
}
