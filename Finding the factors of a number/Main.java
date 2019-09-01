#include <stdio.h>
int main() {
  int n;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  { int q=n%i;
  if (q==0)
    printf("%d\n",i);
  }
	//Type your code
	return 0;
}