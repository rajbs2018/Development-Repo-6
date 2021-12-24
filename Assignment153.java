import java.util.*;


class Assignment153
{
	public static void main(String arg[])
	{
		int iRet =0;
		Marvellous mobj = new Marvellous();
		mobj.Accept();
		mobj.Display();
		iRet = mobj.CountDiff();
		System.out.println("Count Diff is : "+iRet);
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
	public int CountDiff()
	{
		char Arr[] = str.toCharArray();
		int iCnt1 = 0,iCnt2 = 0, i = 0;
		for(i = 0 ; i < Arr.length; i++)
		{
			if((Arr[i] >= 'a') && (Arr[i] <= 'z'))
			{
				iCnt1++;
			}
			else if((Arr[i] >='a') && (Arr[i] <= 'z'))
			{
				iCnt2++;
			}
		}
		return iCnt2 - iCnt1;
		
	}
}