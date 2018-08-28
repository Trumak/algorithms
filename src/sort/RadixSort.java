package sort;

import java.util.Arrays;

public class RadixSort {

  public static void sort(int[] array) {
    int n = array.length;

    int max = getMax(array);

    for (int exp = 1; max / exp > 0; exp *= 10)
      countingSort(array, n, exp);


  }

  private static int getMax(int[] array) {
    int max = array[0];

    for (int i = 1; i < array.length; i++) {
      if (array[i] > max) {
        max = array[i];
      }
    }
    return max;
  }

  private static void countingSort(int[] array, int n, int exp) {
    int[] countArray = new int[10];
    int[] outputArray = new int[n];
    Arrays.fill(countArray, 0);

    for (int i = 0; i < n; i++) {
      countArray[(array[i] / exp) % 10]++;
    }

    for (int i = 1; i < 10; i++) {
      countArray[i] += countArray[i - 1];
    }

    for (int i = n -1; i >= 0; i--) {
      outputArray[countArray[(array[i] / exp) % 10] - 1] = array[i];
      countArray[(array[i] / exp) % 10]--;
    }

    for (int i = 0; i < n; i++)
      array[i] = outputArray[i];
  }
}
