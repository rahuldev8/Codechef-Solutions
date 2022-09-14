/*
Alice is driving from her home to her office which is AA kilometers away and will take her XX hours to reach.
Bob is driving from his home to his office which is BB kilometers away and will take him YY hours to reach.

Determine who is driving faster, else, if they are both driving at the same speed print EQUAL.*/

#include <stdio.h>

int main(void) {
	int t;
	float a,x,b,y;
	scanf("%d",&t);
	while(t--)
	{
	    scanf("%f %f %f %f",&a,&x,&b,&y);
	    a/x == b/y ? printf("Equal\n") : a/x > b/y ? printf("Alice\n") : printf("Bob\n");
	}
	return 0;
}

