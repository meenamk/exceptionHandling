import java.util.Arrays;

class student{
	int Roll_no;
	String Name;
	int[] newArray;
	student(int rollno, String name){
		this.Roll_no=rollno;
		this.Name=name;
	}
	student(int[] Marks){
		this.newArray=Marks;
		int Mark=0;
		for(int i=0;i<Marks.length;i++){
			Mark+=Marks[i];}
			System.out.println("Total "+Mark);
	}
	void showMarks()
	{
		for(int i=0;i<newArray.length;i++){
	
			System.out.println(newArray[i]);
		}
	}
	
	
}
public class ArraySample {
	public static void main(String[] args){
		int intArray[];
		int intArr[]=new int[]{10,20,30,40,50};
		intArray=intArr;
		Object[] obj1={intArray};
		Object[] obj2={intArr};
		//for (int i=0;i<intArray.length;i++){
		//System.out.print(intArray[i]+" ");
		//}	
		student s=new student(intArray);
		//s.Mark(intArray);
		student[] array=new student[5];
		array[0]=new student(123,"Meena");
		//array[1]=new student(1234,"meera");
		System.out.println(array[0].Roll_no+" "+array[0].Name);
		s.showMarks();
		/*System.out.println(array[1].Roll_no+" "+array[1].Name);
		System.out.println(array[5].Roll_no+" "+array[5].Name);
		}catch(NullPointerException npe){
		*/
		int[] cloneArray=intArray.clone();
		System.out.println(intArray==cloneArray);
		for(int i=0;i<cloneArray.length;i++){
			System.out.println(cloneArray[i]);}
		
		System.out.println(intArray[0]==cloneArray[0]);
		double d[]=new double[3];
		for (double val:d){
			System.out.println("val" + val);
			
		}
		if(Arrays.deepEquals(obj1, obj2)){
			System.out.println("same");
		}else{
			System.out.println("no");
		}
		/*System.out.println("There is  no value at this location");
		}catch(ArrayIndexOutOfBoundsException are){
			System.out.println("Don't exceed more than 5");
		}*/
	}
	
}
	


