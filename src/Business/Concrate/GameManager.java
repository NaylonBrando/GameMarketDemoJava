package Business.Concrate;

import Business.Abstract.GameService;
import Entities.Game;

public class GameManager implements GameService {

	@Override
	public void add(Game game) {
		System.out.println("Oyun eklendi!");
		
	}

	@Override
	public void delete(Game game) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Game game) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Game[] getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Game getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
