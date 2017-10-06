function bubbleSort(array:number[]):number[]{
    array = array.slice();
    console.log(array);
    for( let i=0;i<array.length;i++){ 
      for(let j=0;j<array.length-1;j++){
        if(array[j] > array[j+1]){
          [array[j], array[j+1]] =[array[j+1],array[j]];
          console.log(array);
        }
      }
    }
    
    return array;
  }
  
  bubbleSort([5,2,8,1,3,2,4,54,12,12]);