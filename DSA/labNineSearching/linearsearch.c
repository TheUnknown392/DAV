#include<stdio.h>
int main(){
	int a[10],i,loc=0,flag=0,item,n;
	printf("\n Enter the Number element of an arrray:\n");
	scanf("%d",&n);
	printf("\n Enter element: ");
    for(i=0;i<n;i++){
		scanf("%d",&a[i]);        
    }
	for(i=0;i<n;i++){
		printf("\n Enter item to Search: ");
		scanf("%d",&item);
		while(loc<n){
			if (item==a[loc]){
				printf("\n Item Found at the location %d", loc+1);
				flag++;
				return 0; 
			}
			loc ++;
		}	
		if (flag==0){
			printf("\n Item is not found");
		}
}
}