package sort;

public class MergeSort {

  private static int[] additionalArray;

  public static void sort(int[] array) {
    additionalArray = new int[array.length];
    mergeSort(array, 0, array.length-1);

  }

  private static void mergeSort(int[] arr, int left, int right) {
    if(left < right) {
      int mid = (left + right) / 2;
      mergeSort(arr, left, mid);
      mergeSort(arr,mid + 1, right);
      merge(arr, left, mid, right);
    }
  }

  private static void merge(int[] arr, int left, int mid, int right) {
    for(int i = left; i <= right; i++){
      additionalArray[i] = arr[i];
    }
    int ponter1 = left;
    int ponter2 = mid + 1;
    int current = left;

    while(ponter1 <= mid && ponter2 <= right) {
      if (additionalArray[ponter1] <= additionalArray[ponter2]) {
        arr[current] = additionalArray[ponter1];
        ponter1++;
      }
      else {
        arr[current] = additionalArray[ponter2];
        ponter2++;
      }
      current++;
    }
    while (ponter1 <= mid) {
      arr[current] = additionalArray[ponter1];
      current++; ponter1++;
    }
  }

}
