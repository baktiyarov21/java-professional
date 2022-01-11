package interview_question;

import java.util.Arrays;


public class ArrayMain {
  public static void main(String[] args) {
    ArrayMain arrayMain = new ArrayMain();
    int[] arr = new int[] {1, 2, 3, 4};
    arrayMain.reverseArr(arr);
 
  } 

  public void reverseArr(int[] array) {
    for(int i = 0; i < array.length/2; i++) { // O(N / 2)
      int last = array.length - i - 1; //O(1)
      int temp = array[i]; //O(1)
      array[i] = array[last]; //O(1)
      array[last] = temp; //O(1)
    }
    System.out.println(Arrays.toString(array)); //O(1)
	// O(N / 2) --> O(N) 
  }
}   