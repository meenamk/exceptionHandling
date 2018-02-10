import java.util.ArrayList;
import java.util.Iterator;

public class Testcollection3 {
	public static void main(String [] args){
		student s1=new student(100,"Meena");
		student s2=new student(200,"Sureka");
		student s3=new student(300,"kirthika");
		student s4=new student(400,"udhay");
		ArrayList<student>al=new ArrayList<student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		al.add(s4);
		Iterator<student> it=al.iterator();
		while(it.hasNext()){
			student st=(student)it.next();  
		    System.out.println(st.Roll_no+" "+st.Name+" "); 
		}
		
	}

}
