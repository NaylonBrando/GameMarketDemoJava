package Adapters;

import java.rmi.RemoteException;

import Entities.Customer;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {

	// KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();

	KPSPublicSoap kpsPublic;

	public MernisServiceAdapter(KPSPublicSoap kpsPublic) {
		this.kpsPublic = kpsPublic;
	}

	@Override
	public boolean checkIfRealPerson(Customer customer) throws NumberFormatException, RemoteException {
		boolean result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(customer.getNationalityId()),
				customer.getFirstName().toUpperCase(), customer.getLastName().toUpperCase(), customer.getDateOfBirth());
		if (result == true) {
			System.out.println("Kimlik bilgileri do�ru");
			return true;

		} else {
			System.out.println("Kimlik bilgileri yanl��!");
			return false;
		}
	}

}
