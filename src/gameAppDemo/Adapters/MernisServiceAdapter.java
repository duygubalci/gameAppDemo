package gameAppDemo.Adapters;

import java.rmi.RemoteException;

import gameAppDemo.Abstract.IPlayerCheckService;
import gameAppDemo.Entities.Player;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements IPlayerCheckService {
	public boolean result;
	@Override
	public boolean chekIfRealPerson(Player player) {
		// TODO Auto-generated method stub
		KPSPublicSoapProxy kpsPublic = new KPSPublicSoapProxy();
		try {
			
			return result = kpsPublic.TCKimlikNoDogrula(Long.parseLong(player.getNationalityId()), player.getFirstName(), player.getLastName(), player.getDateOfBirth());
		} catch (NumberFormatException | RemoteException e) {
			System.out.println("e");
			e.printStackTrace();
		}
	return result;
}
}
