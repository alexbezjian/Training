package Day22;



public class WhileStatement {
    public static void main(String[] args) {
        int x = 0;
        int sum = 0;
        while (x < 10) {
            if (x >= 3 && x <= 7){
                sum = sum + x;
            }


            x++;
        }


        System.out.println(sum);

    }
}
