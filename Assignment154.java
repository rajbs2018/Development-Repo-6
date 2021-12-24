import java.util.*;


class Assignment154
{
	public static void main(String arg[])
	{
		Marvellous mobj = new Marvellous();
		mobj.Accept();
		mobj.Display();
		boolean bRet;
		bRet = mobj.CheckVowel();
		if(bRet == true)
		{
			System.out.println("Vowel is present");
		}
		else
		{
			System.out.println("Vowel is not present");
		}
	}
	
}
class StringX
{
	public String str;
	
	public void Accept()
	{
		Scanner sobj = new Scanner(System.in);
		System.out.println("Enter String");
		str = sobj.nextLine();
	}
	
	public void Display()
	{
		System.out.println("String is "+str);
	}
}


class Marvellous extends StringX
{
	public boolean CheckVowel()
	{
		char Arr[] = str.toCharArray();
		int iCnt1 = 0,iCnt2 = 0, i = 0;
		boolean bFlag = false;
		for(i = 0 ; i < Arr.length; i++)
		{
			if((Arr[i] == 'a') || (Arr[i] == 'e') ||(Arr[i] == 'i') || (Arr[i] == 'o') ||(Arr[i] == 'u'))
			{
				bFlag = true;
				break;
			}
			
		} 
		
		return bFlag;
	}
}