#!/bin/bash
echo "Enter the length of array"
read n

# taking input from user
for (( i = 0; i < $n; i++ ))
do
        echo "Enter the $i no element"
        read nos[$i]
done

#printing the number before sorting
echo "Numbers in an array are:"
for (( i = 0; i < $n; i++ ))
do
        echo ${nos[$i]}
done

# Now do the Sorting of numbers
for (( i = 0; i < $n ; i++ ))
do
        for (( j = $i; j < $n; j++ ))
        do
                if [ ${nos[$i]} -gt ${nos[$j]}  ]; then
                        t=${nos[$i]}
                        nos[$i]=${nos[$j]}
                        nos[$j]=$t
                fi
        done
done

# Printing the sorted number
echo -e "\nSorted Numbers "
for (( i=0; i < $n; i++ ))
do
        echo ${nos[$i]}
done
