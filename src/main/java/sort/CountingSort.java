package main.java.sort;

public class CountingSort {

  public static void sort(int[] array) {
    int n = array.length;
    int[] output = new int[n];
    int[] count = new int[256];

    for (int i = 0; i < count.length; i++) {
      count[i] = 0;
    }

    for (int i = 0; i < n; i++) {
      count[array[i]]++;
    }

    for (int i = 1; i <= 255; i++) {
      count[i] += count[i - 1];
    }

    for (int i = 0; i < n; i++) {
      output[count[array[i]] - 1] = array[i];
      count[array[i]]--;
    }

    for (int i = n - 1; i >= 0; i--)
      array[i] = output[i];
  }
}
