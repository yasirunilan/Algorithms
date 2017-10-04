#include <iostream>
#include <algorithm>
using namespace std;

//partition
int partition(int* a, int s, int e){
  int i=s-1;
  int j=s;
  int pivot=a[e]; //last element set as a pivot
  for(;j<=e;j++){
    if(a[j]<pivot){ //i and j move together if the statement is satisfied, otherwise j moves forward until the statement is true again
      i++;
      swap(a[i],a[j]);
    }
    swap(a[i+1],a[j]);  //bringing the pivot to its correct position
  }
  return i+1; //position of the partition returned
}

void quickSort(int* a, int s, int e){
  //base case
  if(s>=e){
    return;
  }

  //creating the partition
  int p = partition(a,s,e);

  //calling quicksort recursively on children subarrays, segregated by the partition
  quickSort(a,s,p-1);
  quickSort(a,p+1,e);
}
//Checking the code
int main(){
  int a[] = {9,8,7,6,5,4,3,2,1,0};
  int n = sizeof(a) / sizeof(int);

  quickSort(a,0,n-1);

  for(int i=0;i<n;i++){
    cout<<a[i]<<" ";
  }
}
