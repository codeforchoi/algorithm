#include<stdio.h>

int main(void) {
    int A, B;
    while(A < 0 || A >= 10 || B < 0 || B >= 10)
    {
        scanf("%d %d", &A, &B);
    }
    printf("%d", A+B);
    return 0;
}