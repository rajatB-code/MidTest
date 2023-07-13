package midTestQuesAll;

import java.util.Scanner;

class NotEligibleForVaccineException extends Exception
{
	public NotEligibleForVaccineException()
	{
		super();
	}
	
	public NotEligibleForVaccineException(String msg)
	{
		super(msg);
	}
}


public class CovinApp {
	
	public static void firstVaccine(boolean d, int days) throws NotEligibleForVaccineException
	{	
		if(d == false)
		{
			throw new NotEligibleForVaccineException("First Complete your First vaccine");
		}
		else if(days < 60)
		{
			throw new NotEligibleForVaccineException("Days Complete After First Dose is Less than 60");
		}
		else if(d == true && days > 60)
		{
			System.out.println("Your Slot is Book for Vaccination");
		}
	}

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		
		System.out.println("Enter the Slot Booking Process");
		
		System.out.println("Is you complete First Vaccine");
		boolean bflag = sc.nextBoolean();
		System.out.println("Enter no of days since First Dose");
		int iNo = sc.nextInt();
		
		try
		{
			firstVaccine(bflag, iNo);
		}
		catch(NotEligibleForVaccineException ne)
		{
			System.out.println(ne.getMessage());
		}

	}

}
