#include<stdio.h>
#include<stdbool.h>

int CountDiff(char *str)
{
	int iCnt1 = 0 , iCnt2 = 0;
	
	if(str == NULL)
	{
		return 0;
	}
	
	while(*str != '\0')
	{		
		if((*str >= 'a') && (*str <= 'z'))
		{
		iCnt1++;
		}
		else if((*str >= 'A') && (*str <= 'Z'))
		{
			iCnt2++;
		}
		str++;
	}
	return iCnt1 - iCnt2;

}

int main()
{
	char Arr[20];
	char iRet = 0;
	
	printf("Enter the Sring :\n");
	scanf("%[^'\n']s",Arr);
	
	iRet = CountDiff(Arr);
	printf("Count of Small is :%d",iRet);
	
	return 0;
	
}