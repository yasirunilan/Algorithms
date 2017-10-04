fun bubbleSort(array: Array<Int>): IntArray {
    for (i in 0..array.size - 2) {
        for (j in 0..array.size - i - 2) {
            if (array[j] > array[j + 1]) {
                val temp = array[j]
                array[j] = array[j + 1]
                array[j + 1] = temp

            }
        }
    }
    return array
}

fun main(args: Array<String>) {
    val unsorted = intArrayOf(1, 5, 4, 6, 8, 12, 9, 4, 5);
    val sorted = bubbleSort(unsorted)
    println("Before: " + unsorted)
    println("After: " + sorted)
}
