package Day23;

public class MoreWhileStatements {
    public static void main(String []args){
        int x = 666;
        int sum = 0;
        while (x < 1000) {
            if (x <= 500){
                sum = sum * x;
            }
            x++;
        }


        System.out.println(sum);
    }
}
