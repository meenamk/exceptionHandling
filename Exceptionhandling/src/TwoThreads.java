class TwoTable extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("ChildThread 1 is running:"+(i*2));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
class FifthTable extends Thread{
	public void run(){
		for(int i=1;i<=5;i++){
			System.out.println("ChildThread 2 is running:"+(i*5));
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
}
public class TwoThreads {
	public static void main(String [] args){
		TwoTable two=new TwoTable();
	     two.start();
		FifthTable five=new FifthTable();
		five.start();
		TenthTable tt=new TenthTable();
		tt.start();
		FifthTable2 ft=new FifthTable2();
		ft.start();
	}

}
