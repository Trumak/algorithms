package sort;

import java.util.ArrayList;
import java.util.Collections;
import java.util.function.Function;

public class ShellSort {

  public static void sort(int[] array) {
    sort(array, ShellSort::shellDistance);
  }

  private static void sort(int[]arr, Function<Integer, Integer[]> distGenerator){
    int n = arr.length;
    int iter = 1;
    Integer[] distances = distGenerator.apply(n);
    int distance = distances[distances.length - iter];
    int current, otherIndex;
    while(distance >= 1){
      for(int i = distance; i < n; i++){
        current = arr[i];
        otherIndex = i;
        while(otherIndex >= distance && current < arr[otherIndex - distance]){
          arr[otherIndex] = arr[otherIndex - distance];
          otherIndex -= distance;
        }
        arr[otherIndex] = current;
      }
      distance = distances[distances.length - ++iter];
    }
  }

  private static Integer[] shellDistance(int numberOfElements){
    ArrayList<Integer> distances = new ArrayList<>();
    int iteration = 1;
    int generated;
    do{
      generated = numberOfElements / (int)Math.pow(2, iteration);
      distances.add(generated);
      iteration++;
    }while(generated > 0);
    Collections.reverse(distances);
    return distances.toArray(new Integer[distances.size()]);
  }
}
