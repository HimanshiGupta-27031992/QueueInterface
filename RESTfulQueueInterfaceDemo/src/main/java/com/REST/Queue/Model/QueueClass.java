package com.REST.Queue.Model;


public class QueueClass {
	
	private int arr[];          
    private int element; 
    private int size;
  
    
    public QueueClass(){
    	
    }
    
    // Constructor to initialize queue
    public QueueClass(int size)
    {
        arr = new int[size];
       
    }

    public void setSize(int size) {
    	this.size=size;
    }
    public int[] getSize() {
    	return arr;
    }
    public void setElement(int element) {
    	this.element=element;
    }
    public int getElement() {
    	return element;
    }
}
