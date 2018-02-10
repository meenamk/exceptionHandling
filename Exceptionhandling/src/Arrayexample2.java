
public class Arrayexample2 {
	public static void main(String[] args){
		int total=0;
		int[] array=new int[]{10,20,30};
		for(int i=0;i<array.length;i++){
			total+=array[i];
			System.out.println("Total:"+total);
		}
	}

}
