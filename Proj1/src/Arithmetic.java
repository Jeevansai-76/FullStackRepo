
public class Arithmetic {

	public void sum(int a,int b) {
		System.out.println(a+b);
	}
	
	public static void main(String[] args) {
		System.out.println("Arithmetic.main()");
		new Arithmetic().sum(1,2);
	}

}
