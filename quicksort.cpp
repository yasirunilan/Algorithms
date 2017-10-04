#include<bits/stdc++.h>
using namespace std;


int partition(int a[],int l,int h){
   // cout<<"Before "<<endl;
   
    int pivot=a[h];
    int pindex=l;
    for(int i=l;i<h;i++){
        if(a[i]<=pivot){
            swap(a[i],a[pindex]);
            pindex++;
        }
    }
    swap(a[pindex],a[h]);
   
   // cout<<endl<<" pindex "<<pindex<<endl;
    return pindex;
}

 void qs(int a[],int l,int h){
     if(l<h){
         int pi=partition(a,l,h);
        // cout<<"And "<<pi<<endl;
        qs(a,l,pi-1);
         qs(a,pi+1,h);
     }
 }

int main(){
    int t;
    cin>>t;
    while(t--){
        //string s;
        //cin>>s;
        int n;
        cin>>n;
        int a[n];
        for(int i=0;i<n;i++){
            cin>>a[i];
        }
        qs(a,0,n-1);
        for(int i=0;i<n;i++){
            cout<<a[i]<<" ";
        }
        cout<<endl;
    }
}
