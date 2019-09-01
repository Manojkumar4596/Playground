#include <stdio.h>
int main() 
{int n,r,q;
 scanf("%d",&n);
 while(n>=100)
 {
   n/=10;
 }
 q=n%10;
 printf("%d",q);
	//Type your code
	return 0;
}