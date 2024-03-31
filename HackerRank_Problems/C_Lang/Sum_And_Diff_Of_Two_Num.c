#include <stdlib.h>

int main()
{
    int n, m;
    float a, b;
    scanf("%d %d", &n, &m);
    scanf("%f %f", &a, &b);

    printf("%d %d\n%.1f %.1f\n", n + m, n - m, a + b, a - b);

    return 0;
}