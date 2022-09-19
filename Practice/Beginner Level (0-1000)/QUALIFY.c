/*
In a coding contest, there are two types of problems:

Easy problems, which are worth 11 point each
Hard problems, which are worth 22 points each
To qualify for the next round, a contestant must score at least XX points. Chef solved AA Easy problems and BB Hard problems. Will Chef qualify or not?*/

#include <stdio.h>

int main(void) {
    int t,x,a,b;
    scanf("%d",&t);
    while(t)
    {
        scanf("%d%d%d",&x,&a,&b);
        (x<=(a*1)+(b*2))?printf("Qualify\n"):printf("NotQualify\n");
        t--;
    }
	// your code goes here
	return 0;
}
