import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        double[] nums = {8.4, -2.5, -4.2, 2.4, 3.7, 6.2, -8.6, -3.1, 4.6, -5.8, 7.9, -6.2, 15.4, 67.5, 80.5};
        boolean firstNegative = false;
        double sum = 0;
        for (double numbers : nums) {
            if (numbers < 0) {
                firstNegative = true;
                continue;
            }
            if (firstNegative) {
                sum += numbers;
            }
        }
        System.out.println("Среднее арифметическое чисел: " + sum / nums.length);


        boolean sorted = false;
        double res;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < nums.length - 1; i++) {
                if (nums[i] > nums[i + 1]) {
                    sorted = false;

                    res = nums[i];
                    nums[i] = nums[i + 1];
                    nums[i + 1] = res;
                    System.out.println(Arrays.toString(nums));
                }

            }
        }

    }
}