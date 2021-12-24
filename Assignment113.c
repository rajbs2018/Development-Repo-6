#include<stdio.h>


char DisplayDigit(char *str)
{
	int i = 0;
	while(*str != '\0')
	{
		if((*str >= 'a') && (*str <= 'z'))
		{	
			printf("%c",*str - 32);
		}
		else if((*str >= 'A') && (*str <= 'Z'))
		{
			printf("%c",*str + 32);
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