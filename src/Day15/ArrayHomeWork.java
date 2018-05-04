package Day15;

import java.util.ArrayList;

public interface ArrayHomeWork {
    public static void main(String[] args) {
        int[][] Arr = new int[][]{
                {3, 17, 55, 12},
                {2, 1, 45, 13},
                {5, 1, 64, 87},
                {14, 12, 16, 34}
        };


            int ans = Arr[0][0] + Arr[0][1] + Arr[0][2] + Arr[0][3] + Arr[1][0] + Arr[1][3] + Arr[2][0] + Arr[2][3] + Arr[3][0] + Arr[3][1] + Arr[3][2] + Arr[3][3];
            int ans2 = Arr[0][0] + Arr[0][1] + Arr[0][2] + Arr[0][3] + Arr[1][1] + Arr[1][2] + Arr[1][3] + Arr[2][2] + Arr[2][3] + Arr[3][3];
            int ans3 = Arr[0][0] + Arr[1][0] + Arr[1][1] + Arr[2][0] + Arr[2][1] + Arr[2][2] + Arr[3][0] + Arr[3][1] + Arr[3][2] + Arr[3][3];

        System.out.println(ans);
        System.out.println(ans2);
        System.out.println(ans3);
    }

}
