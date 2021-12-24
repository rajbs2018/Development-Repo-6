import java.util.*;

class Assignment164
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iValue = 0, iRet = 0;
		
		System.out.println("Enter a number : ");
		iValue = sobj.nextInt();
		
		Digit dobj = new Digit();
		iRet = dobj.DigitMul(iValue);
		
		System.out.println("Multiplication og all digits : "+iRet);
		
		
	}
}

class Digit
{
	public int DigitMul(int iNo)
	{
		int iMul =1 , iDigit = 0;
		
		while(iNo != 0)
		{
			iDigit = iNo % 10;
			iMul = iMul * iDigit;
			iNo = iNo / 10;
			
		}
		
		return iMul;
	}
}