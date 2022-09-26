public class UsersArrayList implements UserList {
	
	private static int arrSize = defArrSize;

	private static int currentArrSize = 0;

	private User[] users = new User[arrSize];

	public void addUser(User user) throws NullPointerException {
		if (currentArrSize == arrSize - 1) {
			arrSize *= factor;
			User[] tmp = new User[arrSize];

			for (int i = 0; i <= currentArrSize; i++) {
				tmp[i] = users[i];
			}
			users = tmp;
		}
		if (user != null) {
			users[currentArrSize] = user;
			currentArrSize++;
		} else {
			throw new NullPointerException();
		}
	}

	public User getUserById(Integer id) throws UserNotFoundException {
		for (int i = 0; i < currentArrSize; i++) {
			if (users[i].getIdentifier().equals(id))
				return (users[i]);
		}
		throw new UserNotFoundException();
	}

	public User getUserByIndex(Integer index) throws UserNotFoundException, ArrayIndexOutOfBoundsException {
		if (index < 0) {
			throw new ArrayIndexOutOfBoundsException();
		} else if (users[index] == null) {
			throw new UserNotFoundException();
		}
		return (users[index]);
	}

	public int getListSize() {
		return currentArrSize;
	}
}

