package com.cts.example.threads;



	class Box{
		private int count;
		boolean produced;
		Box(){
			this.count=0;
			this.produced=false;
		}
		synchronized void put() {
			if(this.produced) {
				try {
					wait(500);
				} catch (InterruptedException e) {
				
				}
			}
			this.count++;
			System.out.println("produced"+this.count);
			this.produced=true;
			notify();
		}
		synchronized void get() {
			if(this.produced) {
				try {
					wait();
				} catch (InterruptedException e) {
					
				}
			}
			this.count--;
			System.out.println("Consumed"+this.count);
			this.produced=false;
			notify();
		}
	}
	class Producer extends Thread{
		Box box ;
		volatile boolean running;
		Producer(Box box){
			this.box=box;
			this.running=false;
		}
	
	void startThread() {
		this.running =true;
	}
	void terminateThread() {
		this.running=false;
	}
	public void run() {
		while(this.running) {
			try {
				Thread.sleep(80);
			} catch (InterruptedException e) {
							}
			this.box.put();
		}
	}
	}
	class Consumer extends Thread{
		Box box ;
		volatile boolean running;
		Consumer(Box box){
			this.box=box;
			this.running=false;
		}
	
	
	void startThread() {
		this.running =true;
	}
	void terminateThread() {
		this.running=false;
	}
	public void run() {
		while(this.running) {
			try {
				Thread.sleep(80);
			} catch (InterruptedException e) {
							}
			this.box.get();
			try {
				Thread.sleep(120);
			} catch (InterruptedException e) {
				System.out.println("error");
			}
		}
	}
	}
	public class ThreadComunication {
	public static void main(String[] args) {
	Box box = new Box();
	Producer producer = new Producer(box);
	Consumer consumer = new Consumer(box);
	
	producer.startThread();
	consumer.startThread();
	
	try {
		Thread.sleep(1000);
	} catch (InterruptedException e) {
		
	}
	
	// terminate the thread
	producer.terminateThread();
	consumer.terminateThread();
	}
}
