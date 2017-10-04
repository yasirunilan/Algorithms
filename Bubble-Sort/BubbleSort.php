<?php

function bubble_sort($arr) {
    $size = count($arr);
    for ($i=0; $i<$size; $i++) {
        for ($current=0; $j<$size-1-$i; $current++) {
	    $next = $current + 1;
            if ($arr[$next] < $arr[$current]) {
		$tmp = $arr[$current];
    		$arr[$current] = $arr[$next];
    		$arr[$next] = $tmp;
            }
        }
    }
    return $arr;
}


/* test bubble sort */

$arr = array(1,3,2,8,5,7,4,0);

print("Before sorting");
print_r($arr);

$arr = bubble_sort($arr);
print("After sorting by using bubble sort");
print_r($arr);

?>
