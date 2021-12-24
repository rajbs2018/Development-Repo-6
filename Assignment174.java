import java.util.*;


class Program153
{
	public static void main(String arg[])
	{
		
		
		
		Marvellous mobj = new Marvellous();
		mobj.Accept();
		mobj.Display();
		String s = mobj.ReverseX();
		
		char Brr[] = s.toCharArray();
		int iStart = 0, iEnd = Brr.length - 1;
		char temp;
		
		while(iStart < iEnd)
		{
			temp = Brr[iStart];
			Brr[iStart] = Brr[iEnd];
			Brr[iEnd] = temp;			
			iStart++;
			iEnd--;
			
		}
		String Crr = new String(Brr);
	
		System.out.println("Reverse string is : "+Crr);
		
	}
}

class StringX
{
	public String str;
	
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter String");
		str = sobj.nextLine();
	}
	
	public void Display()
	{
		System.out.println("String is :"+str);
	}
	
}

class Marvellous extends StringX
{
	public String ReverseX()
	{
		char Arr[] = str.toCharArray();
		int iStart = 0, iEnd = Arr.length - 1;
	
	
		for(iStart = 0 ; iStart <= iEnd ; iStart++)
		{
			if(Arr[iStart] >= 'A' && Arr[iStart] <= 'Z')
			{
				Arr[iStart] = (char)((int)Arr[iStart] + 32);
			}
			
			else if(Arr[iStart] >= 'a' && Arr[iStart] <= 'z')
				
			{
				Arr[iStart] = (char)((int)Arr[iStart] - 32);
			}
					
		}
		
		return new String(Arr);
	}
}
