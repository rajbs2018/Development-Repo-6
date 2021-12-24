import java.util.*;

class Assignment165
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iValue = 0, iRet = 0;
		
		System.out.println("Enter a number : ");
		iValue = sobj.nextInt();
		
		Digit dobj = new Digit();
		iRet = dobj.CountDiff(iValue);
		
		System.out.println("Diffrence between even and Odd : "+iRet);
		
		
	}
}

class Digit
{
	public int CountDiff(int iNo)
	{
		int iMul =1 , iDigit = 0, iSum1 = 0 , iSum2 = 0 ;
		
		while(iNo != 0)
		{
			iDigit = iNo % 10;
			
			if((iDigit % 2) == 0)
			{
				iSum1 = iSum1 + iDigit;
			}
			else 
			{
				iSum2 = iSum2 + iDigit;
			}
			iNo = iNo / 10;
			
		}
		
		return iSum1 - iSum2;
	}
}