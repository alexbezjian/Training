package Day17;

public class ArraySpecificValue {

    public static boolean contains(int[] arr, int item) {
        for (int x : arr) {
            if (item == x) {
                return true;
            }
        }
        return false;
    }

    public static void main(String[] args) {
        int[] a = {
                2009, 1954, 2365, 1254, 9878,
                8954, 5735, 1210, 4360, 8143};
        System.out.println(contains(a, 1254));
        System.out.println(contains(a, 2009));
        System.out.println(contains(a, 4));
    }
}
