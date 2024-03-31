#include <stdio.h>
#include <string.h>
#include <math.h>
#include <stdlib.h>

int main()
{
    char ch, s[20], sen[240];
    scanf("%c\n %s\n %[^\n]s", &ch, s, sen);
    printf("%c\n", ch);
    printf("%s\n", s);
    printf("%s", sen);

    return 0;
}