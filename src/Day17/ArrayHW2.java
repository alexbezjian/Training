package Day17;

public class ArrayHW2 {

    static int[][] a = new int[][]{
            {1, 2, 3, 7},
            {8, 9, 4, 3},
            {7, 6, 5, 6},
            {2, 7, 8, 5}
    };

    public static void main(String args[]) {
        f7();
    }

    private static void f7() {
        int sum = 0;

    }

    public static int f7(int a[][], int m, int n) {

            int sum = 0;

        for (int i = 0; i < m; i++) {
            for (int j = 0; j < n; j++) {
                System.out.println(" * ");
                if (i == 0)
                    sum += a[i][j];
                else if (i == m - 1)
                    sum += a[i][j];
                else if (j == 0)
                    sum += a[i][j];
                else if (j == n - 1)
                    sum += a[i][j];
            }
        }
        return sum;
    }

    {int sum = f7(a, 4, 4);
        System.out.println("Sum of boundary elements" +
                " is " + sum);
    }
}
