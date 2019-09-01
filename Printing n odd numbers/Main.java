#include <stdio.h>
int main() {
  int n,o;
  scanf("%d",&n);
  for(int c=1;c<=(2*n);c++)
  {
    o=c%2;
    if(o==1)
    printf("%d\n",c);
  }
	//Type your code
	return 0;
}