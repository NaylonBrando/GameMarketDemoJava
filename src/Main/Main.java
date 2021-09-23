package Main;

import java.rmi.RemoteException;

import Adapters.MernisServiceAdapter;
import Business.Concrate.AuthManager;
import Business.Concrate.CustomerManager;
import Business.Concrate.UserManager;
import Entities.DTOs.CustomerForRegister;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Main {

	public static void main(String[] args) throws NumberFormatException, RemoteException {
		
		AuthManager authManager = new AuthManager(
				new MernisServiceAdapter(new KPSPublicSoapProxy()), 
				new UserManager(),
				new CustomerManager()
				);
		
		CustomerForRegister registerCustomer = new CustomerForRegister(
				"naylonbrando",
				"12345",
				"yaralikalp4021@hotmail.com",
				"Ethan Rohat",
				"Orange",
				1997,
				"666"
				);
		
		authManager.register(registerCustomer);
		
	}

}
