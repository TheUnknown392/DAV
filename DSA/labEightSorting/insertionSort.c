#include <stdio.h>
int main(){
    int a[20],i,temp,j,n;
    printf("Enter the number of elements: ");
    scanf("%d",&n);
    printf("Enter the array to be sorted: ");
    for(i=0;i<n;i++){
        scanf("%d",&a[i]);
    }
    printf("The sorted array is: ");
    for (i = 0; i < n; i++){
        temp=a[i];
        j=i-1;
        while(j<=0 && temp<a[j]){
            a[j+1]=a[j];
            j=j-1;
        }
        a[j+1]=temp;
    }
    for(i=0;i<n;i++){
        printf("%d ",a[i]);
    }
    return 0;
}