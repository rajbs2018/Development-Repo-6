import java.util.*;


class Assignment155
{
	public static void main(String arg[])
	{
		Marvellous mobj = new Marvellous();
		mobj.Accept();
		mobj.Display();
		String s = mobj.Reversal();
		System.out.println("Reversal of String is : "+s);
		
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
		System.out.println("String is "+str);
	}
}


class Marvellous extends StringX
{
	public String Reversal()
	{
		char Arr[] = str.toCharArray();
		int iStart = 0,iEnd = Arr.length - 1, i = 0;
		char temp;
		for(iStart = 0 ; iStart < iEnd; iStart++,iEnd--)
		{
			temp = Arr[iEnd];
			Arr[iEnd] = Arr[iStart];
			Arr[iStart] = temp;
			
		} 
		return String.valueOf(Arr);
	}
}