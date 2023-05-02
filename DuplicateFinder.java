import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class DuplicateFinder {
    public static void main(String[] args) {
        String[] strArray = {"foo",  "baz", "foo", "qux", "bar", "qux"};
        Set<String> uniqueSet = new HashSet<>();
        Set<String> duplicateSet = new HashSet<>();

        for (String str : strArray) {
            if (!uniqueSet.add(str)) {
                duplicateSet.add(str);
            }
        }

        System.out.println("Duplicate values: " + Arrays.toString(duplicateSet.toArray()));
    }
}
