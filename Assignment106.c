#include<stdio.h>
#include<stdbool.h>

int CountCapital(char *str)
{
	int iCnt = 0;
	
	if(str == NULL)
	{
		return 0;
	}
	
	while(*str != '\0')
	{		
		if((*str >= 'A') && (*str <= 'Z'))
		{
		iCnt++;
		}
		str++;
	}
	return iCnt++;

}

int main()
{
	char Arr[20];
	char iRet = 0;
	
	printf("Enter the Sring :\n");
	scanf("%[^'\n']s",Arr);
	
	iRet = CountCapital(Arr);
	printf("Count of Capital is :%d",iRet);
	
	return 0;
	
}