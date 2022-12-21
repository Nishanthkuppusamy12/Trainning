package com.exception.pgm;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

public class MultipleAnyCallableTask {

public static void main(String[] args) throws InterruptedException, ExecutionException {
		
		ExecutorService executorService = Executors.newFixedThreadPool(1);
		
		List<CallableRunner> tasks  = List.of(new CallableRunner(" Nishanth"),(new CallableRunner(" Chandru")),
				(new CallableRunner(" Vichu")));
		
		String results = executorService.invokeAny(tasks);
		System.out.println(results);
		executorService.shutdown();
		}

	}


