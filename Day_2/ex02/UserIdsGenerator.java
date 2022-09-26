public class UserIdsGenerator {
	
	private static final UserIdsGenerator currentId = new UserIdsGenerator();

	private static int id = 0;

	public static int generateId() {
		return(id++);
	}

	public static UserIdsGenerator getCurentId() {
		return currentId;
	}
}
