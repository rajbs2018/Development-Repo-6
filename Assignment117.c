#include<stdio.h>


int ChkChar(char *str, char ch)
{
	int iCnt = 0;
	while(*str != '\0')
	{
		if(*str == ch)
		{
			iCnt++;
		}
		str++;
	}
	return iCnt;
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
	
	printf("Frequency of Character : %d", iRet);
	
	return 0;
	
}