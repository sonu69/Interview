package nestedInterface;

public class Demo implements A{

	public B manage() {
		
		return null;
	}
	
	public static void main(String[] args) {
		
		A a = new Demo();
		a.manage().window().maximize();
		
	}
	
	

}
