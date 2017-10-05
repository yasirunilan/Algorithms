#!/bin/bash

#	Bash Implementation of Bubblesort

give_random_numbers() {	                                                # give 20 random Integers between 0 and 99
	for i in $(seq 0 19)
	do
		elements[$i]=$[$RANDOM%100]
	done
}

bubblesort() {	                                                       # Where the magic happens
for ((i=${#elements[@]}-1;i>0;i--))			                               # take every single element from the Array, in order.
do
	for((j=0;j<i;j++))															                      # Then take all elements that have been touched,
	do
		let "next_to_j=$j+1"
		print_elements $j $next_to_j
		if ((${elements[$j]} > ${elements[$next_to_j]})); then	            # and look if there is one, greater than the one in Hand.
			print_elements $j $next_to_j 1
			swap $j $next_to_j												          	             # If so, swap them.
		fi
	done
done
}

swap() {                                                                # Take the given elements and swap them
tmp=${elements[$1]}
elements[$1]=${elements[$2]}
elements[$2]=$tmp
}

print_elements () {                                         # Play some fancy swaping animation

# setterm -cursor off
for ((k=0; k<$1; k++)); do
	echo -n ${elements[k]}" "
done

if (($3)); then
	String_lenght=$[${#elements[$1]}+${#elements[$2]}+2]
	echo -en "\e[38;5;196m"${elements[$1]}" "
	echo -en "\e[38;5;226m"${elements[$2]}" "
	echo -en "\e[39m"

	sleep 0.3
		
	echo -en "\033["$String_lenght"D"
	echo -en "\e[38;5;226m"${elements[$2]}" "
	echo -en "\e[38;5;196m"${elements[$1]}" "
	echo -en "\e[39m"
	sleep 0.3
else
	echo -en "\e[38;5;082m"${elements[$1]}" "
	echo -en "\e[38;5;046m"${elements[$2]}" "
	echo -en "\e[39m"
fi


for ((k=$2+1; k<=${#elements[@]}; k++)); do
	echo -n ${elements[k]}" "
done

echo
echo -en "\033[1A"
sleep 0.3

# setterm -cursor on
}

give_random_numbers
echo ${elements[@]}
bubblesort
echo ${elements[@]}
