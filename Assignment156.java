import java.util.*;

class Assignment156
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iLength = 0, iRet = 0;
		 
		 System.out.println("Enter thr number of elements");
		 iLength = sobj.nextInt();
		 
		 Marvellous mobj = new Marvellous(iLength);
		 mobj.Accept();
		 mobj.Display();
		 iRet = mobj.ArrayDemo();
		 System.out.println("Difference is :"+iRet);
		
	}
	
}

class ArrayX
{
	public int Arr[];
	
	public ArrayX(int iSize)
	{
		Arr = new int[iSize];
		
	}
	
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		int iCnt = 0;
		System.out.println("Enter elements");
		for(iCnt = 0; iCnt < Arr.length ; iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
		}
		
	}
	
	public void Display()
	{
		int iCnt  = 0;
		System.out.println("Elements are");
		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			System.out.println(Arr[iCnt]);
		}
	}
}

class Marvellous extends ArrayX
{
	public Marvellous(int iValue)
	{
		super(iValue);
	}
	
	public int ArrayDemo()
	{
		int iSum1 = 0,iSum2 = 0 , iCnt = 0;
		for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
		{
			if((Arr[iCnt] % 2) == 0)
			{
				iSum1 = iSum1 + Arr[iCnt];
				
			}
			else
			{
				iSum2 = iSum2 + Arr[iCnt];
				
			}
		}
		
		return iSum1 - iSum2;
	}
}