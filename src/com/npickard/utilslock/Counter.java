package com.npickard.utilslock;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class Counter {
	private int count;
	private final Lock lock = new ReentrantLock();
	
	public Counter(){
		count = 0;
	}
	
	public Counter(int startCount){
		count = startCount;
	}
	
	public void addCount(int countAdd){
		try{
			lock.lock();
			count = count + countAdd;
		}finally{
			lock.unlock();
		}
	}
	
	public int getCount(){
		return count;
	}

}
