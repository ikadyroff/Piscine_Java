import java.util.Scanner;

public class Program {

	public static boolean is_sum_prime(int sum) {
		int i = 2;
		int j = 0;

		if (sum <= 1)
			return(false);
		while (i * i <= sum && j != 1) {
			if (sum % i == 0) {
				j = 1;
			}
			i++;
		}
		if (j == 1) {
			return(false);
		} else {
			return(true);
		}
	}

	public static int totalize(int num) {
		int sum = 0;
		while (num != 0) {
			sum += num % 10;
			num /= 10;
		}
		return (sum);
	}

	public static void main(String[] args) {
		int number = 0;
		int requests = 0;
		Scanner term = new Scanner(System.in);

		while (true) {
			number = term.nextInt();
			if (number == 42) {
				term.close();
				System.out.println("Count of coffee-request - " + requests);
				break;
			}
			int sum = totalize(number);
			boolean prime = is_sum_prime(sum);
			if (prime == true) {
				requests++;
			}
		}
	}
}