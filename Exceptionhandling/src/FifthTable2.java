
public class FifthTable2 extends Thread{
	//public static void main(String[] args){
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(i+"*"+"5="+(i*5));
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}


}
