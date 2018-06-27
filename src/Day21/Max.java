package Day21;

public class Max {
    public static void main(String[] args) {
        int y = 0;
        int a = 1;
        int b = 68;
        int c = 40;
        int d = 5;
        int max = 0;

        if(a > b){
            max = a;
        } else{
            max = b;
        }

        if(c > max) {
            max = c;
        } else{
            max = max;
        }
        if(d > max) {
            max = d;
        } else{
            max = max;
        }

        if (max > 100) {
            y = max + 1;
        } else {
            y = max * max;
        }
        System.out.println(y);






    }
}



