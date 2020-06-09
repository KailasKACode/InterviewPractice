package overloadingConcept;

/* In same class
 * same method name
 * Diff list arguments
 * 
 */
public class OverloadingDemo {
	static OverloadingDemo demo;

	public static void main(int[] args) {
		System.out.println("Main Method int");

	}

	public static void main(char[] args) {
		System.out.println("Main Method char");

	}

	public static void main(double[] args) {
		System.out.println("Main Method double");

	}
	
	public static void main(String[] args) {
	demo=new OverloadingDemo();
	demo.main(args);
	
	}
}
