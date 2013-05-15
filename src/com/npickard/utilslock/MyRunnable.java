package com.npickard.utilslock;

public class MyRunnable implements Runnable {

	@Override
	public void run() {
		for (int i=0; i<5;i++){
			System.out.println("count is " + i);
		}

	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
