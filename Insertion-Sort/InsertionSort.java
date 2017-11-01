/**
 * Insertion Sort
 */
public class InsertionSort {

  public static void main(String[] args) {

    int[] num = {3, 60, 35, 2, 45, 320, 5};
    System.out.print("Before Insertion Sort: ");
    printArray(num);

    // sort the items
    insertionSort(num);

    System.out.print("After Insertion Sort: ");
    printArray(num);
  }

  static void insertionSort(int[] num) {

    for (int i = 1; i < num.length; i++) {
      int key = num[i];
      int j;
      for (j = i - 1; j >= 0 && key < num[j]; j--) {
        // smaller values are moving up
        num[j + 1] = num[j];
      }
      // put the key in its proper location
      num[j + 1] = key;
    }

  }

  static void printArray(int[] num) {
    for (int i = 0; i < num.length; i++) {
      System.out.print(num[i] + " ");
    }
    System.out.println();
  }

}