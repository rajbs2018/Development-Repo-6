import java.util.*;

class Assignment172
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);	
		int iNo = 0;
		
		boolean iRet = false;
				
		StringDemo pobj = new StringDemo();
		pobj.Accept();
		pobj.Display();
		
		System.out.print("Enter a number of character to display : \n");
		iNo = sobj.nextInt();
		
		
		iRet = pobj.StrNCat(iNo);
		if(iRet == true)
		{
			System.out.println("String is equal");
		}
		else
		{
			System.out.println("String is not equal");
		}		
		
	}
}
class StringX
{
	public String str1, str2;
	
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
			
		System.out.print("Enter first String : \n");
		str1 = sobj.nextLine();
		
		System.out.print("Enter second String : \n");
		str2 = sobj.nextLine();	
		
		
		
	}
	public void Display()
	{ 
		
		System.out.println("1st String is : "+str1);
		System.out.println("2nd String is : "+str2);
		
	}
	
}

class StringDemo extends StringX
{
	public boolean StrNCat(int iNo)
	{
		int iCnt1 = 0 ,iCnt2 = 0 ;
		char Arr[] = str1.toCharArray();
		char Brr[] = str2.toCharArray();
		
		int i = Arr.length - 1;
		int j = Brr.length - 1;
		
		
			while(iCnt1 < iNo)
			{
				if(Arr[iCnt1] == Brr[iCnt2])
				{
					iCnt1++;
					iCnt2++;
				}
				else
				{
					System.out.print("Not a equal");
					break;
				}
				
			}
		
		
		return true;
	}
}