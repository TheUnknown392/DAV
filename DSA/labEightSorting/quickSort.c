#include<stdio.h>
void quicksort(int number[25],int first,int last);
	
int main(){
	int down, count, number[25];
	
	printf("How many elements are u going to enter?: ");
	scanf("%d",&count);
	
	printf("Enter %d elements: ", count);
	for(down=0;down<count;down++)
	scanf("%d",&number[down]);
	
	quicksort(number,0,count-1);
	
	printf("Order of Sorted elements: ");
	for(down=0;down<count;down++)
	printf(" %d",number[down]);
	
	return 0;
}

void quicksort(int number[25],int first,int last){
int down, up, key, temp;

	if(first<last){
		key=first;
		down=first;
		up=last;
		
		while(down<up){
			while(number[down]<=number[key]&&down<last)
			down++;
			while(number[up]>number[key])
			up--;
			if(down<up){
				temp=number[down];
				number[down]=number[up];
				number[up]=temp;
			}
		}
		
		temp=number[key];
		number[key]=number[up];
		number[up]=temp;
		quicksort(number,first,up-1);
		quicksort(number,up+1,last);
		
	}
}