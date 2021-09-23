package Business.Concrate;



import java.rmi.RemoteException;

import Adapters.CustomerCheckService;
import Business.Abstract.AuthService;
import Business.Abstract.CustomerService;
import Business.Abstract.UserService;
import Entities.Customer;

import Entities.User;
import Entities.DTOs.CustomerForRegister;

public class AuthManager implements AuthService {

	CustomerCheckService customerCheckService;
	UserService userService;
	CustomerService customerService;

	public AuthManager(CustomerCheckService customerCheckService, UserService userService,
			CustomerService customerService) {
		this.customerCheckService = customerCheckService;
		this.userService = userService;
		this.customerService = customerService;
	}

	@Override
	public boolean register(CustomerForRegister customerForRegister) throws NumberFormatException, RemoteException {
		Customer customerIdenity = new Customer(customerForRegister.firstName, customerForRegister.lastName,
				customerForRegister.dateOfBirth, customerForRegister.nationalityId);
		if (customerCheckService.checkIfRealPerson(customerIdenity)) {
			User user = new User(customerForRegister.userName, null, customerForRegister.email);
			user.setId(1);
			userService.add(user);
			customerIdenity.setUserId(user.getId());
			customerIdenity.setId(1);
			customerService.add(customerIdenity);
			System.out.println("Hesap basarili sekilde olusturuldu");
			return true;
		} else {
			System.out.println("Girdiginiz kimlik bilgileri hatali!");
			return false;
		}

	}

}
