package main.java.sort;

public class ArrayUtils {

  public static void printArray(int[] array) {
    int n = array.length;

    for (int i = 0; i < n; i++) {
      System.out.print(array[i] + " ");
    }
    System.out.println();
  }

  public static void swapElements(int[] array, int index1, int index2) {
    int temp = array[index1];
    array[index1] = array[index2];
    array[index2] = temp;
  }


}
