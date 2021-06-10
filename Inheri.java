class Boy{
	void work(){
		System.out.println("working...");
	}
	
}


class Girl extends Boy{
	void sleep(){
		System.out.println("sleeping...");
	}
}

public class Inheri{
	public static void main(String[] args) {
		Girl g = new Girl();
		g.work();
		g.sleep();
	}
}