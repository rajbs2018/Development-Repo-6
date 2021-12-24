#include<stdio.h>
#include<stdbool.h>

typedef unsigned int UINT;

bool CheckBit(UINT iNo , UINT iPos1 , UINT iPos2)
{
	UINT iMask1 = 0x00000001;
	UINT iMask2 = 0x00000001; 
	UINT iResult1 = 0;
	UINT iResult2 = 0; 
	if((iPos1 && iPos2) < 1  && (iPos1 && iPos2) > 32)
	{
		return false;
	}
	
	iMask1 = iMask1 <<(iPos1 - 1);
	iMask2 = iMask2 <<(iPos2 - 1);

	iResult1 = iNo & iMask1;
	iResult2 = iNo & iMask2;
	
	if(iResult1 == iResult2)
	{
		return true;
	}
	else
	{
		return false;
	}
}


int main()
{
	UINT iValue = 0;
	UINT iNo1 = 0, iNo2 = 0;
	bool bRet = false; 
	
	printf("Enter a nmber :\n");
	scanf("%d",&iValue);
	
	printf("Enter 1st Position :\n");
	scanf("%d",&iNo1);
	
	printf("Enter 2nd Position :\n");
	scanf("%d",&iNo2);
	
	CheckBit(iValue ,iNo1 ,iNo2);
	bRet = CheckBit(iValue, iNo1, iNo2);
	
	if(bRet == true)
	{
		printf("Bit is OFF");
	}
	else
	{
		printf("Bit is ON");
	}
	return 0;
	
}