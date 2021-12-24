#include<stdio.h>

void Display(char c)
{
	int i = 0;
	for(i = c; i <= 'z'; i++)
	{
		printf("Range for input character %c                    to z is : %c\n",c);
		c++;
	}
}

int main()
{
	char cValue = '\0';
	printf("Enter character\n");
	scanf("%c",&cValue);
	
	Display(cValue);
	
	return 0;
}
