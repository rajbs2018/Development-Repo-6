#include<stdio.h>
#include<string.h>

void StrCpyCap(char *src, char *dest)
{
	while(*src != '\0')
	{
		if((*src >= 'a') && (*src <= 'z'))
		{
			printf("%c",*src - 32);
		}
		else
		{
			printf("%c",*src);	
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
	
	StrCpyCap(arr,brr);
	
	printf("%s",brr);
	
	return 0;
}