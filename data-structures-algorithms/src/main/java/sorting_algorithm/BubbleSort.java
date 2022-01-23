package sorting_algorithm;
/*When to use:
    - When the input is almost sorted
    - Space is a concern
    - Easy to implement
    
When to avoid:
    - Average time complexity is poor*/

public class BubbleSort {
    public static void sort(int arr[]) { // -> O(N^2)
        for (int i = 0; i < arr.length; i++) { // O(N)
            for (int j = 0; j < arr.length - i - 1; j++) { // O(N)
                if(arr[j] > arr[j + 1]) { // O(1)
                    int temp = arr[j]; // O(1)
                    arr[j] = arr[j + 1]; // O(1)
                    arr[j + 1] = temp; // O(1)
                }
            }
        }
    }
}
