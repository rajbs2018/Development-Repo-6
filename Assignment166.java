import java.util.*;

class Assignment166
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iLength = 0, iNo = 0;
		boolean bRet = false;
		
		System.out.println("Enter the number of elements");
		iLength = sobj.nextInt();
		
		System.out.println("Enter serching Digit");
		iNo = sobj.nextInt();
		
		Marvellous mobj = new Marvellous(iLength); //constructor call
		mobj.Accept();
		mobj.Display();
		bRet = mobj.Cheak(iNo);
		
		if(bRet == false)
		{
			System.out.print("Number is present");
		}
		else
		{
			System.out.println("Number is Not present");
		}
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
			System.out.println(Arr[iCnt]);
		}
	}
}

class Marvellous extends ArrayX
{
	public Marvellous(int iValue)
	{
		super (iValue); 
	}
	public boolean Cheak(int iNo)
	{
		int iSum = 0, iCnt = 0;
		boolean bFlag = true;
		for(iCnt = 0; iCnt < Arr.length; iCnt++)
		{
			 if(Arr[iCnt] == iNo)
			 {
				bFlag = false;
				break;
			 }
		}
		
		return bFlag;
	}
}

