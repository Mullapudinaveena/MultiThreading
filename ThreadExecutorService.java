package demo3;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadExecutorService {

	public static void main(String[] args) {
		
		
		ExecutorService executorService = Executors.newFixedThreadPool(5);
		
		executorService.execute(new Runnable(){
			public void run() {
				System.out.println("execute task");
			}
		});
		
		
		executorService.shutdown();
	}
}
