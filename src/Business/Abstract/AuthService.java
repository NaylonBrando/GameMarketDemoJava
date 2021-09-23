package Business.Abstract;

import java.rmi.RemoteException;

import Entities.DTOs.CustomerForRegister;

public interface AuthService {
	
	boolean register(CustomerForRegister customerForRegister) throws NumberFormatException, RemoteException;

}
