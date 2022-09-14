/*
Bob has an account in the Bobby Bank. His current account balance is WW rupees.

Each month, the office in which Bob works deposits a fixed amount of XX rupees to his account.
YY rupees is deducted from Bob's account each month as bank charges.

Find his final account balance after ZZ months. Note that the account balance can be negative as well.*/

#include <stdio.h>

int main(void) {
	// your code goes here
	int t,ini_bal,mon_dep,mon_char,months;
	scanf("%d",&t);
	while(t--)
	{
	    scanf("%d %d %d %d",&ini_bal,&mon_dep,&mon_char,&months);
	    printf("%d\n",(ini_bal+((mon_dep-mon_char)*months)));
	}
	return 0;
}
