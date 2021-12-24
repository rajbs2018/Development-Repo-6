import java.util.*;

class Assignment177
{
	public static void main(String arg[])
	{
		Scanner sobj = new Scanner(System.in);
		int iRow = 0, iCol = 0;
		
		System.out.println("Enter Row : ");
		iRow = sobj.nextInt();
		
		System.out.println("Enter number of colomn : ");
		iCol = sobj.nextInt();
		
		Pattern pobj = new Pattern();
		pobj.Display(iRow , iCol);
			
		
	}
}

class Pattern
{
	public void Display(int iRow , int iCol)
	{
		int iCnt1 = 0, iCnt2 = 0;
		char ch1, ch2 ;
		for(iCnt1 = 1; iCnt1 <= iCol ; iCnt1++)
		{
			for(iCnt2 = 1, ch1 = 'A', ch2 = 'a';iCnt2 <= iRow ; iCnt2++,ch1++,ch2++)
			{
				if((iCnt1 % 2) == 0)
				{
					System.out.print(" \t" +ch2);
				}
				else
				{
					System.out.print(" \t" +ch1);
				}
				
			}
			
		System.out.println();	
			
		}
	}
}