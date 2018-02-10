import java.util.Scanner;

public class StringExcercise {
	public static void main(String[] args){
		String str="Welcome to Java";
		System.out.println("Enter the index to see the characters starts from 0");
		@SuppressWarnings("resource")
		Scanner scan=new Scanner(System.in);
		int a=scan.nextInt();
		System.out.println(str.charAt(a));
		int c=str.charAt(a);
		System.out.println(c);
	
	}

}
