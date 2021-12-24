#include<stdio.h>
#include<stdbool.h>

typedef unsigned int UINT;

int OffBit(UINT iNo)
{
	UINT iMask =0x00000040;
	UINT iResult = 0;
	
	iResult = iNo ^ iMask;
	
	return iResult;
	
}	

int main()
{
	UINT iValue = 0;
	int iRet = 0;
	
	printf("Enter number\n");
	scanf("%d",&iValue);
	
	iRet = OffBit(iValue);
	
	printf("Modified number is : %d",iRet);
	
	return 0;
}