package Business.Abstract;

import Entities.Customer;

public interface CustomerService {
	void add(Customer customer);
	void delete(Customer customer);
	void update(Customer customer);
	Customer[] getAll();
	Customer getById(int id);

}
