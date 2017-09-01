
public class ElseAndIfProgByDoing {
	public static void main(String[] args) {
		int people = 30;
		int cars = 40;
		int buses = 15;

		if (cars > people) {
			System.out.println("We should take the cars.");
		} else if (cars < people) {
			System.out.println("We should avoid taking the cars.");
		} else {
			System.out.println("We can't decide.");
		}
		if (buses > cars) {
			System.out.println("Thas is too many buses.");
		} else if (buses < cars) {
			System.out.println("Maybe we could take the buses.");
		} else {
			System.out.println("We still can't decide.");
		}
		if (people > buses) {
			System.out.println("All right, let's just take the buses.");
		} else {
			System.out.println("Fine, let's stay home then!");
		}
	}
}
// 1. The else, if, and else if statements are setting up our conditional
// responses.
// So if depending on the value of the boolean in the if/else/else if () the
// bellow method might run or might not.
// 2. When I removed one of the else from the else if statement the else
// statement "We can't decide." printed along with the "We should take the
// cars."
