package Day23;

public class MoreIfStatements {
    public static void main(String []args){
        int y = 1;
        int z = 50;
        int x = 51;

        if (x > 50) {
            y = x + z;
        } else if (x == 10) {
            y = x + x;
        } else {
            y = 1;
        }

        System.out.println(y);

    }
}
