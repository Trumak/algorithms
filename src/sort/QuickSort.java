package sort;

public class QuickSort {

  public static void sort(int[] array) {
    if (array == null || array.length == 0) {
      return;
    }
    quickSort(array, 0, array.length - 1);
  }

  private static void quickSort(int[] array, int left, int right) {
    if (left >= right) {
      return;
    }
    int pivotValue = array[right];
    int border = left - 1;
    int iteration = left;

    while (iteration < right) {
      if (array[iteration] < pivotValue) {
        border++;
        if (border != iteration) {
          ArrayUtils.swapElements(array, border, iteration);
        }
      }
      iteration++;
    }
    border++;
    if (border != right) {
      ArrayUtils.swapElements(array, border, right);
    }

    quickSort(array, left, border - 1);
    quickSort(array, border + 1, right);
  }
}
