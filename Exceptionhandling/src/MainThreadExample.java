
public class MainThreadExample extends Thread {
	/*public void run(){
		
	}*/
	public static void main(String [] args){
		Thread t=Thread.currentThread();
		//getting name of main thread
		System.out.println("Name:"+t.getName());
		//changing name of main thread
		t.setName("Meena");
		System.out.println("changed name:"+t.getName());
		//getting priority
		System.out.println(t.getPriority());
		//Setting priority
		t.setPriority(MAX_PRIORITY);
		System.out.println(t.getPriority());
		//creating child threads
		ChildThread ct=new ChildThread();
		ChildThread2 ct2=new ChildThread2();

		//getting name of ChildThread name
		System.out.println("Child Thread name:"+ct.getName());
		//setting name
		ct.setName("micky");
		System.out.println("Changed name:"+ct.getName());
		
		//getting priority of ct
		System.out.println(ct.getPriority());
		//setting priority
		ct.setPriority(MIN_PRIORITY);
		System.out.println(ct.getPriority());
		ct.start();	
		ct2.start();
	}

}
 class ChildThread extends Thread{
	public void run(){
		for(int i=0;i<3;i++){
			System.out.println("Child Thread1 is working");
		}
	}
 }
class ChildThread2 extends Thread{
	public void run(){
		for (int i=0;i<5;i++){
			System.out.println("Child Thread 2 is working");
		}
	}
}
 
 

