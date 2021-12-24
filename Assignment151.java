import java.util.*;


class Assignment151
{
	public static void main(String arg[])
	{
		int iRet =0;
		Marvellous mobj = new Marvellous();
		mobj.Accept();
		mobj.Display();
		iRet = mobj.CountCapital();
		System.out.println("Count of Capital is : "+iRet);
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
	public int CountCapital()
	{
		char Arr[] = str.toCharArray();
		int iCnt = 0, i = 0;
		for(i = 0 ; i < Arr.length; i++)
		{
			if((Arr[i] >= 'A') && (Arr[i] <= 'Z'))
			{
				iCnt++;
			}
		}
		return iCnt;
		
	}
}