
public class StringByte {
	public static void concat(String string){
		string=string+"welcome";
		System.out.println(string);
	}
	public static void main(String[]args){
		byte a[]={71,101,101,107,115};
		String s=new String(a);
		System.out.println(s.length());
		System.out.println(s.charAt(2));
		System.out.println(s);
		System.out.println(s.substring(2,4));
		String s1="Hello";
		String s2="Welcome";
		String str=s1+" "+s2;
		System.out.println(str.indexOf("ello"));
		//System.out.println(str.indexOf('l',));
		String s3 ="Learn Share Learn";
		 int output = s3.indexOf('r',1);
		 System.out.println(output);
		 System.out.println(s2.toUpperCase());
		 System.out.println(str.trim());
		System.out.println(str.replace('w', 'W'));
		StringBuffer sb=new StringBuffer("GeeksforGeeks");
        int p=sb.length();
        int q=sb.capacity();
        System.out.println("Length of string GeeksforGeeks="+p);
        System.out.println("Capacity of string GeeksforGeeks="+q);
        StringBuffer b2=new StringBuffer();
        b2.append("hello welcome");
        System.out.println(b2);
		b2.insert(6,"meena");
		System.out.println(b2);
		b2.insert(11, " ");
		System.out.println(b2);
		//System.out.println(b2.reverse());
		System.out.println(b2.replace(6,11,"meera"));
		Boolean output1=s2.equalsIgnoreCase("welcome");
		System.out.println(output1);
		String str1="welcome to java";
		String str2="java is an intresting programming language";
		int str3=str1.compareToIgnoreCase(str2);
		System.out.println(str3);
		String string="Meena";//value never change. string immutable
		concat(string);
		System.out.println(string);//string object refer two different values
		
		
	}

}
