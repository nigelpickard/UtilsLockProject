package com.npickard.utilslock;

public class Adder implements Runnable {
	private Counter counter;
	private int maxAdd;
	private int sleepInMilliSecs;
	private String name;
	private int step;
	private volatile boolean isFinished = false;
	
	public Adder(String name, Counter counter, int maxAdd, int sleepInMilliSecs, int step){
		this.name = name;
		this.counter = counter;
		this.maxAdd = maxAdd;
		this.sleepInMilliSecs = sleepInMilliSecs;
		this.step = step;
	}
	
	@Override
	public void run() {
		isFinished = false;
		for (int count=0; count<maxAdd; count++){
			counter.addCount(step);
			System.out.println(name + " has added to counter.");
		}
		System.out.println("the adding has finished!");
		isFinished = true;
	}
	
	public boolean isFinished(){
		return isFinished;
	}
}
