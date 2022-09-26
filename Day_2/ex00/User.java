public class User {
	
	private static Integer hardId = 0;

	private Integer hardIdentifier;

	private String hardName;
	
	private Integer hardBalance;


	public User(String name, Integer balance) {

		hardId++;
		hardIdentifier = hardId;
		hardName = name;
		hardBalance = balance;
	}

	public void setIdentifier(Integer identifier) {
		hardIdentifier = identifier;
	}

	public Integer getIdentifier() {
		return hardIdentifier;
	}

	public void setName(String name) {
		if (name.length() > 0) {
			hardName = name;
		} else {
			hardName = "";
		}
	}

	public String getName() {
		return hardName;
	}

	public void setBalance(Integer balance) {
		if (balance >= 0) {
			hardBalance = balance;
		} else {
			System.err.println("Invalid balance");
			hardBalance = 0;
		}
	}

	public Integer getBalance() {
		return hardBalance;
	}
}
