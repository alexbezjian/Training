package Day17;

public class MatrixExample {

    static int[][] a = new int[][]{
            {1, 2, 3, 7},
            {8, 9, 4, 3},
            {7, 6, 5, 6},
            {2, 7, 8, 5}
    };

    public static void main(String args[]) {
        f2();
    }

    private static void f2() {
        int sum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (i==j) {
                    sum = sum + a[i][j];
                }


            }

        }
        System.out.println(sum);
    }

    private static void f1() {

        int sum = 0;

        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                sum = sum + a[i][j];
            }
        }


        System.out.println(sum);
    }

    public static void f3() {
        int max = a[0][0];
        for (int i = 0; i < 4; i++) {
            for (int j = 0; j < 4; j++) {
                if (a[i][j] > max) {
                    max = a[i][j];

                }
            }
        }
    }
}

