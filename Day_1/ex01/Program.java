import java.util.Scanner;

public class Program {

	public static void main (String [] args) {
		int i = 2;
		int j = 0;
		int steps = 0;

		Scanner term = new Scanner(System.in);

		int num = term.nextInt();

		term.close();
		if (num <= 1) {
			System.err.println("Illegal Argument");
			System.exit(-1);
		}
		while (i * i <= num && j != 1) {
			if (num % i == 0)
				j = 1;
			steps++;
			i++;
		}
		if (j == 1) {
			System.out.println("false " + steps);
		} else {
			System.out.println("true " + steps);
		}
	}
}