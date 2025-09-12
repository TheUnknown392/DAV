#include <stdio.h>
int main(){
    int arr[20],size,tmp,i,j;
    printf("Input number of elements: ");
    scanf("%d",&size);
    printf("Enter the array to be sorted: ");
    for(i=0;i<size;i++){
        scanf("%d",&arr[i]);
    }
    printf("The sorted array is: ");
    for(i=0;i<size-1;i++){
        for(j=0;j<size-1-i;j++){
            if(arr[j]>arr[j+1]){
                tmp = arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=tmp;
            }
        }
    }
    for(i=0;i<size;i++){
        printf("%d ",arr[i]);
    }
}