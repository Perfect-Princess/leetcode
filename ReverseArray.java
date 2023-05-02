public class ReverseArray {
    public static void main(String[] args) {
        int[] originalArray = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
        int[] reversedArray = new int[10];

        for (int i = 0; i < originalArray.length; i++) {
            reversedArray[9 - i] = originalArray[i];
        }

        // Print the reversed array
        for (int i = 0; i < reversedArray.length; i++) {
            System.out.print(reversedArray[i] + " ");
        }
    }
}

