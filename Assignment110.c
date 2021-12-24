#include<stdio.h>
int Reverse(char str[])
{
	int i = 0, j = 0;
	int iCnt = 0;
	char Brr[20];
	
	while (str[iCnt] != '\0')		
	{	
	iCnt++;		
	}
	j = iCnt - 1;
		
	for(i = 0 ; i < iCnt ; i++)
	{
		Brr[i] = str[j];
		j--;
	}	
	
	printf("Rev String : %s",Brr);
	
}

int main()
{
	char Arr[20], str[20];
	
	printf("Enter the Sring :\n");
	scanf("%[^'\n']s",Arr);
	
	printf("Before Reevrsal of string is : %s\n",Arr);
	
	Reverse(Arr);
	
	return 0;
	
}