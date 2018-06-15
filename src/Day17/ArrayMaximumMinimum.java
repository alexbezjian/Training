package Day17;
import java.util.Arrays;

public class ArrayMaximumMinimum {

    static int max;
    static int min;

    public static void max_min(int A3[]) {
        max = A3[0];
        min = A3[0];
        int len = A3.length;
//        for (int i = 1; i < len - 1; i = i + 2) {
//            if (i + 1 > len) {
//                if (A3[i] > max) max = A3[i];
//                if (A3[i] < min) min = A3[i];
//            }
//            if (A3[i] > A3[i + 1]) {
//                if (A3[i] > max) max = A3[i];
//                if (A3[i + 1] < min) min = A3[i + 1];
//            }
//            if (A3[i] < A3[i + 1]) {
//                if (A3[i] < min) min = A3[i];
//                if (A3[i + 1] > max) max = A3[i + 1];
//            }
//        }

        for (int i = 1; i < len; i++) {
            if (A3[i] > max) {
                max = A3[i];
            }

            if (A3[i] < min) {
                min = A3[i];
            }
        }
    }

    public static void main(String[] args) {
        int[] my_array = {1, 45, 24, 17, 51, 72, 73};
        max_min(my_array);
        System.out.println(" Original Array: "+Arrays.toString(my_array));
        System.out.println(" Max value  = " + max);
        System.out.println(" Min value = " + min);
    }
}
