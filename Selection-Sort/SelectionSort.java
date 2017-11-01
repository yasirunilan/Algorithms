/**
 * Selection Sort Implementation
 */
public class SelectionSort {

  public static void main(String[] args) {

    int[] num = {3, 60, 35, 2, 45, 320, 5};
    System.out.print("Before Selection Sort: ");
    printArray(num);

    // sort the items
    selectionSort(num);

    System.out.print("After Selection Sort: ");
    printArray(num);
  }

  static void selectionSort(int num[]) {
    int n = num.length;

    // one by one move boundary of unsorted subarray
    for (int i = 0; i < n - 1; i++) {
      // find the minimum element in unsorted array
      int min_idx = i;
      for (int j = i + 1; j < n; j++) {
        if (num[j] < num[min_idx]) {
          min_idx = j;
        }
      }

      // swap the found minimum element with the first element
      int temp = num[min_idx];
      num[min_idx] = num[i];
      num[i] = temp;
    }
  }

  static void printArray(int num[]) {
    for (int i = 0; i < num.length; ++i) {
      System.out.print(num[i] + " ");
    }
    System.out.println();
  }

}