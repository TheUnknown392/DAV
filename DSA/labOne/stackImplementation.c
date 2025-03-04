#include <stdio.h>
#include <process.h>

int stack[100],choice,n,top,x,i;

/*
	max size = 100;
	max size according to user = n;
	x = temporary;
*/

void push();
void pop();
void display();
void peek();

int main(){
	top=-1;
	printf("Enter the size of stack. (n<=100): ");
	scanf("%d",&n);
	printf("1 for push\n2 for pop\n3 for peek\n4 for displaying\n5 to quit");
	while(1){
		printf("\nEnter your choice: ");
		scanf("%d",&choice);
		switch(choice){
			case 1:
				push();
				break;
			case 2:
				pop();
				break;
			case 3:
				peek();
				break;
			case 4:
				display();
				break;
			case 5:
				exit(0);
			default:
				printf("Enter a valid choice: 1,2,3,4,5 ");
		}
	}
	return 0;
}
void push(){
	if(top==n-1){
		printf("Stack Overflow");
	}else{
		printf("\nEnter your number: ");
		scanf("%d",&x);
		top++;
		stack[top]=x;
	}
}

void pop(){
	if(top==-1){
		printf("Stack Underflow");
	}
	else{
		x=stack[top];
		top--;
		printf("\nyou have removed %d",x);
	}
}

void display(){
	if(top<=-1){
		printf("Stack is empty");
	}
	printf("Displaying stack: \n");
	for(i=top;i!=-1;i--){
		printf("%d\n",stack[i]);
	}
}

void peek(){
	if(top==-1){
		printf("stack is empty");
	}
	printf("\nTop of the stack is: %d",stack[top]);
}
