package BookExercises;

public class Boolean {
    public static void main(String[]args){
        System.out.println(isOdd(1));
    }
    public static boolean isOdd(int i) {
        return (i & 1) != 0;
    }
}
