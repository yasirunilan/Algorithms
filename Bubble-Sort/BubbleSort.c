// Run 'gcc bubbleSort.c -o bubbleSort1' to compile the program
// Run './bubbleSort1' to run the compiled program

#include <stdio.h>

void bubbleSort(int array[], int arrayLength) {
    int i, temp;
    int changesFound = 1; //So that we run the checks at least once

    while (changesFound != 0){ //Run while there were changes in former step
        changesFound = 0;
        for(i = 1; i < arrayLength; ++i ){
            if(array[i-1] > array[i]){ 
                changesFound = 1;
                temp = array[i-1];
                array[i-1] = array[i];
                array[i] = temp;
            }
        }
    }
}
int main() {
    int testArray[5] = {4,-2,2,1,0};
    int i;
    bubbleSort(testArray, 5);
    
    for(i = 0; i < 5; ++i)
        printf("%d", testArray[i]);
    
    return 0;
}


