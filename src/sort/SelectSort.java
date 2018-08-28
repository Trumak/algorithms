package sort;

public class SelectSort {

  public static void sort(int[] array) {
    int it = 0;
    int n = array.length;
    int currentMinIndex;
    while (it < n - 1) {
      currentMinIndex = it;
      for (int j = it + 1; j < n; j++) {
        if (array[currentMinIndex] > array[j]) {
          currentMinIndex = j;
        }
      }
      if (it != currentMinIndex) {
        ArrayUtils.swapElements(array, it, currentMinIndex);
      }
      it++;
    }
  }
}
