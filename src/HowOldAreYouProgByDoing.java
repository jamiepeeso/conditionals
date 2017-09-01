import java.util.Scanner;

public class HowOldAreYouProgByDoing {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);

		System.out.println("Hello, what is your name?");
		String name = input.nextLine();

		System.out.println("ok " + name + " how old are you?");
		int age = input.nextInt();
		
		if (age < 16) {
			System.out.println("I am sorry, no you can not borrow my car " + name + ". You are not even old enough to drive yet!");
		}
		if (age >= 16) {
			System.out.println("You can drive " + name + ".");
		}
		if (age < 18) {
			System.out.println("I am sorry but you are not old enough to vote.");
		}
		if (age >= 18) {
			System.out.println("You better be registerd to vote! " + name
					+ " you are old enought to take part in the Democratic process, Congratulations!");
		}
		if (age >= 25) {
			System.out.println("You, my wise friend can do whatever you want that is legal.");
		}
	}

}
