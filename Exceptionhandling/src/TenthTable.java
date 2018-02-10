
public class TenthTable extends Thread{
	//public static void main(String[] args){
	public void run(){
		for(int i=1;i<=10;i++){
			System.out.println(i+"*"+"10="+(i*10));
			try{
				Thread.sleep(1000);
			}catch(InterruptedException e){
				e.printStackTrace();
			}
		}
	}

}
