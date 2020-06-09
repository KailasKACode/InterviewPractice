package stringProgram;

public class GetTheNumberFromString {
	public static void main(String[] args) {
		String name = "T1e3s5t7";
		int no=0;
		int sum=0;
		String number = name.replaceAll("[\\D]", "");
		System.out.println(number);
		for (int i = 0; i < number.length(); i++) {
			no = Integer.parseInt(String.valueOf(number.charAt(i)));
			sum+=no ;
			System.out.println("  "+no);
		}
		System.out.println("Sum of all  "+sum);
	
	}

}
