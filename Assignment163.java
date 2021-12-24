import java.util.*;

class Assignment163
{
	public static void main(String str[])
	{
		Scanner sobj = new Scanner(System.in);
		int iValue = 0 , iRet = 0;
		
		System.out.println("Enter a number : ");
		iValue = sobj.nextInt();
		
		Digit mobj = new Digit();
		iRet = mobj.CountRange(iValue);
		System.out.println("Range between 3 to 7 is : " +iRet);
	}
	
}

class Digit
{
	public int CountRange(int iNo)
	{
		int iDigit = 0 , iCnt = 0;
		
		if(iNo < 0)
		{
			iNo = -iNo;
		}
		
		while(iNo != 0)
		{
			iDigit = iNo % 10;
			
			if((iDigit >= 3) && (iDigit <= 7))
			{
				iCnt++;
			}
			
			iNo = iNo / 10;
			
		}
		
		return iCnt;
	}
}