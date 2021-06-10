class Boy{
	private String name;
	private int age;
	private int mob_num;


	public String getName(){
		return name;

	}

	public int getAge(){
		return age;
		
	}


	public void setName(String name){
		this.name=name;
	}

	public void setAge(int age){
		this.age=age;
	}
}


public class Encaps{
	public static void main(String[] args) {
		Boy mafa = new Boy();
		mafa.setName("Mafas");
		mafa.setAge(22);
		System.out.println("Name is"+ mafa.getName());
		System.out.println("Age is"+ mafa.getAge());



}
}
