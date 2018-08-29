package main.java.sort;

public class MergeSort {

  private static int[] additionalArray;

  public static void sort(int[] array) {
    additionalArray = new int[array.length];
    mergeSort(array, 0, array.length - 1);

  }

  private static void mergeSort(int[] arr, int left, int right) {
    if (left < right) {
      int mid = (left + right) / 2;
      mergeSort(arr, left, mid);
      mergeSort(arr, mid + 1, right);
      merge(arr, left, mid, right);
    }
  }

  private static void merge(int[] arr, int left, int mid, int right) {
    for (int i = left; i <= right; i++) {
      additionalArray[i] = arr[i];
    }
    int ponter1 = left;
    int ponter2 = mid + 1;
    int current = left;

    while (ponter1 <= mid && ponter2 <= right) {
      if (additionalArray[ponter1] <= additionalArray[ponter2]) {
        arr[current] = additionalArray[ponter1];
        ponter1++;
      } else {
        arr[current] = additionalArray[ponter2];
        ponter2++;
      }
      current++;
    }
    while (ponter1 <= mid) {
      arr[current] = additionalArray[ponter1];
      current++;
      ponter1++;
    }
  }

  public static void sortIterative(int[] array) {
    int n = array.length;
    additionalArray = new int[array.length];
    int left;
    int currentSize;

    for (currentSize = 1; currentSize <= n - 1; currentSize = 2 * currentSize) {
      for (left = 0; left < n - 1; left += 2 * currentSize) {
        int middle = Math.min(left + currentSize - 1, n-1);
        int right = Math.min(left + 2 * currentSize - 1, n - 1);

        merge(array, left, middle, right);
      }
    }
  }

  private static void mergeIterative(int[] array, int left, int middle, int right) {
    int size1 = middle - left + 1;
    int size2 = right - middle;
    int current = left;

    int[] leftArray = new int[size1];
    int[] rightArray = new int[size2];

    for (int i = 0; i < size1; i++ ) {
      leftArray[i] = array[left + i];
    }

    for (int j = 0; j < size2; j++ ) {
      rightArray[j] = array[middle + 1 + j];
    }

    int pointer1 = 0;
    int pointer2 = 0;

    while (pointer1 < size1 && pointer2 < size2) {
      if(leftArray[pointer1] > rightArray[pointer2]) {
        array[current] = rightArray[pointer2];
        pointer2++;
      }
      else {
        array[current] = leftArray[pointer1];
        pointer1++;
      }
      current++;
    }

    while (pointer1 < size1) {
      array[current] = leftArray[pointer1];
      pointer1++;
      current++;
    }

    while (pointer2 < size2) {
      array[current] = rightArray[pointer2];
      pointer2++;
      current++;
    }


  }

}
