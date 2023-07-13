package midTestQuesAll;

class NegativeNumberException extends Exception
{
	public NegativeNumberException()
	{
		super();
	}
	
	public NegativeNumberException(String msg)
	{
		super(msg);
	}
}

public class CustomException {
	
	public static void power(int base, int expo)throws NegativeNumberException
	{
		int power = 1;
		
		if(expo < 0)
		{
			throw new NegativeNumberException("Invalid Exponent");
		}
		else
		{
			for(int i = 1; i <= expo; i++)
			{
				power = power * expo;
			}
		}
		
		System.out.println("Power is : "+power);
	}

	public static void main(String[] args) {
		
		try
		{
			CustomException.power(2, 1);
		}
		catch(NegativeNumberException nn)
		{
			System.out.println(nn.getMessage());
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}
		finally
		{
			System.out.println("In Finally");
		}

		System.out.println("All Power Calculation is done...");
}


}
