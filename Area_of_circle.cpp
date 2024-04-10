#include<stdio.h>
int main()
{
	int p,r,t;
	float si;
	printf("Enter the value of p,r,t:")
	scanf("%d%d%d%f",&p,&r,&t,&si);
	si=p*r*t/100;
	printf("simple intrest=%.2f",si)
	return 0;
}
