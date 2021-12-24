#include<stdio.h>
#include<string.h>

void StrCpyToggle(char *src, char *dest)
{
	while(*src != '\0')
	{
		if((*src >= 'A') && (*src <= 'Z'))
		{
			printf("%c",*src + 32);
		}
		else if((*src >= 'a') && (*src <= 'z'))
		{
			printf("%c",*src - 32);	
		}
		src++;	
	}
	
	while(*src != '\0')
	{
		*dest = *src;
		src++;
		dest++;
	}
}

int main()
{
	char arr[30] = "Marvellous Python";
	char brr[30];
	
	StrCpyToggle(arr,brr);
	
	printf("%s",brr);
	
	return 0;
}