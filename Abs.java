class Boy{
	String name;
	String gender;
	int age;
	public void eat(){
		System.out.println("Biriyani");
	}
}

public class Abs{
	public static void main(String[] args) {
		Boy mafa = new Boy();
		mafa.name="Mafas";
		mafa.gender="Male";
		mafa.age=22;
		System.out.println(mafa.name);
		System.out.println(mafa.gender);
		System.out.println(mafa.age);
		mafa.eat();
	}
	
}