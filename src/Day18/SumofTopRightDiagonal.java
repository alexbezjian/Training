package Day18;

public class SumofTopRightDiagonal {

    public static void main(String[] args) {

//        f2();
        System.out.println();
        f3();
        f4();
    }

    private static void f2() {
        for (int i = 0; i <= 3; i++) {
            for (int j = i; j <= 3; j++) {
                System.out.print(" * ");
            }

            System.out.println();
            for (int k = 0; k <= i; k++) {
                System.out.print("   ");
            }
        }
    }

    private static void f3() {
        for (int i = 0; i <= 3; i++) {
            for (int k = 0; k < 3 - i; k++) {
                System.out.print("   ");
            }
            for (int j = 3 ; j >= 3 - i; j--) {
                System.out.print(" * ");
            }

            System.out.println();

        }
    }
    private static void f4() {
        for (int i = 0; i <= 3; i++) {
            for(int k = 0; k < 3; k--) {
                System.out.println("   ");
            }
            for (int j = 3; j >= 3; j++) {
                System.out.println(" * ");


            }
        }

    }

}

