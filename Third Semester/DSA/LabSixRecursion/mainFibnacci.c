#include <stdio.h>

int fib(int n);

int main(){
    int input;
    printf("Input your number for fibonacci: ");
    scanf("%d",&input);
    printf("Your fibonacci number is:\n");
    for(int i = 0; i!=input;i++){
        printf("%d ",fib(i));
    }
    return 0;
}
int fib(int n){
    if(n<=1){
        return 1;
    }else{
        return fib(n-1) + fib(n-2);
    }
}