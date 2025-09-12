#include <stdio.h>
 
void towerOfHanoi(int,char,char,char);
int main(){
    int disc;
    printf("Input number of discs: ");
    scanf("%d",&disc);
    towerOfHanoi(disc, 0x41, 0x42, 0x43);
    return 0;
}

void towerOfHanoi(int disc, char from, char to, char aux){
    if (disc==1){
        printf("\ndisc Move disk 1 from rod %c to rod %c", from, to);
        return;
    }
    towerOfHanoi(disc-1, from, aux, to);
    printf("\ndisc Move disk %d from rod %c to rod %c", disc, from, to);
    towerOfHanoi(disc-1, aux, to, from);
}