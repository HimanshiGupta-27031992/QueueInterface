package com.REST.Queue.Controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.REST.Queue.Model.QueueClass;


@Controller
public class QueueController {
	

	private int arr[];          // array to store queue elements
    private int front;          // front points to front element in the queue
    private int rear;           // rear points to last element in the queue
    private int capacity;       // maximum capacity of the queue
    private int count;
	/**
	 * Simply selects the home view to render by returning its name.
	 */
	@RequestMapping(value = "/create", method = RequestMethod.POST)
	public ModelAndView createQueue(int size) {
		ModelAndView mv = new ModelAndView();
		mv.setViewName("EnterDetails.jsp"); 
        mv.addObject("result", 
                     "GeeksForGeeks Welcomes "
                         + "you to Spring!");
		QueueClass queueClass=new QueueClass(size);
		queueClass.setSize(size);

		return mv;
	}

	@RequestMapping(value = "/add", method = RequestMethod.POST)
	public void enQueue(int item) {
		
		 if (isFull())
	        {
	            System.out.println("OverFlow\nProgram Terminated");
	            System.exit(1);
	        }
	 
	        System.out.println("Inserting " + item);
	 
	        rear = (rear + 1) % capacity;
	        arr[rear] = item;
	        count++;
	}
	@RequestMapping(value = "/delete", method = RequestMethod.DELETE)
	public void deQueue() {
		
		if (isEmpty())
        {
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }
 
        System.out.println("Removing " + arr[front]);
 
        front = (front + 1) % capacity;
        count--;
	}
	@RequestMapping(value = "/peek", method = RequestMethod.GET)
	public int peek() {
		
		if (isEmpty()) 
        {
            System.out.println("UnderFlow\nProgram Terminated");
            System.exit(1);
        }
        return arr[front];
	}
	// Utility function to return the size of the queue
    public int size()
    {
        return count;
    }
 
    // Utility function to check if the queue is empty or not
    public Boolean isEmpty()
    {
        return (size() == 0);
    }
 
    // Utility function to check if the queue is full or not
    public Boolean isFull()
    {
        return (size() == capacity);
    }
}
