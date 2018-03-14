package main;
import java.util.concurrent.Semaphore;

import model.Consumer;
import model.ElementOperation;
import model.Producer;

public class Application {

	public Thread producerThread;
	public Thread consumerThread;
	private final int MAXSIZE = 5;

	public static void main(String[] args) throws InterruptedException {
		
		new Application().start();
	}

	private void start() throws InterruptedException {

		manageThreads();
	}

	public void manageThreads() throws InterruptedException {

		initThreads();
		startThreads();
		joinThreads();
	}

	public void initThreads() {

		ElementOperation elementOperation = new ElementOperation(MAXSIZE);
		
		Producer producedElement = new Producer(elementOperation);
		producerThread = new Thread(producedElement);

		Consumer consumedElement = new Consumer(elementOperation);
		consumerThread = new Thread(consumedElement);
	}

	private void joinThreads() throws InterruptedException {

		producerThread.join();
		consumerThread.join();
	}

	private void startThreads() {

		producerThread.start();
		consumerThread.start();
	}

}
