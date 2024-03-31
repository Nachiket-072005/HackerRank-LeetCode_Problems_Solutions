#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{

    char str[1000];
    int counter[10] = {0};

    gets(str);

    for (int i = 0; str[i]; i++)
    {
        if (str[i] >= '0' && str[i] <= '9')
        {
            counter[(str[i] - '0')]++;
        }
    }
    for (int i = 0; i <= 9; i++)
    {
        printf("%d ", counter[i]);
    }

    return 0;
}