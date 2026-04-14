package view;

import java.util.Scanner;

public class ContactView {
    private final Scanner sc;

    public ContactView(Scanner sc) {
        this.sc = sc;
    }

    public void run() {
        while (true) {
            System.out.println("1.추가 2.목록 3.수정 4.삭제 -1.종료");
            int cmd = sc.nextInt();
            sc.nextLine(); // 버퍼 정리 (추천)

            switch (cmd) {
                case -1:
                    return;
                case 1:
                    create();
                    break;
                case 2:
                    readAll();
                    break;
                case 3:
                    update();
                    break;
                case 4:
                    delete();
                    break;
                default:
                    System.out.println("잘못 입력함");
            }
        }
    }

    private void create() {
        System.out.println("추가 기능");
    }

    private void readAll() {
        System.out.println("목록 기능");
    }

    private void update() {
        System.out.println("수정 기능");
    }

    private void delete() {
        System.out.println("삭제 기능");
    }
}