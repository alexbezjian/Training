package Day18;

public class SumofLeftDiagonal2 {
    static int[][] arr = new int[][]{
            {1, 2, 3, 4},
            {5, 6, 7, 8},
            {9, 10, 11, 12},
            {13, 14, 15, 16}
    };

    public static void main(String[] args) {

        f1();
        System.out.println();
        f2();
    }

    private static void f1() {
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }
    }

    private static void f2() {
        for (int i = 0; i < 4; i++) {
            for (int j = 3 -i; j >= 0; j--) {
                System.out.print(" * ");
            }

            System.out.println();
        }
    }
}