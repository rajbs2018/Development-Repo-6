#include<stdio.h>
#include<string.h>

void StrCpyCapRev(char *src, char *dest)
{
	int iCnt = 0, i = 0;
	char temp;
	char *end = NULL;
	char *start = NULL;
	start = src;
	end = src;
	
	
	while(*end != '\0')
	{
		end++;
	}
	end--;
	
	while(start < end)
	{
		temp = *end;
		*end = *start; 
		*start = temp;
		
		start++;
		end--;
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
	char arr[30] = "Marvellous Multi OS";
	char brr[30];
	
	StrCpyCapRev(arr,brr);
	
	printf("%s",arr);
	
	return 0;
}