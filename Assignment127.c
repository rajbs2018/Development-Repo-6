#include<stdio.h>
#include<string.h>

void StrCpyCapX(char *src, char *dest)
{
	while(*src != '\0')
	{
		if(*src == ' ')
		{
			src++;
		}
		else
		{
			*dest = *src;
			src++;
			dest++;
		}
		
	}
	
}

int main()
{
	char arr[30] = "Marvel lous Pyth on";
	char brr[30];
	
	StrCpyCapX(arr,brr);
	
	printf("%s",brr);
	
	return 0;
}