#include <stdio.h>

void bubble_sort(int *array, int size) {
    for (int i = 0; i < size - 1; i++) {
        for (int j = 0; j < size - i - 1; j++) {
            if (array[j] > array[j + 1]) {
                int temp = array[j];
                array[j] = array[j + 1];
                array[j + 1] = temp;
            }
        }
    }
}

void print_array(int array[], int size) {
    for (int i = 0; i < size; i++) {
        printf("%d ", array[i]);
    }
    printf("\n");
}

int main() {
    int array[] = {5, 9, 8, 7, 6, 5, 4, 9, 12, 7};
    printf("Before:\n");
    print_array(array, 10);
    bubble_sort(array, 10);
    printf("After:\n");
    print_array(array, 10);

}
