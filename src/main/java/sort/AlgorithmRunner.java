package main.java.sort;

import java.util.Random;

public class AlgorithmRunner {

  public static void main(String[] args) {
    Random r = new Random();
    int[] testArray = new int[50];

    for (int i = 0; i < testArray.length; i++) {
      testArray[i] = r.nextInt(200);
    }

    int[] testArray2 = testArray.clone();
    int[] testArray3 = testArray.clone();
    int[] testArray4 = testArray.clone();
    int[] testArray5 = testArray.clone();
    int[] testArray6 = testArray.clone();
    int[] testArray7 = testArray.clone();
    int[] testArray8 = testArray.clone();
    int[] testArray9 = testArray.clone();

/*    ArrayUtils.printArray(testArray);
    long start = System.currentTimeMillis();
    InsertionSort.sort(testArray);
    long stop = System.currentTimeMillis();
    System.out.print(stop - start + "\n");
    ArrayUtils.printArray(testArray);
    System.out.println();
    System.out.println();

    ArrayUtils.printArray(testArray2);
    long start2 = System.currentTimeMillis();
    InsertionSort.sort(testArray2);
    long stop2 = System.currentTimeMillis();
    System.out.print(stop2 - start2 + "\n");
    ArrayUtils.printArray(testArray2);

    System.out.println();
    System.out.println("Select main.java.sort");
    ArrayUtils.printArray(testArray3);
    long start3 = System.currentTimeMillis();
    SelectSort.sort(testArray3);
    long stop3 = System.currentTimeMillis();
    System.out.print(stop3 - start3 + "\n");
    ArrayUtils.printArray(testArray3);


    System.out.println();
    System.out.println("Quick main.java.sort");
    ArrayUtils.printArray(testArray4);
    long start4 = System.currentTimeMillis();
    QuickSort.sort(testArray4);
    long stop4 = System.currentTimeMillis();
    System.out.print(stop4 - start4 + "\n");
    ArrayUtils.printArray(testArray4);

    System.out.println();
    System.out.println("Heap main.java.sort");
    ArrayUtils.printArray(testArray5);
    long start5 = System.currentTimeMillis();
    HeapSort.sort(testArray5);
    long stop5 = System.currentTimeMillis();
    System.out.print(stop5 - start5 + "\n");
    ArrayUtils.printArray(testArray5);

    System.out.println();
    System.out.println("Counting main.java.sort");
    ArrayUtils.printArray(testArray6);
    long start6 = System.currentTimeMillis();
    CountingSort.sort(testArray6);
    long stop6 = System.currentTimeMillis();
    System.out.print(stop6 - start6 + "\n");
    ArrayUtils.printArray(testArray6);


    System.out.println();
    System.out.println("Radix main.java.sort");
    ArrayUtils.printArray(testArray7);
    long start7 = System.currentTimeMillis();
    RadixSort.sort(testArray7);
    long stop7 = System.currentTimeMillis();
    System.out.print(stop7 - start7 + "\n");
    ArrayUtils.printArray(testArray7);


    System.out.println();
    System.out.println("Shell main.java.sort");
    ArrayUtils.printArray(testArray8);
    long start8 = System.currentTimeMillis();
    ShellSort.sort(testArray7);
    long stop8 = System.currentTimeMillis();
    System.out.print(stop8 - start8 + "\n");
    ArrayUtils.printArray(testArray8);*/

    System.out.println();
    System.out.println("Merge sort iterative version");
    ArrayUtils.printArray(testArray9);
    long start9 = System.currentTimeMillis();
    MergeSort.sortIterative(testArray9);
    long stop9 = System.currentTimeMillis();
    System.out.print(stop9 - start9 + "\n");
    ArrayUtils.printArray(testArray9);


  }
}
