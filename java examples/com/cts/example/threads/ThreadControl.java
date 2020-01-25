package com.cts.example.threads;

class MThread1 extends Thread{
	String name;
	volatile byte running;
	MThread1 (String name){
		this.name=name;
		this.running=0;
	}
	void startThread() {
		this.running=1;
		this.start();
	}
	void suspendThread() {
		this.running=2;
		
	}
	void resumeThread() {
		this.running=1;
		this.start();
	}
	void terminateThread() {
		this.running=0;
		  this.start();
	}
	public void run() {
		int n=1;
		while(this.running!=0) {
			while(this.running==2);
			System.out.println(this.name+""+n++);
			try {
				Thread.sleep(80);
			} catch (InterruptedException e) {
				
			}
		}
	}
}

public class ThreadControl {
	public static void main(String []args) {
MThread1 thread1 = new MThread1("Thread1");
MThread1 thread2 = new MThread1("Thread2");

for(int i=0;i<-35;i++) {
	System.out.println("main :"+i);
	
	if(i==5) {
		System.out.println("1st thread started");
		thread1.startThread();
		}
	if(i==10) {
		System.out.println("2nd thread started");
		thread2.startThread();
		}
	if(i==15) {
		System.out.println("1st and 2nd thread started");
		thread1.suspendThread();
		thread2.suspendThread();
		}
	if(i==20) {
		System.out.println("2nd thread resumed");
		thread2.resumeThread();
		}
	if(i==25) {
		System.out.println("1st thread resumed");
		thread1.resumeThread();
		}
	if(i==30) {
		System.out.println("1st and 2nd thread suspended");
		thread1.terminateThread();
		thread2.terminateThread();
		}
}

}

}