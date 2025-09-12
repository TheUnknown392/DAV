#include <stdio.h>
#include <stdlib.h>

#define MAX 100
int queue[MAX],rear,front,choice,n,input;

void enqueue(){

    if(rear>=n-1){
        printf("\nqueue overflow\n");
    }else{
        printf("Input the enqued data: ");
        scanf("%d",&input);
        if(front==-1){
            front=0;
        }
        rear=rear+1;
        queue[rear]=input;
    }
}
void dequeue(){
    if(front==rear+1||front==-1){
        printf("\nqueue underflow\n");
    }else{
        printf("\nThe dequed element is: %d",queue[front]);
        if(front==rear){
            front=-1;
        }else{
            front++;
        }
    }
}

void display(){
    printf("\n");
    for(int i=front;i<=rear;i++){
        printf("\n%d",queue[i]);
    }
    printf("\n");
}

int main(){
    rear=-1;
    front=-1;
    printf("desiered length 1-100: ");
    scanf("%d",&n);
    while(1){
        printf("\n1 for enqueue\n2 for dequeue\n3 for display\n4 to exit: ");
        scanf("%d",&choice);
        switch(choice){
            case 1:
                enqueue();
                break;
            case 2:
                dequeue();
                break;
            case 3:
                display();
                break;
            case 4:
                exit(0);
            default:
                printf("Choose corect one: \n");
                
        }
    }

    return 0;
}