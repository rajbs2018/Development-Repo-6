#include<stdio.h>


char DisplayDigit(char *str)
{
	int i = 0;
	while(*str != '\0')
	{
		if((*str >= '0') && (*str <= '9'))
		{	
			printf("%c",*str);
		}
		str++;
	}
}


int main()
{
	char Arr[20];
	
	printf("Enter a String:\n");
	scanf("%[^'\n']s",Arr);
	
	DisplayDigit(Arr);
	
	return 0;
}