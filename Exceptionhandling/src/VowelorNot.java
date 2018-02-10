import java.util.Scanner;

public class VowelorNot {
	public static void main(String[] args){
		//int i;
		boolean vowel=false;
	@SuppressWarnings("resource")
	Scanner scan=new Scanner(System.in);
	System.out.println("Enter a char");
	char c=scan.next().charAt(0);
	/*char[] vow=new char[]{'a','e','i','o','u'};
	for(i=0;i<vow.length;i++){
		if(c!=(vow[i])){
			System.out.println("NO");
			//break;
	    }else{
	    	System.out.println("yes");
	    	break;
	    }*/
	switch(c){
	case 'a':
	case 'e':
	case 'i':
	case 'o':
	case 'u': vowel=true;
	}
	if(vowel==true){
		System.out.println("yes");
	}else{
		System.out.println("no");
	}
}
}

