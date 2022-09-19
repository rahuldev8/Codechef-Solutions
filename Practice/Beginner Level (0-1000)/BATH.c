/*
A geyser has a capacity of XX litres of water and a bucket has a capacity of YY litres of water.

One person requires exactly 22 buckets of water to take a bath. Find the maximum number of people 
that can take bath using water from one completely filled geyser..*/

#include <stdio.h>

int main(void) {
	// your code goes here
	int t,x,y;
	scanf("%d",&t);
	while(t)
	{
	    scanf("%d%d",&x,&y);
	    printf("%d\n",x/(2*y));
	    t--;
	}
	return 0;
}
