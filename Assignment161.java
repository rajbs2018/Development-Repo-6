import java.util.*;

class Assignment161
{
	public static void main(String str[])
	{
		Scanner sobj = new Scanner(System.in);
		int iValue = 0 , iRet = 0;
		
		System.out.println("Enter a number : ");
		iValue = sobj.nextInt();
		
		Marvellous mobj = new Marvellous();
		iRet = mobj.Digit(iValue);
		System.out.println("Count of Even number is : " +iRet);
	}
	
}

class Marvellous
{
	public int Digit(int iNo)
	{
		int iDigit = 0 , iCnt = 0;
		
		if(iNo < 0)
		{
			iNo = -iNo;
		}
		import java.util.*;

class Assignment161
{
	public static void main(String str[])
	{
		Scanner sobj = new Scanner(System.in);
		int iValue = 0 , iRet = 0;
		
		System.out.println("Enter a number : ");
		iValue = sobj.nextInt();
		
		Digit mobj = new Digit();
		iRet = mobj.CountEven(iValue);
		System.out.println("Count of Even number is : " +iRet);
	}
	
}

class Digit
{
	public int CountEven(int iNo)
	{
		int iDigit = 0 , iCnt = 0;
		
		if(iNo < 0)
		{
			iNo = -iNo;
		}
		
		while(iNo != 0)
		{
			iDigit = iNo % 10;
			
			if((iDigit % 2) == 0)
			{
				iCnt++;
			}
			
			iNo = iNo / 10;
			
		}
		
		return iCnt;
	}
}
		while(iNo != 0)
		{
			iDigit = iNo % 10;
			
			if((iDigit % 2) == 0)
			{
				iCnt++;
			}
			
			iNo = iNo / 10;
			
		}
		
		return iCnt;
	}
}