// run node BubbleSort.js to run the program

const bubbleSort = array => {
    for (let i = 0; i < array.length; i++) {
        for (let j = 0; j < array.length - 1; j++) {
            let currentValue = array[j];
            let nextValue = array[j + 1];

            if (currentValue > nextValue) {
                array[j] = nextValue;
                array[j + 1] = currentValue;
            }
        }
    }
    return array;
}

// example case
let a = [3, 202, 18, 12, 0, 28, 32];
bubbleSort(a);