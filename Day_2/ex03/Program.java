public class Program {
	public static void main(String[] args) {

		User john = new User("John", 1000);
		User mike = new User("Mike", 1000);
		// User misha = new User("Misha", 1000);
		// User sasha = new User("Sasha", 1000);

		john.addTransaction(new Transaction(john, mike, 100));
		john.addTransaction(new Transaction(john, mike, -100));
		john.addTransaction(new Transaction(john, mike, 200));
		john.addTransaction(new Transaction(john, mike, -400));

		showTransactionList(john);
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

	public static void showTransactionList(User user) {
        Transaction[] arr = user.getTransactionsArray();
        for (int i = arr.length - 1; i >= 0; i--)
            showTransaction(arr[i]);
	}

}