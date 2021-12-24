#include<stdio.h>
#include<stdbool.h>

int Display(char c)
{
	printf(" Decimal : %d\n Octal : %o\n Hexadecimal : %x",c,c,c);

}

int main()
{
	char cValue = '\0';
	
	printf("Enter the characte :\n");
	scanf("%c",&cValue);
	
	Display(cValue);
	
	return 0;
	
}