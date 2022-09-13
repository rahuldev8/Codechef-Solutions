/*
Chef has a rectangular plate of length N cmNcm and width M cmMcm. He wants to make a wireframe around the plate. The wireframe costs XX rupees per cm.

Determine the cost Chef needs to incur to buy the wireframe.

Input Format
First line will contain TT, the number of test cases. Then the test cases follow.
Each test case consists of a single line of input, containing three space-separated integers N,M,N,M, and XX — the length of the plate, width of the plate, and the cost of frame per cm.
Output Format
For each test case, output in a single line, the price Chef needs to pay for the wireframe.

Constraints
1 \leq T \leq 10001≤T≤1000
1 \leq N,M,X \leq 10001≤N,M,X≤1000*/


#include <stdio.h>

int main(void) {
	int t,n,m,x;
	scanf("%d",&t);
	while(t--)
	{
	    scanf("%d %d %d",&n,&m,&x);
	    printf("%d\n",((2*n)+(2*m))*x);
	}
	return 0;
}
