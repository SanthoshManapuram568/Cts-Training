 package com.cts.example.threads;

class AnonymousThread{
	Thread thread;
	 AnonymousThread() {
	this.thread=new Thread(new Runnable() {
		
		@Override
		public void run() {
			// TODO Auto-generated method stub
			
		}
	});
	 }
	}

class MThreadPro{
	class ThreadSupoort extends Thread{
		public void run() {
			
		}
	}
}
class MThread111 implements Runnable{
	Thread thread;
	MThread111(){
	this.thread=new Thread(this);
	
}
	public void run() {
		
	}
}
public class MyAppPro {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
MThread111 m = new MThread111();
m.thread.start();
MThreadPro mpro = new MThreadPro();
MThreadPro.ThreadSupoort mpro1 = mpro.new ThreadSupoort();
AnonymousThread at = new AnonymousThread();
at.thread.start();
	}

}
