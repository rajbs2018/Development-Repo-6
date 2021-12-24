#include<stdio.h>
#include<stdbool.h>
#define TRUE 1
#define FALSE 0

typedef int BOOL;

BOOL ChkVovel(char *Brr)
{
	while(*Brr != '\0')
	{
		if(*Brr == 'a'|| *Brr =='e'|| *Brr =='i'|| *Brr =='o'|| *Brr =='u')
		{
			return 1;
		}
		else 
		{ 
			return 0;
		}
		Brr++;
	}
}

int main()
{
	char Arr[20];
	char cValue = '\0';
	BOOL bRet = false;
	
	printf("Enter the characte :\n");
	scanf("%[^'\n']s",Arr);
	
	bRet = ChkVovel(Arr);
	
	if(bRet == TRUE)
	{
		printf("Contain vowel");
	}
	else
	{
		printf("There is no vowel");
	}
	
	return 0;
	
}