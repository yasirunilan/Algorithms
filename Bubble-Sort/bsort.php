<?php
$arrays = [
    [2, 3, 5],
    [3, 4, 8],
    [3, 4, 5, 8, 9],
];
$flattened = [];
foreach ($arrays as $array) {
    foreach ($array as $element) {
      $flattened[] = $element;
    }
}
for ($x = 0; $x < count($flattened) - 1; $x++) {
  for ($y = $x + 1; $y < count($flattened); $y++) {
    if ($flattened[$x] > $flattened[$y]) {
      $temp = $flattened[$x];
      $flattened[$x] = $flattened[$y];
      $flattened[$y] = $temp;
    }
  }
}
echo implode(', ', $flattened), PHP_EOL
