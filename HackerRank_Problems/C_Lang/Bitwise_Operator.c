#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
    int n, k;

    scanf("%d %d", &n, &k);
    int xor = 0, and = 0, or = 0;
    for (int i = 1; i <= n; i++)
    {
        for (int j = i + 1; j <= n; j++)
        {
            if ((i & j) > and&&(i & j) < k)
            {
                and = i & j;
            }
            if ((i | j) > or &&(i | j) < k)
            {
                or = i | j;
            }
            if ((i ^ j) > xor&&(i ^ j) < k)
            {
                xor = i ^ j;
            }
        }
    }
    printf("%d\n%d\n%d", and, or, xor);
    return 0;
}