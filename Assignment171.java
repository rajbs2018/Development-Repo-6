import java.util.*;

class Assignment171
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);	
		int iNo = 0;
				
		StringDemo pobj = new StringDemo();
		pobj.Accept();
		pobj.Display();
		
		System.out.print("Enter a number of character to display : \n");
		iNo = sobj.nextInt();
		
		String s = pobj.StrNCat(iNo);
		System.out.println("Concaination of string is : "+s);
		
		
		
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
	public String StrNCat(int iNo)
	{
		int iCnt1 = 0 ,iCnt2 = 0 ;
		char Brr[] = str2.toCharArray();
		char Crr [] = new char[30];
		

		while(iCnt2 < iNo)
		{
			Crr[iCnt1] = Brr[iCnt2];
			iCnt1++;
			iCnt2++;
 		}
		
		
		String Drr = new String(Crr);
		return new String(str1 + Drr);
	}
}