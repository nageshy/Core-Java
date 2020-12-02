package io.javabrains;

public class RunnableExample {

	public static void main(String[] args) {
		Thread myThread = new Thread(new Runnable() {
			
			@Override
			public void run() {
				System.out.println("printed inside Runnable");
			}
		});
		
		Thread myLamdaThread = new Thread(() -> System.out.println("Printed inside lamda Runnable"));
		
		myThread.start();
		myLamdaThread.start();

	}

}
