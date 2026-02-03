package metier;

import java.util.List;

import web.model.User;
 

public interface UserMetier {
	void saveUser(User user);
	User findById(int id);
	List<User> findAll();
	void delete(int id);
	
} 
