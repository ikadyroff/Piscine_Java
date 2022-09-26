public class Program {
	public static void main(String[] args) {

		User john = new User("John", 1000);
		User mike = new User("Mike", 1000);
		User misha = new User("Misha", 1000);
		User sasha = new User("Sasha", 1000);


		showProfile(john);
		showProfile(mike);
		showProfile(misha);
		showProfile(sasha);
	}

	public static void showProfile(User user) {
		System.out.println("\n" + "ID: " + user.getIdentifier() + ";\n"
		+ "Name: " + user.getName() + ";\n" + "Balance: " + user.getBalance() + ";");
	}
}
