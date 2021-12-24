#include<stdio.h>
#include<stdbool.h>
#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkSChar(char c)
{
	if((c > '!') && (c < '/'))
	{
		return 1;
	}
	else 
	{ 
		return 0;
	}
}

int main()
{
	char cValue = '\0';
	BOOL bRet = false;
	
	printf("Enter the characte :\n");
	scanf("%c",&cValue);
	
	bRet = ChkSChar(cValue);
	
	if(bRet == TRUE)
	{
		printf("It is Special Character");
	}
	else
	{
		printf("Not a Special character");
	}
	
	return 0;
	
}