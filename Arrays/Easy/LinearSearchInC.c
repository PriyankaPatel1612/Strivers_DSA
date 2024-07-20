#include <stdio.h>

int search(int arr[], int n, int k){
    for(int i=0 ; i<n ; i++){
        if(arr[i]==k){
            return i;
        }
    }
    return -1;
}

int main(){
    int arr[] = {1,2,3,5,6};
    int n = sizeof(arr)/sizeof(arr[0]);
    int k = 5;
    int val = search(arr, n, k);
    printf("%d", val);
}