#include<stdio.h>
#include<stdbool.h>

typedef unsigned int UINT;

UINT CheckBit(UINT iNo , UINT iStart , UINT iEnd)
{
	UINT iMask = 0x00000001;
	UINT iResult = 0;
	
	if((iStart && iEnd) < 1  && (iStart && iEnd) > 32)
	{
		return 0;
	}
	
	iMask =  iMask << (iEnd - iStart) ;

	iResult = iNo | iMask;
	
	return iResult;

}


int main()
{
	UINT iValue = 0;
	UINT iNo1 = 0, iNo2 = 0; 
	UINT iRet = 0;
	
	printf("Enter a nmber :\n");
	scanf("%d",&iValue);
	
	printf("Enter 1st Position :\n");
	scanf("%d",&iNo1);
	
	printf("Enter 2nd Position :\n");
	scanf("%d",&iNo2);
	
	CheckBit(iValue ,iNo1 ,iNo2);

	iRet =CheckBit(iValue ,iNo1, iNo2);
	printf("%d",iRet);
	
	return 0;
	
}