package demo3;

public class MethodSync {
	
	public static void main(String args[]) {
		System.out.println("Hello, world!");
		
		Obj obj = new Obj();
		Thread1 t1 = new Thread1(obj);
		Thread2 t2 = new Thread2(obj);
		
		t1.setName("Thread1");
		t2.setName("Thread2");
		
		t1.start();
		t2.start();
		
	}

	

}


class Obj{
	synchronized void display() {
		for(int i = 0; i <= 3; i++) {
			System.out.println(i + " - " + Thread.currentThread().getName());
		}
	}
}


class Thread1 extends Thread{  
	Obj obj;  
	Thread1(Obj obj){  
		this.obj=obj;  
	}  
	public void run(){  
		obj.display();  
	}  
  
}  

class Thread2 extends Thread{  
	Obj obj;  
	Thread2(Obj obj){  
		this.obj=obj;  
	}  
	public void run(){  
		obj.display();  
	}   
}  