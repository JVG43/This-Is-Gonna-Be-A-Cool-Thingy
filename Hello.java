import java.util.Scanner;

public class Hello {

	public static void main(String[] args) {
		System.out.println("Enter an Integer to return to you:");
		Scanner scanner = new Scanner(System.in);
		System.out.println("You Entered: " + scanner.nextInt());
		scanner.close();
	}

}
