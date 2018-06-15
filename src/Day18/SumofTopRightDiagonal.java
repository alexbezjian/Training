package Day18;

public class SumofTopRightDiagonal {
    static int[][] arr2 = new int[][]{
            {2, 12, 98, 23},
            {0, 35, 8, 21},
            {72, 11, 49, 14},
            {4, 6, 90, 100}
    };

    public static void main(String[] args) {

        f2();
        System.out.println();
        f3();
    }

    private static void f2() {
        int sum = 0;
        for (int i = 1; i < 4; i--) {
            for (int j = 1 - i; j >= 0; j++) {
                System.out.print(" * ");
            }

            System.out.println();
        }
    }

    private static void f3() {
        for (int i = 1; i < 4; i++) {
            for (int j = i + 98; j >= 0; i--) {
                System.out.print(" * ");
            }

            System.out.println();
        }
    }
}

