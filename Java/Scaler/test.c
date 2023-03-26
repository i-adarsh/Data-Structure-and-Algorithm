#include<stdio.h>
// int main(int argc, char *argv[]){
//     enum FRUITS {APPLE = 0.5, MANGO = 1.0, BANANA = 5.0};
//     printf("Fruit:%f\n", APPLE);
//     return 0;
// }
void function (int**);
int main()
{
    auto int *x;
    int i = 11;
    x = &i;
    void (*ptr) (int **);
    ptr = &function;
    (*ptr)(&x);
    printf("%d", *x);
    return 0;
}

void function(int **p) {
    static int a = 10;
    *p = &a;
    return;
}