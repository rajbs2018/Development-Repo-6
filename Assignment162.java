import java.util.*;

class Assignment162
{
	public static void main(String str[])
	{
		Scanner sobj = new Scanner(System.in);
		int iValue = 0 , iRet = 0;
		
		System.out.println("Enter a number : ");
		iValue = sobj.nextInt();
		
		Digit mobj = new Digit();
		iRet = mobj.CountOdd(iValue);
		System.out.println("Count of odd number is : " +iRet);
	}
	
}

class Digit
{
	public int CountOdd(int iNo)
	{
		int iDigit = 0 , iCnt = 0;
		
		if(iNo < 0)
		{
			iNo = -iNo;
		}
		
		while(iNo != 0)
		{
			iDigit = iNo % 10;
			
			if((iDigit % 2) == 1)
			{
				iCnt++;
			}
			
			iNo = iNo / 10;
			
		}
		
		return iCnt;
	}
}