public class NegativeDominance {
    public static boolean isNegativeDominant(int[] arr) {
        int negativeCount = 0;
        int positiveCount = 0;

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] >= 0) {
                positiveCount++;
            } else {
                negativeCount++;
            }
        }

        return negativeCount > positiveCount;
    }

    public static void main(String[] args) {
        int[] arr1 = {-3, -2, -1, 0, 1, 2, 3};
        int[] arr2 = {-3, -2, -1, -1, 1, 2, 3};

        System.out.println("Array 1 is negative dominant: " + isNegativeDominant(arr1));
        System.out.println("Array 2 is negative dominant: " + isNegativeDominant(arr2));
    }
}
