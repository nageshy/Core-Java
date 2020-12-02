package io.javabrains;

public class Greeter {
	
	public void greet(Greeting greeting) {
		greeting.perform();
	}

	public static void main(String[] args) {
		Greeter greeter = new Greeter();
		Greeting helloworldGreeting = new HelloworldGreeting();
		Greeting lamdaGreeting = () -> System.out.println("Hellow world");
		Greeting innerClassGreeting = new Greeting(){
			@Override
			public void perform() {
				System.out.println("Hello world!");
			}
		};
		greeter.greet(helloworldGreeting);
		greeter.greet(lamdaGreeting);
		greeter.greet(innerClassGreeting);
	}

}
