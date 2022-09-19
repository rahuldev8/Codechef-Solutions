/*
There is a contest containing 22 problems AA and BB.

22 strong participants PP and QQ participated in the contest and solved both the problems.

PP made AC submissions on problems AA and BB at time instants P_AP 
A
​
  and P_BP 
B
​
  respectively while QQ made AC submissions on problems AA and BB at time instants Q_AQ 
A
​
  and Q_BQ 
B
​
 .

It is given that the time penalty is the minimum time instant at which a participant has solved both the problems. Also the participant with the lower time penalty will have a better rank.

Determine which participant got the better rank or if there is a TIE.*/


#include <stdio.h>

int main(void) {
    int t,pa,pb,qa,qb;
    scanf("%d",&t);
    while(t)
    {
        scanf("%d%d%d%d",&pa,&pb,&qa,&qb);
        int p = pa;
        if(p < pb) p = pb;
        
        int q = qa;
        if(q < qb) q = qb;
        
        p == q?printf("Tie\n"):p<q?printf("P\n"):printf("Q\n");
        t--;
    }
	// your code goes here
	return 0;
}
