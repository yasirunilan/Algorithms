/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tools;

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
     * 
     * @param inputArray
     * @return inputArray
 */
    public int[] insertionSort(int[] inputArray){

            int n = inputArray.length;
            int key;

            for (int i = 1; i < n; i++){

                    key = inputArray[i];

                    int j = i-1;


                    while (j >= 0 && inputArray[j]>key){

                            inputArray[j+1] = inputArray[j];

                            j = j -1;

                    }

                    inputArray[j+1] = key;

            }

            return inputArray;

    }

    public int[] bubbleSortAscending(int[] array2Sort){
        for(int i = array2Sort.length - 1; i > 1; i--){
            for(int j = 0; j < i; j++){
               if(array2Sort[j] > array2Sort[j + 1]){
                   tempArray = array2Sort;
                   swapValues(j-1, j);
                   array2Sort = tempArray;
                }
            }
        }
        return array2Sort;
    }    
    
    public int[] bubbleSortDescending(int[] array2Sort){
        for(int i = 0; i < array2Sort.length; i++){
            for(int j = 1; j < (array2Sort.length - i); j++){
               if(array2Sort[j-1] < array2Sort[j]){
                   tempArray = array2Sort;
                   swapValues(j-1, j);
                   array2Sort = tempArray;
                }
            }
        }
        return array2Sort;        
    }


    
    
    

    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Class Static Methods">
/**
 * The swapValues used by sort methods to swap 2 values at given indexes
     * @param indexOne
     * @param indexTwo
 */
    public void swapValues(int indexOne, int indexTwo){
        int temp = tempArray[indexOne];
        tempArray[indexOne] = tempArray[indexTwo];
        tempArray[indexTwo] = temp;
    }







    // </editor-fold>

    // <editor-fold defaultstate="collapsed" desc="Private Field Variables">
    private int[] tempArray;
    // </editor-fold>
}


