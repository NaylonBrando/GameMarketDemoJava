package Business.Abstract;

import Entities.Game;

public interface GameService {
	void add(Game game);
	void delete(Game game);
	void update(Game game);
	Game[] getAll();
	Game getById(int id);
}
