/**
 * Merge Sort Implementation
 */
public class MergeSort {

  public static void main(String[] args) {
    int[] array = {3, 60, 35, 2, 45, 320, 5};
    System.out.print("Before Merge Sort: ");
    printArray(array);

    // sort the items
    mergeSort(array, 0, array.length - 1);

    System.out.print("After Merge Sort: ");
    printArray(array);
  }


  static void mergeSort(int[] array, int low, int high) {
    if (low < high) {
      int middle = (low + high) / 2;
      // sort the first half
      mergeSort(array, low, middle);
      // sort the second half
      mergeSort(array, middle + 1, high);
      // merge both the sorted halfs
      merge(array, low, middle, high);
    }
  }

  static void merge(int[] array, int low, int middle, int high) {
    int[] helper = new int[array.length];
    for (int i = low; i <= high; i++) {
      helper[i] = array[i];
    }

    int helperLeft = low;
    int helperRight = middle + 1;
    int current = low;

    while (helperLeft <= middle && helperRight <= high) {
      if (helper[helperLeft] <= helper[helperRight]) {
        array[current] = helper[helperLeft];
        helperLeft++;

      } else {
        array[current] = helper[helperRight];
        helperRight++;
      }
      current++;
    }

    int remaining = middle - helperLeft;
    for (int i = 0; i <= remaining; i++) {
      array[current + i] = helper[helperLeft + i];
    }
  }

  static void printArray(int[] num) {
    for (int i = 0; i < num.length; i++) {
      System.out.print(num[i] + " ");
    }
    System.out.println();
  }

}