public class Program {
	public static void main(String[] args) {

		User john = new User("John", 1000);
		User mike = new User("Mike", 1000);

		showProfile(john);
		showProfile(mike);

		Transaction act1 = new Transaction(john, mike, 500);

		showTransaction(act1);

		showProfile(john);
		showProfile(mike);
	}

	public static void showTransaction(Transaction act) {
		if (act.getAmount() < 0) {
			System.out.println("\n" + act.getRecipient().getName() + " -> " + act.getSender().getName() + ", "
			+ act.getAmount() + ", " + "OUTCOME" + " transaction ID: " + act.getIdentifier());
			System.out.println("\n" + act.getSender().getName() + " -> " + act.getRecipient().getName() + ", "
			+ "+" + (act.getAmount() * -1) + ", " + "INTCOME" + " transaction ID: " + act.getIdentifier());

		} else {
			System.out.println("\n" + act.getSender().getName() + " -> " + act.getRecipient().getName() + ", "
			+ "-" +  act.getAmount() + ", " + "OUTCOME" + " transaction ID: " + act.getIdentifier());
			System.out.println("\n" + act.getRecipient().getName() + " -> " + act.getSender().getName() + ", "
			+ "+" +  act.getAmount() + ", " + "INCOME" + " transaction ID: " + act.getIdentifier());
		}
	}

	public static void showProfile(User user) {
		System.out.println("\n" + "ID: " + user.getIdentifier() + ";\n"
		+ "Name: " + user.getName() + ";\n" + "Balance: " + user.getBalance() + ";");
	}

}