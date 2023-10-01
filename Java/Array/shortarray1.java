import java.util.Arrays;

public class ArraySortExample {
    public static void main(String[] args) {
        int[] numbers = {5, 2, 9, 1, 5, 6};
        
        // Sort the array in ascending order
        Arrays.sort(numbers);
        
        // Display the sorted array
        System.out.println("Sorted Array:");
        for (int number : numbers) {
            System.out.print(number + " ");
        }
    }
}
