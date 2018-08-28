package sort;

public class InsertionSort {

  public static void sort(int[] array) {
    int n = array.length;
    for(int i =0; i < n; i++) {
        for(int j = i + 1; j < n; j++ ) {
          if(array[i] > array[j]){
            ArrayUtils.swapElements(array, i, j);
          }
      }
    }

  }

  public static void sort2(int[] array) {
    int n = array.length;
    int current;
    int other;
    for(int i = 1; i < n; i++) {
      current = array[i];
      other = i;
      while (other > 0 && array[other - 1] > current) {
        array[other] = array[other - 1];
        other--;
      }
      array[other] = current;
    }
  }

}
