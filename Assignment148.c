#include<stdio.h>
#include<stdbool.h>


typedef unsigned int UINT;

UINT CheckBit(UINT iNo)
{
	int iMask = 0x00000900;
	UINT iResult = 0;
	
	iResult = iNo & iMask;
		
		if(iResult == iMask)
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
	UINT iValue =0 ;
	bool bRet = false;
	
	printf("Enter number: \n");
	scanf("%d",&iValue);
	
	//CheckBit(iValue);
	bRet = CheckBit(iValue);
	
	if(bRet == true)
	{
		printf("Bit is On");
	}
	
	else 
	{
		printf("Bit is off");
	}
	return 0;
}