public class Program {
	
    public static void main(String[] args) {
		int number = 123456;

		int sum = number % 10;

		number /= 10;
		sum += number % 10;
		number /= 10;
		sum += number % 10;
		number /= 10;
		sum += number % 10;
		number /= 10;
		sum += number % 10;
		number /= 10;
		sum += number % 10;
        System.out.println(sum);
    }
}