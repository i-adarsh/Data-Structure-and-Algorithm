#include<stdio.h>
#include<string.h>
#include <stdbool.h>

int main(){
    int t;
    int posIs, posA;
    bool arr[2] = { false, false };
    char *result, *ain;
    scanf("%d",&t);
    int res[t];
    int index = 0;
    fflush(stdin);
    
    while(t > 0){
        posIs = -1;
        posA = -1;
        char str[1000];
        fgets(str, 1000, stdin);
        result = strstr(str, "is");
        ain = strstr(str, "a");
        if (result){
            arr[0] = true;
            posIs = result - str;
        }
        if (ain){
            arr[1] = true;
            posA = ain - str;
        }
        if (arr[0] && arr[1]){
            // printf("%d\n", posIs + posA);
            res[index] = posIs + posA;
            index++;
        }
        else if (!arr[0] && !arr[1]){
            // printf("%d\n", -2);
            res[index] = -2;
            index++;
        }
        else if (!arr[0]){
            // printf("%d\n", posA - 1);
            res[index] = posA - 1;
            index++;
        }
        else if (!arr[1]){
            // printf("%d\n", posIs - 1);
            res[index] = posIs - 1;
            index++;
        }
        t--;
    }
    for (int i = 0; i < index; i++){
        printf("%d\n", res[i]);
    }
    return 0;
}

