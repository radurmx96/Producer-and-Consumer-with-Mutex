package model;

import java.util.concurrent.Semaphore;

public class Producer extends Thread {

	public ElementOperation stack;

	public Producer(ElementOperation stack1) {
		this.stack = stack1;
	}

	@Override
	public void run() {
		
		try {
			sleep(3500);
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		while (true) {

			try {

			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			synchronized (stack) {

		
			
			}

			System.out.print("Element added --- ");
			
			System.out.println(" added");
			// stack.push();

		}
	}

}