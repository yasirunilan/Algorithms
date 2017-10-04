# we define the function
def quicksort(array):
    less = []
    equal = []
    greater = []

    if len(array) > 1:
        pivot = array[0]
        for x in array:
            if x < pivot:
                less.append(x)
            if x == pivot:
                equal.append(x)
            if x > pivot:
                greater.append(x)
        # Don't forget to return something!
        return quicksort(less)+equal+quicksort(greater)  # Just use the + operator to join lists
    # Note that you want equal ^^^^^ not pivot
    else:  # You need to hande the part at the end of the recursion - when you only have one element in your array, just return the array.
        return array

# asking for the parameters
array_lenght = input("Enter Size of array: ")
variable = []
for i in range(array_lenght):
    array_index = input("Enter element: ")
    variable.append(array_index)

result = quicksort(variable)
# printing result
print(result)