/*
Chef hosts a party for his birthday. There are NN people at the party. All these NN people decide to play Jenga.

There are XX Jenga tiles available. In one round, all the players pick 11 tile each and place it in the tower.
The game is valid if:

All the players have a tile in each round;
All the tiles are used at the end.
Given NN and XX, find whether the game is valid.*/

#include <stdio.h>

int main(void) {
	// your code goes here
	int t,n,x;
	scanf("%d",&t);
	while(t)
	{
	    scanf("%d %d",&n,&x);
	    (n<=x && x%n == 0)?printf("Yes\n"):printf("No\n");
	    t--;
	}
	return 0;
}
