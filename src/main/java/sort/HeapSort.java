package main.java.sort;

public class HeapSort {

  public static void sort(int[] array) {
    int n = array.length;

    for (int i = n / 2 - 1; i > 0; i--) {
      HeapSort.maxHeap(array, n, i);
    }

    for (int i = n - 1; i > 0; i--) {
      ArrayUtils.swapElements(array, 0, i);
      HeapSort.maxHeap(array, n -1, 0);
    }
  }

  private static void maxHeap(int[] array, int heapSize, int parentIndex) {
    int maxElementIndex = parentIndex;
    int left = parentIndex * 2 + 1;
    int right = parentIndex * 2 + 2;
    if (left < heapSize && array[left] > array[parentIndex]) {
      maxElementIndex = left;
    }

    if (right < heapSize && array[right] > array[parentIndex]) {
      maxElementIndex = right;
    }

    if (maxElementIndex != parentIndex) {
      ArrayUtils.swapElements(array, parentIndex, maxElementIndex);
      maxHeap(array, heapSize, maxElementIndex);
    }
  }
}
