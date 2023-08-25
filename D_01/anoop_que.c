#include <Stdio.h>

int main()
{
    int n,fact=1;
    printf("Enter the number of days left to join Google : ");
    scanf("%d",&n);
    for(int i=1;i<=n;i++)
    {
        fact = fact * i;
    }
    printf("Number of ways he can meet his Girlfirends is : %d",fact);
}