import java.util.*;

class Assignment160
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iLength = 0;
		
		System.out.println("Enter the number of elements");
		iLength = sobj.nextInt();
		
		Marvellous mobj = new Marvellous(iLength);
		mobj.Accept();
		mobj.Display();
		mobj.Mul();
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
		int iCnt = 0;
		Scanner sobj = new Scanner(System.in);
		for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
		{
			Arr[iCnt] = sobj.nextInt();
		}
	}
	
	public void Display()
	{
		int iCnt = 0;
		System.out.println("ELements are : ");
		for(iCnt = 0 ; iCnt <Arr.length ; iCnt++)
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
	
	public void Mul()
	{
		int iCnt = 0;
		for(iCnt = 0 ; iCnt < Arr.length ; iCnt++)
		{
			if((Arr[iCnt] % 11) == 0)
			{
				System.out.println(Arr[iCnt]);
			}
		}
	}
}