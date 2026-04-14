package Ch06;

public class Solo3 {
    public static void main(String[] args) {
//        for (int i=10; i > 0; i--) {
//            if (i == 3) continue;
//            System.out.println(i + " ");
//
//        }
//        int i =10;
//        while (i>=1) {
//            if (i == 3)
//            {
//                i--;
//                continue;
//            }
//            System.out.println(i + " ");
//            i--;
//        }
        int i = 10;
        do{
            if (i == 3) {
                i--;
                continue;
            }
            System.out.println(i + " ");
            i--;
        } while (i>=1);
    }
}
