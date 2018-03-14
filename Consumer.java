package model;

public class Consumer extends Thread {

	public ElementOperation elementOperation;

	public Consumer(ElementOperation elementOperation) {
		super();
		this.elementOperation = elementOperation;
	}

	@Override
	public void run() {

		while (true) {
			
			try {
				
				System.out.println("1");
			} catch (InterruptedException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}

			synchronized (elementOperation) {
				
			}
		
			
			try {
				sleep(6000);
			} catch (InterruptedException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}

			System.out.print("Element removed --- ");
			
			System.out.println(" removed");
			

		}
	}
}
