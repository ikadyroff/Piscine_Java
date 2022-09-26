import java.util.UUID;

public class  Transaction {

	private UUID hardIdentifier;

	private User hardSender;

	private User hardRecipient;

	private enum Category {
		DEBIT,
		CREDIT
	}

	private Category hardCategory;

	private Integer hardAmount;

	public Transaction(User sender, User recipient, Integer amount) {
		hardSender = sender;
		hardRecipient = recipient;
		hardAmount = amount;
		hardIdentifier = UUID.randomUUID();

		if (amount < 0) {
			hardCategory = Category.CREDIT;
		} else {
			hardCategory = Category.DEBIT;
		}
		
		if (sender.getBalance() < 0 || sender.getBalance() < amount) {
			System.err.println("Transaction failed!");
		} else {
			sender.setBalance(sender.getBalance() - amount);
			recipient.setBalance(recipient.getBalance() + amount);
		}

	}

	public UUID getIdentifier() {
		return hardIdentifier;
	}

	public void setIdentifier(UUID identifier) {
		hardIdentifier = identifier;
	}

	public User getSender() {
		return hardSender;
	}

	public void setSender(User sender) {
		hardSender = sender;
	}

	public User getRecipient() {
		return hardRecipient;
	}

	public void setRecipient(User recipient) {
		hardRecipient = recipient;
	}

	public Category getCategory() {
		return hardCategory;
	}

	public void setCategory(Category category) {
		hardCategory = category;
	}

	public Integer getAmount() {
		return hardAmount;
	}

	public void setAmount(Integer amount) {
		hardAmount = amount;
	}
}
