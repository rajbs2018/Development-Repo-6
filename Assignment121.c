#include<stdio.h>
#include<string.h>

void StrCpyX(char *src, char *dest)
{
	while(*src != 0)
	{
		*dest = *src;
		src++;
		dest++;
	}
	printf("%s",dest);
	strcpy(dest,src);
}

int main()
{
	char arr[30] = "Marvellous Multi OS";
	char brr[30];
	
	StrCpyX(arr,brr);
	
	printf("%s",brr);
	
	return 0;
}