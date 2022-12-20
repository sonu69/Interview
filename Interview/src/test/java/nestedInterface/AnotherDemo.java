package nestedInterface;

public class AnotherDemo {
	
	public NewDemo method3() {
		System.out.println("method3");
		return new NewDemo();
	}
	
	
	public static void main(String[] args) {
		AnotherDemo ad = new AnotherDemo();
		
		ad.method3().method2();
		
	}

}
