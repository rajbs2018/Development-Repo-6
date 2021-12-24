import java.util.*;

class Assignment159
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iLength = 0, iRet = 0;
		
		System.out.printf("Enter the number of elements");
		iLength = sobj.nextInt();
		
		Marvellous mobj = new Marvellous(iLength);
		mobj.Accept();
		mobj.Display();
		mobj.Divide();
		
		
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
		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
		}
	}
	public void Display()
	{
		int iCnt = 0;
		System.out.println("Elements are : ");
		for(iCnt = 0 ; iCnt < Arr.length ; iCnt ++)
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
	
	public void Divide()
	{
		int iCnt = 0;
		for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
		{
			if(((Arr[iCnt] % 3) == 0) && (Arr[iCnt] % 5 == 0))
			{
				System.out.println(Arr[iCnt]);
			}
		}
	}
}


