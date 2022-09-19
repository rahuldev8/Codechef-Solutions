/*
A single car can accommodate at most 44 people.

NN friends want to go to a restaurant for a party. Find the minimum number of cars required to accommodate all the friends.*/


#include <stdio.>

int main(void) {
    int t,n;
    scanf("%d",&t);
    while(t)
    {
        scanf("%d",&n);
        n%4 == 0 ? printf("%d\n",n/4) : printf("%d\n",(n/4)+1);
        t--;
    }
	// your code goes here
	return 0;
}
