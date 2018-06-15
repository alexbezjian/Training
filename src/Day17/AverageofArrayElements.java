package Day17;

public class AverageofArrayElements {
        public static void main(String[] args) {

            int[] numbers = {5, 10, 15, 5, 25};
            int sum = 0;
            for(int i=0; i < numbers.length ; i++) {
                sum = sum + numbers[i];
            }
            double average = sum / numbers.length;
            System.out.println("Average value" + "= " + average);
        }
    }
