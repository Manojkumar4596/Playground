#include <stdio.h>
int main() {
  int n,mult=1;
  scanf("%d",&n);
  for(int i=1;i<=n;i++)
  {
    mult=mult*i;
  }
  printf("%d",mult);
	//Type your code
	return 0;
}