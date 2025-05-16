import java.util.*;

public class JavaDSATricks {

    public static void main(String[] args) {

        // 1. Use Arrays.fill() to initialize an array with the same value
        // Instead of writing a loop to initialize each index manually
        int[] arr = new int[10];
        Arrays.fill(arr, -1);



        // 2. Use getOrDefault() with HashMap to avoid null checks
        // Prevents NullPointerException when a key doesn’t exist
        Map<Integer, Integer> map = new HashMap<>();
        int count = map.getOrDefault(5, 0);



        // 3. Use computeIfAbsent() to initialize map values concisely
        // Avoids checking if key exists before inserting a default value
        map.computeIfAbsent(5, k -> new ArrayList<>()).add(100);



        // 4. Use StringBuilder for efficient string operations
        // Much faster than using "+" in loops
        StringBuilder sb = new StringBuilder();
        sb.append("Hello").append("World");
        String result = sb.toString();



        // 5. Use Set.add() return value to check duplicates directly
        // Returns false if the element already exists
        Set<Integer> set = new HashSet<>();
        if (!set.add(10)) {
            System.out.println("Duplicate found");
        }



        // 6. Use Collections.frequency() to count occurrences
        // Simple one-liner to count how many times an element appears in a list
        List<String> names = Arrays.asList("a", "b", "a", "c");
        int freq = Collections.frequency(names, "a");  // returns 2



        // 7. Convert List to Set in one line to remove duplicates
        List<Integer> nums = Arrays.asList(1, 2, 2, 3);
        Set<Integer> unique = new HashSet<>(nums);  // [1, 2, 3]



        // 8. Use Arrays.asList() to convert array to List for quick access to list operations
        Integer[] numArr = {1, 2, 3};
        List<Integer> numList = Arrays.asList(numArr);



        // 9. Convert List to array in one line
        // Useful when your logic needs an array instead of a List
        Integer[] newArray = numList.toArray(new Integer[0]);



        // 10. Use Collections.reverse() to reverse a list in one line
        List<Integer> revList = new ArrayList<>(Arrays.asList(1, 2, 3));
        Collections.reverse(revList);  // Now revList = [3, 2, 1]

    }
}
