package com.exception.pgm;

import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

class CallableRunner implements Callable<String>{

	private String name;
	
	public CallableRunner(String name) {
		
		this.name = name;
		
	}
	@Override
	public String call() throws Exception {
		
		Thread.sleep(2000);
		return "hello" + name;
	}
	
	
}
public class CallableTask {

	public static void main(String[] args) throws InterruptedException, ExecutionException {
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		Future<String> welcome = executorService.submit(new CallableRunner(" Nishanth"));
		
		System.out.println("new CallableRunner(\" Nishanth\") is executed ");
		
		String welcomeMsg =welcome.get();
		System.out.println(welcomeMsg);
		
		System.out.println("Execution ompleted ");
	}

}
