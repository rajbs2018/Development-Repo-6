#include<stdio.h>
#include<stdbool.h>

int CountSmall(char *str)
{
	int iCnt = 0;
	
	if(str == NULL)
	{
		return 0;
	}
	
	while(*str != '\0')
	{		
		if((*str >= 'a') && (*str <= 'z'))
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
	
	iRet = CountSmall(Arr);
	printf("Count of Small is :%d",iRet);
	
	return 0;
	
}