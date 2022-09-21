/*
Chef invented a modified wordle.

There is a hidden word SS and a guess word TT, both of length 55.

Chef defines a string MM to determine the correctness of the guess word. For the i^{th}i 
th
  index:

If the guess at the i^{th}i 
th
  index is correct, the i^{th}i 
th
  character of MM is \texttt{G}G.
If the guess at the i^{th}i 
th
  index is wrong, the i^{th}i 
th
  character of MM is \texttt{B}B.
Given the hidden word SS and guess TT, determine string MM.

Input Format
First line will contain TT, number of test cases. Then the test cases follow.
Each test case contains of two lines of input.
First line contains the string SS - the hidden word.
Second line contains the string TT - the guess word.
Output Format
For each test case, print the value of string MM.

You may print each character of the string in uppercase or lowercase (for example, the strings \texttt{BgBgB}BgBgB, \texttt{BGBGB}BGBGB, \texttt{bgbGB}bgbGB and \texttt{bgbgb}bgbgb will all be treated as identical).*/


#include <stdio.h>

int main(void) {
	// your code goes here
	int t;
	char arr1[5],arr2[5];
	scanf("%d",&t);
	while(t)
	{
	    scanf("%s%s",&arr1,&arr2);
	    for(int i=0;i<5;i++)
	    {
	        if(arr1[i] == arr2[i])
	        printf("%c",'G');
	        else 
	        printf("%c",'B');
	    }
	    printf("\n");
	   t--;
	}
	
	return 0;
}

