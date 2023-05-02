public class MissingLetter {
    public static char findMissingLetter(char[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i + 1] - arr[i] != 1) {
                
                return (char) (arr[i] + 1);
            }
        }
        // If no missing letter found, return space character
        return ' ';
    }

    public static void main(String[] args) {
        char[] arr = {'a', 'c', 's', 't'};
        char missingLetter = findMissingLetter(arr);
        System.out.println("Missing letter in the array: " + missingLetter);
        
    }
}

