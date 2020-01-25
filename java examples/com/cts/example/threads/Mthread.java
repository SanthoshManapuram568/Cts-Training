package com.cts.example.threads;

public class Mthread extends Thread {

	public void run() {
		for(int i=0;i<=1000;i++) {
			System.out.println("Thread"+i);
		}
	}
}
