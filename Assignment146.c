#include<stdio.h>

typedef unsigned int UINT;
int CountOne(UINT iNo)
{
	int iCnt = 0;
	
	while(iNo != 0)
	{
		if((iNo & 1) == 1)
		{
			iCnt++;
		}
		iNo = iNo >> 1;
	}
	
	return iCnt;
}

int main()
{
	UINT iValue = 0;
	int iRet = 0;
	
	printf("Enter a number :\n");
	scanf("%d",&iValue);
	
	CountOne(iValue);
	
	iRet = CountOne(iValue);
	printf("%d",iRet);
	return 0;
}