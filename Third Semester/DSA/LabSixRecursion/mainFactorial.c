#include <stdio.h>

int fac(int n);

int main(){
    int input;
    printf("Input your number for factorial: ");
    scanf("%d",&input);
    printf("Your factorial number is: %d",fac(input));
    return 0;
}
int fac(int n){
    if(n==0){
        return 1;
    }else{
        return n* fac(n-1);
    }
}