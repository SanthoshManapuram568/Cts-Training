package com.cts.example.threads;

public class MyApp {

	public static void main(String[] args) {
Mthread thread = new Mthread();
		// TODO Auto-generated method stub
thread.start();
for(int i=0;i<=100;i++) {
	System.out.println("Main"+i);
}
//wait until child thread is terminated
try {
	thread.join();
} catch (InterruptedException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
System.out.println("main terminated");
	}

}
