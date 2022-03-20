#include <stdio.h>
#include <stdlib.h>

typedef struct Node
{
    int data;
    struct Node *left;
    struct  Node *right;
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
 3 b) Afficher le chemin d'un nœud partant de la racine
 complexity : O(n)
*/
int path( Node *node , int x){
  //  int tab[10];
   // int i = 0;
    if (node == NULL){
        return -1;
    }
    //tab[i]= node->data;
    
    if(node->data == x){
        return 1;
    }

    while( node != NULL && node->data != x){
       // i++;
        if(x > node->data){
          //  tab[i] =  node->data;
            printf("%d  \n" , node->data);
            node = node->right;
        }else{
          //  tab[i] =  node->data;
                      printf("%d \n" , node->data);

            node = node->left;   
        }
    }
    return 1;
}

/*
d. Calculer la taille d'un arbre
complexity : O(n)
*/
int lenght(Node* a){
    if(a ==NULL) return 0 ;
    else return (1 + lenght(a->left) + lenght(a->right));
}
/*
 3 e) Calculer le nombre de feuilles d’un arbre binaire
complexity : O(n)
*/


//complexity : O(1)
int feuille(Node* node){
    if(node->left == NULL && node->right == NULL) return 1;
    else return 0;
}

int nbreFeuille(Node* root){
 if(root==NULL) return 0;
 else if(feuille(root) == 1) return 1;
 else return nbreFeuille(root->left) + nbreFeuille(root->right);   
}

/*
3 f. Vérifier qu’un arbre n’est pas dégénéré
   specification : un arbre n'est pas degenere si il existe au moins un noeud 
   qui admet  2 fils

complexity : O(n)
*/
/*
  return 1 if tree is not degenerated
         0 else
*/

int isNotDegenerate(Node * root){
     if(root == NULL) return 0; // tree is degerated
     else if (root->left != NULL && root->right != NULL) return 1 ; //tree is normal
     else if(root->left ==NULL) isNotDegenerate(root->right);
     else if(root->right ==NULL) isNotDegenerate(root->left);
}

/*
 3 g. Recherche une valeur dans un arbre binaire
  Complexity : O(logn en base 2)

 @return  1 if present 
         -1 else
*/
int search(Node* root , int x){
    if(root == NULL) return -1;
    else{
        if(root->data == x) return 1;
        else return ( search(root->left,x) && search(root->right,x));
    }
}
int recherche(Node* root ,int x){
    if(root == NULL) return -1;
    else{
        while(root != NULL && root->data !=x){
            if(root->data >x){
                root = root->left;
            }else{
                root = root->right;
            }
        }
    }
    return root !=NULL ? 1:-1;
}

int main(void){
         
         struct Node* root = newNode(5);
         root->left = newNode(3);
          root->left->left = newNode(2);
           root->left->right = newNode(4);
            root->right = newNode(7);
            root->right->left = newNode(6);
            root->right->right= newNode(8);
         //bad case
         struct Node* tree2 = newNode(5);
         root->left = newNode(3);
          root->left->left = newNode(2);
           root->left->left->left= newNode(1);

           int x= path(root,8);
        printf("%d " ,lenght(root));
        printf(" ----------nbre feuille  %d  " ,nbreFeuille(root));

        
        if(isNotDegenerate(tree2)== 1) printf("tree is normale");
        else printf("degenerate tree");
        preorder(root);
        printf("value of 0 %d" , recherche(root , 0));


    return 0;
}