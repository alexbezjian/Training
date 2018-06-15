package Day17;

import java.util.Arrays;

public class ArrayIntReverse {

    public static void main(String[] args) {
        int[] ReverseArray = {
                875, 324, 278, 654, 491,
                343, 117, 612, 399, 102};
        System.out.println("Original array : " + Arrays.toString(ReverseArray));

        for (int i = 0; i < ReverseArray.length / 2; i++) {
            int temp = ReverseArray[i];
            ReverseArray[i] = ReverseArray[ReverseArray.length - i - 1];
            ReverseArray[ReverseArray.length - i - 1] = temp;
        }

        System.out.println("Reverse array : " + Arrays.toString(ReverseArray));
    }
}
