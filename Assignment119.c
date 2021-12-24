#include<stdio.h>


int ChkChar(char *str, char ch)
{
	int iCnt = 0 , i = 0;
	while(*str != '\0')
	{
		if(*str == ch)
		{
			i = iCnt;
		}
		str++;
		iCnt++;
	}
	return i;
}

int main()
{
	char Arr[20];
	char ch = '\0';	
	int iRet = 0;
	
	
	printf("Enter String:\n");
	scanf("%[^'\n']s",Arr);
	
	printf("Enter a character: \n");
	scanf(" %c",&ch);
	
	ChkChar(Arr,ch);
	iRet = ChkChar(Arr, ch);
	
	printf("Character location is: %d", iRet);
	
	return 0;
	
}