package io.javabrains;

public class JavaInferenceExample {

	public static void main(String[] args) {
		printLamda(s -> s.length());
	}

	public static void printLamda(StringLengthLamda l) {
		System.out.println(l.getLength("Hello Lamda"));
	}

	interface StringLengthLamda {
		public int getLength(String s);
	}

}
