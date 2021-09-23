package Business.Concrate;

import Business.Abstract.CustomerService;
import Entities.Customer;

public class CustomerManager implements CustomerService{

	@Override
	public void add(Customer customer) {
		System.out.println("Müsteri olusturuldu");
		
	}

	@Override
	public void delete(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void update(Customer customer) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Customer[] getAll() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Customer getById(int id) {
		// TODO Auto-generated method stub
		return null;
	}

}
