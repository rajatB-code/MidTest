package midTestQuesAll;

interface FirstQInterface {
	
	void show();
	
	default void demo(int id)
	{
		System.out.println("Inside Demo");
	}
	
	static void hello()
	{
		System.out.println("Inside Interface Hello");
	}

	void world();
}

class One implements FirstQInterface
{
	public void show()
	{
		System.out.println("Inside One Show");
	}
	
	public void world()
	{
		System.out.println("Inside One World");
	}
}
class Second implements FirstQInterface
{
	public void show()
	{
		System.out.println("Inside Second Show");
	}
	
	public void world()
	{
		System.out.println("Inside Second World");
	}
}

class Third implements FirstQInterface
{
	public void show()
	{
		System.out.println("Inside Third Show");
	}
	
	public void world()
	{
		System.out.println("Inside Third World");
	}
}


public class InterfaceFirstque implements FirstQInterface
{
	public static void main(String[] args) 
	{
		One o = new One();
		o.show();
		o.world();
		
		Second s = new Second();
		s.world();
		s.show();
		
		Third t = new Third();
		t.world();
		t.show();
		
		FirstQInterface.hello();
		
		InterfaceFirstque iq = new InterfaceFirstque();
		iq.world();
		iq.show();
	}
	@Override
	public void show() 
	{
		System.out.println("Inside FirstQuestion show");
	}

	@Override
	public void world() 
	{
		System.out.println("Inside FirstQuestion world");
	}

}
