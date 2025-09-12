#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

#define MAX 30

typedef struct STACK{
    char arr[MAX];
    int top;
}stack;

void push(stack *s, char x);
void pop(stack * s);
char peek(stack * s);
int isempty(stack *s);
int precedence(char ch);

int main(){
   stack expression = {.top = -1}, operand = {.top = -1};
   char scan[MAX + 1];
   printf("Enter your infix expression: ");
   fgets(scan, MAX + 1, stdin);
   scan[strcspn(scan, "\n")] = '\0'; 
   size_t len = strlen(scan);
   
   for(size_t i = 0; i < len; i++) {
		if(isalpha(scan[i])) {
			push(&expression, scan[i]);
			continue;
		}
		if(scan[i] == '(') {
			push(&operand, scan[i]);
			continue;
		}
		if(scan[i] == ')') {
			while(!isempty(&operand) && peek(&operand) != '(') {
				push(&expression, peek(&operand));
				pop(&operand);
			}
			pop(&operand);
			continue;
		}
		if(!isalpha(scan[i])) { 
			while(!isempty(&operand) && precedence(scan[i]) <= precedence(peek(&operand))) {
				push(&expression, peek(&operand));
				pop(&operand);
			}
			push(&operand, scan[i]);
		}
	}
	while(!isempty(&operand)){ 
	   push(&expression, peek(&operand));
	   pop(&operand);
    }
   for(int i = 0; i <= expression.top; i++) {
		printf("%c", expression.arr[i]);
    }

   return 0;
}

void push(stack *s, char x) {
	if(s->top == MAX - 1) {
		printf("Stack Overflow");
	} else {
		s->top++;
		s->arr[s->top] = x;
	}
}

void pop(stack *s) {
	if(s->top == -1) {
		printf("Stack Underflow");
        exit(1);
	} else {
		s->top--;
	}
}

char peek(stack *s) {
	if(s->top == -1) {
		printf("Stack is empty");
        exit(0);
	}
    return s->arr[s->top];
}

int precedence(char ch) {
	switch(ch) {
		case '$':
		case '^':
			return 3;
		case '*':
		case '/':
			return 2;
		case '+':
		case '-':
			return 1;
		default:
			return 0;
	}
}

int isempty(stack *s) {
	return s->top == -1;
}
