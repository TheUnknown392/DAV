#include <stdio.h> 
#include <stdlib.h>

int main(){
    int a[10], i, key, item, n, lowerbound = 0, upperbound, mid;
    printf("\n Enter the Number element of an arrray:\n");
    scanf("%d", &n);
    upperbound = n - 1;
    printf("\n Enter element in ascending order: ");
    for(i = 0; i < n; i++){
        scanf("%d", &a[i]);        
    }
    printf("Enter the element to be found: ");
    scanf("%d", &key);
    
    while(lowerbound <= upperbound){
        mid = (lowerbound + upperbound) / 2;
        if(a[mid] == key){
            printf("The item is found at location: %d", mid);
            exit(0);
        }
        if(key < a[mid]){
            upperbound = mid - 1;
        } else {
            lowerbound = mid + 1;
        }
    }
    printf("Data not found");
    return 0;
}
