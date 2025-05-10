#include <stdio.h>
#include <stdlib.h>

struct node {
    int data;
    struct node *left;
    struct node *right;
};

struct node * newNode(int data){
    struct node * node = (struct node *)malloc(sizeof(struct node));
    node -> data = data;
    node -> left = NULL;
    node -> right = NULL;
    return node;
}

void printInorder(struct node* node){
    if(node == NULL){
        return;
    }
    printInorder(node->left);
    printf("%d ", node -> data);
    printInorder(node -> right);
}

void printPostorder(struct node * node){
    if(node == NULL){
        return;
    }
    printPostorder(node->left);
    printPostorder(node -> right);
    printf("%d ", node -> data);
}

void printPreorder(struct node * node){
    if(node == NULL){
        return;
    }
    printf("%d ", node -> data);
    printPreorder(node->left);
    printPreorder(node -> right);
}

int main(){
    struct node * start= newNode(1);
    start->left=newNode(2);
    start->right=newNode(3);
    start->left->left=newNode(4);
    start->left->right=newNode(5);
    start->right->left=newNode(6);
    start->right->right=newNode(7);
    
    printf("Inorder Traversal of binary tree is: \n");
    printInorder(start);
    printf("\nPreorder Traversal of binary tree is: \n");
    printPreorder(start);
    printf("\nPostorder Traversal of binary tree is: \n");
    printPostorder(start);
    return 0;
}