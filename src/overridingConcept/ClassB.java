package overridingConcept;


public class ClassB extends ClassA {
	@Override
	public String m1(String a, String b) {
		System.out.println(super.m1("kailas", "dada"));
		return a.replace(a, b);
	}
	public static void main(String[] args) {
		ClassA b = new ClassB();
		String c=b.m1("f", "g");
		System.out.println(c);
	}

}
