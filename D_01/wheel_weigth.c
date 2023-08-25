#include <stdio.h>
int main()
{
    int x, y;
    scanf("%d %d", &x, &y);
    if (y % 2 != 0 || y < 2 || y <= x)
    {
        printf("Invalid input");
    }
    else
    {
        int tw = (4 * x - y) / 2;
        int fw = x - tw;
        printf("TW=%d FW=%d", tw, fw);
    }
    return 0;
}
