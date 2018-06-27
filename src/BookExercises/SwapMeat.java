package BookExercises;

public class SwapMeat {

    public static void main(String[] args) {

    int x = 123;
    int y = 321;
    int tmp = x;

    x = y;
    y = tmp;
//    x ^= y ^= x ^= y;
    System.out.println("x = " + x + "; y = " + y);
}
}
