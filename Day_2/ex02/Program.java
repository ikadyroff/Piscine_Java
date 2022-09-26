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

		UsersArrayList list = new UsersArrayList();

		list.addUser(john);
		list.addUser(mike);
		list.addUser(misha);

		list.addUser(new User("User_1", 1));
		list.addUser(new User("User_2", 1));
		list.addUser(new User("User_3", 1));
		list.addUser(new User("User_4", 1));
		list.addUser(new User("User_5", 1));
		list.addUser(new User("User_6", 1));
		list.addUser(new User("User_7", 1));
		list.addUser(new User("User_8", 1));
		list.addUser(new User("User_9", 1));
		list.addUser(new User("User_10", 1));

		showProfile(list.getUserById(1));
		showProfile(list.getUserById(4));
		showProfile(list.getUserById(6));
		showProfile(list.getUserByIndex(1));
		showProfile(list.getUserByIndex(4));
		showProfile(list.getUserByIndex(6));
		showProfile(list.getUserById(10));
		showProfile(list.getUserById(41));

	}



	public static void showProfile(User user) {
		System.out.println("\n" + "ID: " + user.getIdentifier() + ";\n"
		+ "Name: " + user.getName() + ";\n" + "Balance: " + user.getBalance() + ";");
	}
}
