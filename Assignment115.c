#include<stdio.h>


char DisplaySpace(char *str)
{
	int iCnt = 0;
	while(*str != '\0')
	{
		if(*str ==' ')
		{	
			iCnt++;
		}
		str++;
	}
	printf("Blank spaces is : %d",iCnt);
}


int main()
{
	char Arr[20];
	
	printf("Enter a String:\n");
	scanf("%[^'\n']s",Arr);
	
	DisplaySpace(Arr);
	
	return 0;
}