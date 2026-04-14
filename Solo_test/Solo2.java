package Ch06;

public class Solo2 {
    public static void main(String[] args) {
//        for(int i = 1; i<=10; i++) {
//            if(i == 6) continue;
//            System.out.println(i + " ");
//        }
        int i = 1;

        while (i<=10) {
            if (i == 6) {
                i++;
                continue;
            }
            System.out.println(i + " ");
            i++;
        }
    }
}
