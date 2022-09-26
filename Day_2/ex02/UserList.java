public interface UserList {

	int defArrSize = 10;
	float factor = 1.5F;

	void addUser(User user) throws NullPointerException;
	User getUserById(Integer id) throws UserNotFoundException;
	User getUserByIndex(Integer index) throws UserNotFoundException;
	int getListSize();
}