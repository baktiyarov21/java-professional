package main.java.searching_algorithm;

public class Searching {

    public static void main(String... args) {
        int[] arr = {4,6,2,5,6,7,8,33,3,5};
        System.out.println(arr[binarySearch(arr, 6)]);
    }

    public static int linearSearch(int[] arr, int value) {
        for(int i = 0; i < arr.length; i++) {
            if(arr[i] == value) {
                return arr[i];
            }
        }
        return -1;
    }

    public static int binarySearch(int[] arr, int value) {
        int start = 0;
        int end = arr.length - 1;
        int middle = (start + end) / 2;
        
        while(arr[middle] != value) {
            if(value < arr[middle]) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
            middle = (start + end) / 2; 
        }

        return middle;
        
    }

}