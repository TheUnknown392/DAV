#include <stdio.h>
int main(){
    int arr[20],size,tmp,i,j,min;
    printf("Input number of elements: ");
    scanf("%d",&size);
    printf("Enter the array to be sorted: ");
    for(i=0;i<size;i++){
        scanf("%d",&arr[i]);
    }
    printf("The sorted array is: ");
    for(i=0;i<size-1;i++){
        min=i;
        for(j=i+1;j<size;j++){
            if(arr[min]>arr[j]){
                min=j;
            }
        }
        tmp = arr[min];
        arr[min]=arr[i];
        arr[i]=tmp;
    }
    for(i=0;i<size;i++){
        printf("%d ",arr[i]);
    }
}