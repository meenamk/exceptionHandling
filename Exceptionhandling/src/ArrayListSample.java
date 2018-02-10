import java.util.ArrayList;

public class ArrayListSample {
	public static void main(String[] args){
		int n=3;
		int total=0;
		ArrayList<Integer> arrlist=new ArrayList<Integer>(n);
		for (int i=0;i<n;i++){
			arrlist.add(i);
		}
		System.out.println(arrlist);
		arrlist.add(4);
		System.out.println(arrlist);
		for(int i=0;i<arrlist.size();i++){
			total+=arrlist.get(i);
		}
		System.out.println("Total:"+total);
		arrlist.clear();
		System.out.println(arrlist);
		
	
	}
	

}
