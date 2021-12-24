import java.util.*;

class Assignment169
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iLength = 0, iNo1 = 0 , iNo2 =0;
		int iRet = 0;
		
		System.out.println("Enter the number of elements");
		iLength = sobj.nextInt();
		
		System.out.println("Enter Startting Range");
		iNo1 = sobj.nextInt();
		
		System.out.println("Enter Last Range");
		iNo2 = sobj.nextInt();
		
		Marvellous mobj = new Marvellous(iLength); //constructor call
		mobj.Accept();
		mobj.Display();
		mobj.Check(iNo1,iNo2);
	
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
		for(iCnt = 0; iCnt <Arr.length; iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
		}
	}
	public void Display()
	{
		int iCnt = 0;
		System.out.println("Elements are:");
		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			System.out.print("\t"+Arr[iCnt]);
		}
		System.out.println();
	}
}

class Marvellous extends ArrayX
{
	public Marvellous(int iValue)
	{
		super (iValue); 
	}
	
	public void Check(int iStart, int iEnd)
	{
		int iSum = 0, iCnt = 0, iCount = 0;
		
		
		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			 if(( Arr[iCnt] >= iStart) && ( Arr[iCnt] <= iEnd))
			 {
				System.out.print("\t"+Arr[iCnt]);
			 }
		}
		
	}
}