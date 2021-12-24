#include<stdio.h>
#include<string.h>
	

void StrCatX(char *src, char *dest)
{
	int i = 0, j = 0;
	
	while(*src != '\0')
	{
		src++;
	}
	
	while(*dest != '\0')
  {
    *src = *dest;
    src++;
    dest++;
  }
	*dest = '\0';
	
	strcat(src, dest);
}

int main()
{
	char arr[30] = "Marvellous Multi ";
	char brr[30] = "Logic Building";
	
	StrCatX(arr,brr);
	
	printf("%s",arr);
	
	return 0;
}


 /*while (str1[i] != '\0') {
        str3[j] = str1[i];
        i++;
        j++;
    }
  
    // Insert the second string in the new string
    i = 0;
    while (str2[i] != '\0') {
        str3[j] = str2[i];
        i++;
        j++;
    }
    str3[j] = '\0';
	*/
  