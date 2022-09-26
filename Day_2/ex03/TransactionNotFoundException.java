public class TransactionNotFoundException extends RuntimeException {
	
	public String toTString() {
		return("Transaction not found!");
	}
}
