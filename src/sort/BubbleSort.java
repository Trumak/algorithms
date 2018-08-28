package sort;

public class BubbleSort {

  public static void sort(int[] array) {
    int n = array.length;
    int it = 1;

    while (it < n) {
      int j = 0;
      while (j < n - 1) {
        if (array[j] > array[j + 1]) {
          ArrayUtils.swapElements(array, j, j + 1);
        }
        j++;
      }
      it++;
    }
  }
}
