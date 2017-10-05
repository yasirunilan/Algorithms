/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java.Sorting;

/**
 *
 * @author Trevi
 */
public class JavaSorts {
    

    // <editor-fold defaultstate="collapsed" desc="Sort Methods">
    
/**
 * The insertionSort method uses the insertion
 * sort algorithm to sort an array of integers
 * into non-decreasing order.
     * 
     * @param inputArray
     * @return inputArray
 */
public static int[] insertionSort(int[] inputArray){

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



    // </editor-fold>
    
}


