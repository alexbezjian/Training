package Day22;

public class IfElseStatementExamples {
    public static void main(String[] args) {
        int y = 1;
        int z = 10;
        int x = 49;

        if (x > 10) {
            y = x + z * z;
        } else if (x == 5) {
            y = x * x;
        } else {
            y = 1;
        }

        System.out.println(y);

    }
}
