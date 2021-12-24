#include<stdio.h>
#include<stdbool.h>

typedef unsigned int UINT;

int OffBit(UINT iNo, int iPos)
{
	UINT iMask =0x00000001;
	UINT iResult = 0;
	
	if((iPos < 1) && (iPos > 32))
	{
		return false;
	}
	
	iMask = iMask << (iPos - 1);

	iResult = iNo ^ iMask;
	
	return iResult;
	
}	

int main()
{
	UINT iValue = 0, iBit = 0;
	int iRet = 0;
	
	printf("Enter number\n");
	scanf("%d",&iValue);
	
	printf("Enter a Bit\n");
	scanf("%d",&iBit);
	
	OffBit(iValue, iBit);
	iRet = OffBit(iValue, iBit);
	
	printf("Modified number is : %d",iRet);
	
	return 0;
}