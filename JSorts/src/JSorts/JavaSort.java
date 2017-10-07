/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package JSorts;

/**
 *
 * @author Trevi
 */
public class JavaSort {




    // <editor-fold defaultstate="collapsed" desc="Sort Methods">
    
/**
 * The insertionSort method uses the insertion
 sort algorithm to sort an array of tempArray
 into non-decreasing order.
     * @param arr
     * @return 
 */
    public int insertionSort(int arr[])[]{
            int toInsert;
            for (int i = 1; i < arr.length; i++){
                    toInsert = arr[i];
                    int j = i-1;
                    while (j >= 0 && arr[j]>toInsert){
                            arr[j+1] = arr[j];
                            j = j -1;
                    }
                    arr[j+1] = toInsert;
            }
            return arr;
    }
/**
 * The bubbleSortAscending method is the slowest elementary
 * sort algorithm. Orders elements one at a time.
 * From lowest to highest
     * @param arr
     * @return 
 */
    public int bubbleSortAscending(int[] arr)[]{
        for(int i = arr.length - 1; i > 1; i--){
            for(int j = 0; j < i; j++){
               if(arr[j] > arr[j + 1])
                   arr = swapValues(j-1, j, arr);
            }
        }
        return arr;
    }    
/**
 * The bubbleSortAscending method is the slowest elementary
 * sort algorithm. Orders elements one at a time.
 * From highest to lowest
     * @param arr
     * @return 
 */    
    public int bubbleSortDescending(int[] arr)[]{
        for(int i = 0; i < arr.length; i++){
            for(int j = 1; j < (arr.length - i); j++){
               if(arr[j-1] < arr[j])
                    arr = swapValues(j-1, j, arr);
            }
        }
        return arr;        
    }
    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Class Methods">
/**
 * The swapValues method used by sort methods to swap 2 
 * elements at given indexes
     * @param x
     * @param y
 */
    private int swapValues(int x, int y, int arr[]) [] {
        int temp = arr[x];
        arr[x] = arr[y];
        arr[y] = temp;
        return arr;
    }
    // </editor-fold>
}


