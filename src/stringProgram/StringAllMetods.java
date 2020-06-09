package stringProgram;

public class StringAllMetods {
	public static void main(String[] args) {
		String nameFirst="karan";
		String nameSecond="Deshmukh";
		//We can find length of the string
		System.out.println("Length Of karan name "+nameFirst.length()+"   length of Deshmukh name  "+nameSecond.length());
		
		//from char array to creating string
		char[]  helloAarray= {'H','e','l','l','o','A','r','r','a','y'};
		String helloString=new String(helloAarray);
		System.out.println(helloAarray);
		
		
	}
}
