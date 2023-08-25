#include <stdio.h>

int main() 
{
    char s[100];
    int a=0, b=0;
    fgets(s, sizeof(s), stdin);
    for (int i = 0; s[i] != '\0'; i++) {
        if (s[i] == '#') 
            a++;
        else if (s[i] == '*')
            b++;
    }
    printf("%d\n", b - a);
    return 0;
}
