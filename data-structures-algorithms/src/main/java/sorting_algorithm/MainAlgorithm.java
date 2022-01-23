package sorting_algorithm;

public class MainAlgorithm {
    public static void main(String... args) {
        int myArray[] = {2, 23, 44, 7, 3};
        BubbleSort.sort(myArray);
        System.out.println("Bubble Sort");
        printArray(myArray);
        SelectionSort.sort(myArray);
        System.out.println("Selection Sort");
        printArray(myArray);
    }

    public static void printArray(int arr[]) {
        for (int i = 0; i < arr.length; i++) { // O(N)
            System.out.println(arr[i]); // O(1)
        }
    }
}