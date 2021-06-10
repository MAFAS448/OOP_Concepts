class Employee{

	String name;
	int id;


	public void work(int h)
	{
		System.out.println("Working Hours:" + " " +h+ "hours only.");
	}

	public void work(int h,int min, int sec)
	{
		System.out.println("Working Hours:" + " " +h+ "and" +min+ "minutes"+sec+"seconds");
	}

}	

class Employee2 extends Employee{

	public void work(int h)
	{
		System.out.println("Working "+h+"hours, for weekdays only.");
	}

	public void work(int h,int min)
	{
		System.out.println("Working" +h+"hours,"+min+"minutes for every days");
	}


	

}


public class Polymor{
	public static void main(String[] args) {
		Employee2 mafa=new Employee2();
		mafa.name="Mafas";
		mafa.id=01100;
		mafa.work(8);
		mafa.work(10,30,15);

	}
}