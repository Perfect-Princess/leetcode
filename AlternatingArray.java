public class AlternatingArray {
    
    public static boolean isAlternating(int[] arr) {
        if (arr.length <= 1) {
            return false;
        }
        boolean isPositive = arr[0] > 0;
        for (int i = 1; i < arr.length; i++) {
            if (isPositive) {
                if (arr[i] > 0) {
                    return false;
                }
            } else {
                if (arr[i] < 0) {
                    return false;
                }
            }
            isPositive = !isPositive;
        }
        return true;
    }
    
    public static void main(String[] args) {
        int[] arr1 = {1, -2, 3, -4, 5};
        int[] arr2 = {-1, 2, -3, 4, -5};
        
        System.out.println(isAlternating(arr1)); // true
        System.out.println(isAlternating(arr2)); // false
    }
}
