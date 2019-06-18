

public class TwoDimension
{
 public static void main (String[] args)
 {
	int [] [] a = { {10,20,30},{40,50,60} };
	int [] [] b = { {11,21,31},{41,51,61} };
	int [] [] Sum = new int [2] [3];
	int rows, columns;
	
	for (rows = 0; rows<a.length; rows++)
	{
	 for (columns = 0; columns<a[0].length; columns++)
	 {
		 Sum[rows][columns] = a[rows][columns] + b[rows][columns];
	 }
	}
	System.out.println("Sum of those Two Arrays are:");
	for(rows = 0; rows<a.length; rows++)
	{
		for(columns = 0; columns<a[0].length; columns++)
		{
		  System.out.format("%d \t", Sum[rows][columns]);	
		}
		System.out.println("");
	}
  }
}