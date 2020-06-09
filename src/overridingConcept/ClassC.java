package overridingConcept;


public class ClassC extends ClassB{
	@Override
	public String m1(String a, String b) {
		System.out.println(super.m1("feb", "march"));
		return a.toUpperCase().concat(b.replace("", ""));
		}
	
	public static void main(String[] args) {
		
		ClassC c=new ClassC();
		System.out.println(c.m1("a", "Sujata"));
	}
	

}
