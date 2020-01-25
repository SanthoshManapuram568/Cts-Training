package com.cts.example.threads;

class Resource1{
	private int arr[];

	//synchronized public void changeArray() {
	
	 public void changeArray() {
	
	 }
	 
	 // syncronized public void manageArray(String name,int size, int initValue){
	 
	 public void manageArray(String name,int size, int initValue) {
		this.arr=new int[size];
		for(int i=0;i<size;i++)
			this.arr[i]=initValue + i;
		for(int i=0;i<this.arr.length;i++) {
			System.out.println("name         "+name+""+this.arr[i]);
		}
	}
}
class UseArrayThread extends Thread{
	
	Resource1 resourcex;
	String name;
	int size;
	int initValue;
	
	UseArrayThread(Resource1 resource,String name ,int size, int initValue) {
		// TODO Auto-generated constructor stub
	this.resourcex=resource;
	this.name=name;
	this.size=size;
	this.initValue=initValue;
	
	}
	
public void run() {
	//acquire lock or resource object
	synchronized (this.resourcex) {
		this.resourcex.manageArray(this.name,this.size,this.initValue);
		//add activites
	}//lock released
	
	//  this.resourcex.manageArray(this.name,this.size,this.initValue);
	}
}
public class Resource {

	public static void main(String[] args) {
	
	Resource1 resource  = new Resource1();
	UseArrayThread thread1 = new UseArrayThread(resource,"thread1        ",10,100);
	UseArrayThread thread2 = new UseArrayThread(resource,"thread2        ",15,500);
	
	thread1.start();
	
	try {
	Thread.sleep(300);
	}
	
	catch(InterruptedException e) {
	}
	
	thread2.start();
	}
}
