public class User {

	private Integer identifier;

	private String name;
	
	private Integer balance;

	int id = UserIdsGenerator.getCurentId().generateId();

	public User(String name, Integer balance) {

		this.identifier = id;
		this.name = name;
		this.balance = balance;
	}

	public void setIdentifier(Integer identifier) {
		this.identifier = identifier;
	}

	public Integer getIdentifier() {
		return identifier;
	}

	public void setName(String name) {
		if (name.length() > 0) {
			this.name = name;
		} else {
			this.name = "";
		}
	}

	public String getName() {
		return name;
	}

	public void setBalance(Integer balance) {
		if (balance >= 0) {
			this.balance = balance;
		} else {
			System.err.println("Invalid balance");
			this.balance = 0;
		}
	}

	public Integer getBalance() {
		return balance;
	}
}
