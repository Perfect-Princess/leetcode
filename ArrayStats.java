// Using an array of 20 integers ,write a program that prints the follo
// number of positive numbers
// number of negative numbers
// number of odd numbers
// number of even numbers
// number of 0s

public class ArrayStats {
    public static void main(String[] args) {
        int[] arr = {1, 2, -3, 4, 5, 0, -6, 7, 8, 0, 9, -10, 11, 12, -13, 0, 14, 15, -16, 17};

        int positiveCount = 0;
        int negativeCount = 0;
        int oddCount = 0;
        int evenCount = 0;
        int zeroCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > 0) {
                positiveCount++;
            } else if (arr[i] < 0) {
                negativeCount++;
            } else {
                zeroCount++;
            }

            if (arr[i] % 2 == 0) {
                evenCount++;
            } else {
                oddCount++;
            }
        }

        System.out.println("Positive count: " + positiveCount);
        System.out.println("Negative count: " + negativeCount);
        System.out.println("Odd count: " + oddCount);
        System.out.println("Even count: " + evenCount);
        System.out.println("Zero count: " + zeroCount);
    }
}
