package Ch06;

import java.util.Scanner;

public class Solo5 {
    public static void main(String[] args) {
//        ## 문제 7. 두 수 사이 합
//
//        두 정수 A, B를 입력받아 A와 B 사이의 모든 정수를 더해 출력하시오.
//        (A > B 이어도 동작해야 한다)
//
//**실행 예시**
//
//```
//        첫 번째 값: 2
//        두 번째 값: 7
//        결과: 27
//
//        첫 번째 값: 7
//        두 번째 값: 2
//        결과: 27
//```
        Scanner sc = new Scanner(System.in);


        int A = sc.nextInt();
        int B = sc.nextInt();

        int start = Math.min(A,B);
        int end = Math.max(A,B);
        int sum = 0;

        for(int i = start; i <= end; i++) {
            sum += i;
        }
        System.out.println(sum);

    }
}
