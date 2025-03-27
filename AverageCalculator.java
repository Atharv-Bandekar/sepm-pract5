public class AverageCalculator {
    public static void main(String[] args) {
        // Predefined array of numbers
        double[] numbers = {10, 20, 30, 40, 50};
        double sum = 0;

        // Calculating sum
        for (double num : numbers) {
            sum += num;
        }

        // Calculating average
        double average = sum / numbers.length;

        // Displaying the result
        System.out.println("Average: " + average);
    }
}

