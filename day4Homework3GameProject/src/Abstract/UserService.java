package Abstract;

import Entities.User;

public interface UserService {
	
	void add(User user) throws Exception;
	void delete(User user);
	void update(User user);

}
