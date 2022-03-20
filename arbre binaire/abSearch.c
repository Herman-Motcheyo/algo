#include <stdio.h>
#include <stdlib.h>


/*
  Exercice 2: arbre binaire de recherche

  author : TCHENEGHON MOTCHEYO HERMAN
*/
typedef struct Node
{
    int data;
    struct Node *left;
    struct  Node *right;
    struct Node *parent; //parent for node
}Node ;

/*
  fonction pour creer un nouveau noeud
*/
struct Node* newNode(int data)
{
   struct  Node* newNode =  ( struct Node* )malloc(sizeof( struct Node));
     newNode->data = data;
     newNode->left  =NULL;
     newNode->right = NULL;
      newNode->parent = NULL;
     return newNode ;
}
void preorder(Node* root){
  if(root != NULL) {
      printf("%d  ",root->data);
      preorder(root->left);
      preorder(root->right);
  }
}
 /*
  x is value to insert
 */
 
void insertion(Node* root , int x){
    struct Node* node = newNode(x);
   struct  Node* y =  ( struct Node* )malloc(sizeof( struct Node));
   struct Node* q = (struct Node* )malloc(sizeof(struct Node));
   if (root == NULL) root = node ;
   else{
        y= root ;
        while(y != NULL ){
            q=y;
            if(y->data > x) y= y->right;
            else y= y->left;
        }
        node->parent = q;
        if(q->data > x) q->right = node ;
        else q->left = node;
   }
}
Node* maximum(Node* a){
     Node* max = (struct Node*)malloc(sizeof(struct Node));
     while( a != NULL){
         max=a;
         a=a->right;
     }
     return max;
}

int main(void){
         
         struct Node* root = newNode(5);
         root->left = newNode(3);
           root->parent = newNode(5);
    /*      root->left->left = newNode(2);
           root->left->right = newNode(4);
            root->right = newNode(7);
            root->right->left = newNode(6);
            root->right->right= newNode(8);*/
         //bad case
         struct Node* tree2 = newNode(5);
         root->left = newNode(3);
          root->left->left = newNode(2);
           root->left->left->left= newNode(1);
        insertion(root, 16);
        
        insertion(root, 20);      
        insertion(root, 10);   
        

         preorder(root);
          Node* max = (struct Node*)malloc(sizeof(struct Node));
          max = maximum(root);
          printf("------------------------------------------------");
          preorder(max);   
    return 0;
}