package midTestQuesAll;

interface Seriable 
{
	//void show();
	
	default void demo()
	{
		System.out.println("Inside Seriable Demo");
	}
	
	static void hello()
	{
		System.out.println("Inside Seriable Hello");
	}

	//void world();
}

interface Serialable 
{
	//void show();
	
	default void demo1()
	{
		System.out.println("Inside Serialable Demo");
	}
	
	static void hello1()
	{
		System.out.println("Inside Serialable Hello");
	}

	//void world();
}

abstract class Hello
{
	public int i;
	
	public Hello()
	{
		System.out.println("Hello Constructor");
	}
	
	public void fun()
	{
		System.out.println("Hello fun");
	}
	
	//public abstract void gun();
}

class Demo extends Hello implements Seriable,Serialable
{
	public Demo()
	{
		super();
	}
}

public class InterfaceQues3 {
	
public static void main(String[] args) {
		
		Demo d = new Demo();
		
		Seriable.hello();
		Serialable.hello1();
		
		d.fun();
		
		d.demo();
		d.demo1();
	}

}
