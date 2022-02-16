package demo3;


public class SyncBlock {
	
	public static void main(String args[]) {
		System.out.println("Hello, world!");
		
		Object obj = new Object();
		MultiThread1 t1 = new MultiThread1(obj);
		MultiThread2 t2 = new MultiThread2(obj);
		
		t1.setName("Thread1");
		t2.setName("Thread2");
		
		t1.start();
		t2.start();
		
	}

	

}


class Object{
	void display() {
		
		synchronized(this) {
			for(int i = 0; i <= 3; i++) {
				System.out.println(i + " - " + Thread.currentThread().getName());
			}
		}
		
	}
}


class MultiThread1 extends Thread{  
	Object obj;  
	MultiThread1(Object obj){  
		this.obj=obj;  
	}  
	public void run(){  
		obj.display();  
	}  
  
}  

class MultiThread2 extends Thread{  
	Object obj;  
	MultiThread2(Object obj){  
		this.obj=obj;  
	}  
	public void run(){  
		obj.display();  
	}   
}  