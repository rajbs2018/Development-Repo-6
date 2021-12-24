#include<stdio.h>
#include<stdbool.h>
#define TRUE 1
#define FALSE 0

typedef int BOOL;


BOOL ChkChar(char *str, char ch)
{
	
	while(*str != '\0')
	{
		if(*str == ch)
		{
			return TRUE;
		}
		str++;
	}
}

int main()
{
	char Arr[20];
	char ch = '\0';
	BOOL bRet = FALSE;	
	
	printf("Enter String:\n");
	scanf("%[^'\n']s",Arr);
	
	printf("Enter a character: \n");
	scanf(" %c",&ch);
	
	ChkChar(Arr,ch);
	bRet = ChkChar(Arr, ch);
	
	if(bRet == TRUE)
	{
		printf("Character is present");
	}
	else
	{
		printf("Character not present");
	}
	
	return 0;
	
}