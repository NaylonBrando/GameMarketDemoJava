package Business.Concrate;

import Business.Abstract.UserService;
import Entities.User;

public class UserManager implements UserService {

	@Override
	public void add(User campaign) {
		System.out.println("Kullanýcý olusturuldu");
	}

	@Override
	public void delete(User campaign) {
		// TODO Auto-generated method stub
	}

	@Override
	public void update(User campaign) {
		// TODO Auto-generated method stub
	}

	@Override
	public User[] getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public User getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
