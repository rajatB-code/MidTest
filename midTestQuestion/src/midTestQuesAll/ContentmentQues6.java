package midTestQuesAll;


class Building
{
	private int srNo;
	private String bname;
	private String landmark;
	Watchmen w;
	
	public int getSrNo() 
	{
		return srNo;
	}
	
	public void setSrNo(int srNo) 
	{
		this.srNo = srNo;
	}
	
	public String getBname() 
	{
		return bname;
	}
	
	public void setBname(String bname) 
	{
		this.bname = bname;
	}
	
	public String getLandmark() 
	{
		return landmark;
	}
	
	public void setLandmark(String landmark) 
	{
		this.landmark = landmark;
	}
	
	public Watchmen getW() 
	{
		return w;
	}
	
	public void setW(Watchmen w) 
	{
		this.w = w;
	}

	@Override
	public String toString() 
	{
		return "srNo = " +srNo+ ", bname = " +bname+ ", landmark = " +landmark+ ", w = " +w;
	}
	
	
}

class Watchmen
{
	private String name;
	private int experience;
	private int age;
	
	public String getName() 
	{
		return name;
	}
	
	public void setName(String name) 
	{
		this.name = name;
	}
	
	public int getExperience() 
	{
		return experience;
	}
	
	public void setExperience(int experience) 
	{
		this.experience = experience;
	}
	
	public int getAge() 
	{
		return age;
	}
	
	public void setAge(int age) 
	{
		this.age = age;
	}

	@Override
	public String toString() 
	{
		return "name = " +name+ ", experience = " +experience+ ", age = " +age;
	}
		
}
public class ContentmentQues6 {
public static void main(String[] args) {
		
		Building b = new Building();
		
		b.setBname("Tejraj Elevia");
		b.setSrNo(83);
		b.setLandmark("Baner");
		b.setW(new Watchmen());
		b.getW().setName("Manoj");
		b.getW().setExperience(3);
		b.getW().setAge(26);
		
		System.out.println(b);
	}

}
