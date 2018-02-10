 /*class Sample extends Thread{
	 public void run(){
		 System.out.println("Thread"+Thread.currentThread().getId());
	 }
	
}*/

class Sample implements Runnable{
	public void run(){
		System.out.println("Thread"+Thread.currentThread().getId());
	}
	
}

 class MultithreadSample implements Runnable{
	 public MultithreadSample sample;
	 
	public static void main(String [] args){
		System.out.println("Thread starts");
		for(int i=0;i<4;i++){
		//Sample obj=new Sample();
			Thread obj=new Thread(new Sample());	
			System.out.println("Thread current state:"+obj.getState());
		obj.start();
		//System.out.println("Thread ends");
		System.out.println("Thread current state:"+obj.getState());
		System.out.println("Thread current state:"+obj.getState());
		}
	}
	public void run(){
		
	}

}
