#include<stdio.h>

typedef unsigned int UINT;
void CountOne(UINT iNo1, UINT iNo2)
{
	int iCnt1 = 0, iCnt2 = 0;
	
	while(iNo1 != 0)
	{
		if((iNo1 & 1) == 1)
		{
			iCnt1++;
		}
		iNo1 = iNo1 >> 1;
	}
	
	while(iNo2 != 0)
	{
		if((iNo2 & 1) == 1)
		{
			iCnt2++;
		}
		iNo2 = iNo2 >> 1;
	}
	printf("%d\t",iCnt1);
	printf("%d",iCnt2);
}

int main()
{
	UINT iValue1 = 0, iValue2 = 0;
	int iRet = 0;
	
	printf("Enter a number :\n");
	scanf("%d",&iValue1);
	
	printf("Enter a number :\n");
	scanf("%d",&iValue2);
	
	CountOne(iValue1, iValue2);
	
	return 0;
}