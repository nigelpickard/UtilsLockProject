/**
 * 
 */
package com.npickard.utilslock;

import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @author nigel
 *
 */
public class StartApp {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Counter counter = new Counter();
		Adder adder1 = new Adder("Adder 1", counter, 1000, 1,1);
		Adder adder2 = new Adder("Adder 2", counter, 1000, 1,2);
		Adder adder3 = new Adder("Adder 3", counter, 1000, 1,3);
		Adder adder4 = new Adder("Adder 4", counter, 1000, 1,4);
		Adder adder5 = new Adder("Adder 5", counter, 1000, 1,5);
		Adder adder6 = new Adder("Adder 1", counter, 1000, 1,6);
		Adder adder7 = new Adder("Adder 2", counter, 1000, 1,7);
		Adder adder8 = new Adder("Adder 3", counter, 1000, 1,8);
		Adder adder9 = new Adder("Adder 4", counter, 1000, 1,9);
		Adder adder10 = new Adder("Adder 5", counter, 1000, 1,10);

		
		//use executor
		Executor executor = Executors.newCachedThreadPool();
		executor.execute(adder1);
		executor.execute(adder2);
		executor.execute(adder3);
		executor.execute(adder4);
		executor.execute(adder5);
		executor.execute(adder6);
		executor.execute(adder7);
		executor.execute(adder8);
		executor.execute(adder9);
		executor.execute(adder10);
		
		while (!adder1.isFinished() || 
				!adder2.isFinished() ||
				!adder3.isFinished() ||
				!adder4.isFinished() ||
				!adder5.isFinished() ||
				!adder6.isFinished() ||
				!adder7.isFinished() ||
				!adder8.isFinished() ||
				!adder9.isFinished() ||
				!adder10.isFinished()
				){
		}
		System.out.println("Adder 1 status: "+ adder1.isFinished());
		System.out.println("Adder 2 status: "+ adder2.isFinished());
		System.out.println("Adder 3 status: "+ adder3.isFinished());
		System.out.println("Adder 4 status: "+ adder4.isFinished());
		System.out.println("Adder 5 status: "+ adder5.isFinished());
		System.out.println("Adder 6 status: "+ adder6.isFinished());
		System.out.println("Adder 7 status: "+ adder7.isFinished());
		System.out.println("Adder 8 status: "+ adder8.isFinished());
		System.out.println("Adder 9 status: "+ adder9.isFinished());
		System.out.println("Adder 10 status: "+ adder10.isFinished());
		
		
		System.out.println("Adders are Finished and count is " + counter.getCount() +"!");
		System.exit(0);
	}

}
