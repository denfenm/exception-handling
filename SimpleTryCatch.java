import java.util.Scanner;

public class SimpleTryCatch {
	public static void main(String[] args)
	{
		Scanner input = new Scanner(System.in);
		try
		{
		System.out.println("Input 1");
		int x = input.nextInt();
		System.out.println("Input 2");
		int y = input.nextInt();
		System.out.println(x+y);
		System.out.println(x/y);
		y =0;
		System.out.println(x/y);
		}
		
		catch(ArithmeticException e)
		{
			System.out.println(e.getMessage());
			
		}
		catch(ArrayIndexOutOfBoundsException e)
		{
			System.out.println(e.getMessage());
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
			
		}
		finally
		{
			System.out.println();
		}
		
		
		
	}

}
