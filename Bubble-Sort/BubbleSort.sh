#run node ./BubbleSort.sh to execute 
a=(5 6 3 2 56 23 12 89 1)
n=${#a[@]}
x=1
 
for (( i=0; $x==1 && i<$n-1; i++ ))
do
    x=0
    for (( j=0; j<$n-i-1; j++ ))
    do
    	# compare the numbers and swap if required
        if [ ${a[$j]} -gt ${a[$j+1]} ]
        then
            tmp=${a[$j]}
            a[$j]=${a[$j+1]}
            a[$j+1]=$tmp
            x=1
        fi
    done
done

echo ${a[*]}