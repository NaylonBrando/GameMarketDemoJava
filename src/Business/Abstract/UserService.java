package Business.Abstract;

import Entities.User;

public interface UserService {
	void add(User campaign);
	void delete(User campaign);
	void update(User campaign);
	User[] getAll();
	User getById(int id);

}
