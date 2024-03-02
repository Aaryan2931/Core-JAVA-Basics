
public class Average_Array {
    public static void main(String[] args) {
        // Create an array of integers
        int[] numbers = { 20, 30, 25, 35, -16, 60, -100 };
        // Calculate the sum of all array elements
        int sum = 0;
        for (int i = 0; i < numbers.length; i++) {
            sum += numbers[i];
        }
        // Calculate the average value
        double average = (double) sum / numbers.length;
        // Print the average value
        System.out.println("The average value of the array elements is: " + average);
    }

}
