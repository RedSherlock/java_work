package Ch06;

import java.util.Scanner;

public class solo8 {
    public static void main(String[] args) {
//        ## 문제 11. 심화 — 누적합
//
//        n을 입력받아 아래 식의 결과를 출력하시오.
//
//```
//        n=5 일 때:
//        1 + (1+2) + (1+2+3) + (1+2+3+4) + (1+2+3+4+5) = 35
//```
//
//**실행 예시**
//
//```
//        n을 입력하세요: 5
//        결과: 35
//```

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int result = 0;

        for (int i = 1; i <= n; i++) {   // 바깥: 단계
            int sum = 0;

            for (int j = 1; j <= i; j++) { // 안쪽: 1~i까지 합
                sum += j;
            }

            result += sum; // 누적합 더하기
        }

        System.out.println("결과: " + result);

    }
}
