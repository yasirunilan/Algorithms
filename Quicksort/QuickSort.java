/**
 * Quick Sort Implementation
 */
public class QuickSort {

  public static void main(String[] args) {
    int[] num = {3, 60, 35, 2, 45, 320, 5};
    System.out.print("Before Quick Sort: ");
    printArray(num);

    // sort the items
    quickSort(num, 0, num.length - 1);

    System.out.print("After Quick Sort: ");
    printArray(num);
  }

  static int partition(int arr[], int low, int high) {
    // it uses last element as pivot
    int pivot = arr[high];
    // index of smaller element
    int i = (low - 1);
    for (int j = low; j < high; j++) {
      // if current element is smaller than or equal to pivot
      if (arr[j] <= pivot) {
        i++;

        // swap arr[i] and arr[j]
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
      }
    }

    // swap arr[i+1] and arr[high] (or pivot)
    int temp = arr[i + 1];
    arr[i + 1] = arr[high];
    arr[high] = temp;

    return i + 1;
  }


  static void quickSort(int arr[], int low, int high) {
    if (low < high) {
      // pi is partitioning index, arr[pi] is now at right place
      int pi = partition(arr, low, high);

      // recursively sort elements before partition and after partition
      quickSort(arr, low, pi - 1);
      quickSort(arr, pi + 1, high);
    }
  }

  static void printArray(int[] num) {
    for (int i = 0; i < num.length; i++) {
      System.out.print(num[i] + " ");
    }
    System.out.println();
  }

}