#include<stdio.h>

void Display(char c)
{
	if((c >'A') && (c < 'Z'))
	{
		printf("Converted Capital to small Character is : %c",c + 32);
	}
	else if((c > 'a') && (c < 'z'))
	{
		printf("You have entered a small character");
	}
	else
	{
		printf("Not a character please enter character");
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
