#include<bits/stdc++.h>
using namespace std;
void merge(int A[ ] , int start, int mid, int end) {
        int p = start ,q = mid+1;
        int Arr[end-start+1] , k=0;
        for(int i = start ;i <= end ;i++) {
            if(p > mid)      //checks if first part comes to an end or not .
               Arr[ k++ ] = A[ q++] ;

           else if ( q > end)   //checks if second part comes to an end or not
               Arr[ k++ ] = A[ p++ ];

           else if( A[ p ] < A[ q ])     //checks which part has smaller element.
              Arr[ k++ ] = A[ p++ ];

           else
              Arr[ k++ ] = A[ q++];
         }
          for (int p=0 ; p< k ;p ++)     //copy the arrayelements to its original position 
             A[ start++ ] = Arr[ p ] ;                          
}
void merge_sort (int A[ ] , int start , int end )
   {
           if( start < end ) {
           int mid = (start + end ) / 2 ;           // defines the current array in 2 parts .
           merge_sort (A, start , mid ) ;                 // sort the 1st part of array .
           merge_sort (A,mid+1 , end ) ;              // sort the 2nd part of array.

         // merge the both parts by comparing elements of both the parts.
          merge(A,start , mid , end );
   }
}
int main(){
        int n;
        cout<<"Entert the size of array"<<endl;
        cin>>n;
        int a[n];
        cout<<"Enter array element"<<endl;
        for(int i=0;i<n;i++)
                cin>>a[i];

        cout<<"Array before sorting"<<endl;
        for(int i=0;i<n;i++)
                cout<<a[i]<<" ";
        cout<<endl;

        merge_sort(a,0,n-1);

        cout<<"Array after sorting"<<endl;
        for(int i=0;i<n;i++)
                cout<<a[i]<<" ";
        cout<<endl;
}
