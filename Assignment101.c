#include<stdio.h>

void DisplayASCII()
{
	int i =0;
	
	printf("ACII TABLE\n");
	printf("*************************************************************\n");
	printf("Decimal\t   Hexadecimal\t\t Octal\t  Chatacter\n");
	printf("*************************************************************\n");
	for(i = 0; i < 127 ; i++)
	{
		printf("%d\t\t %x\t\t %o\t %c\t\n",i,i,i,i);
	}
	printf("*************************************************************\n");
}
int main()
{
	DisplayASCII();
	
	return 0;
}