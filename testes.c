#include <stdio.h>
#include <math.h>

//! file created just to see a implementation of binary tress

typedef struct
{
    struct tree_node *left;
    struct tree_node *right;
    struct tree_node *parent;
    int data;
} tree_node;

//tree_node *new_tree_node(int data, tree_node *parent);





int main(int argc, char const *argv[])
{
    /*
    quero que ao correr as possibilidades todas, veja se é possible implementar a tareda, ou seja, se há programadores disponiveis
    se houver esse ramo continua 'ativo' se não morre logo aí
    */

    tree_node *root = NULL;
    int arr[] = {0, 1, 0, 1, 0, 1, 0, 1, 0, 1, 0};
    insert_recursive(&root, NULL, arr);

    return 0;
}
