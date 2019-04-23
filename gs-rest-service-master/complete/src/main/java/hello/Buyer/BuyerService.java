package hello.Buyer;
//package hello;
//
import java.util.ArrayList;
import java.util.List;

public class BuyerService {

	private static List<Buyer> buyers = new ArrayList<>();
	
	static {
		
		Buyer vidushan = new Buyer(1, "vidushan", "dfdsfsdfdsfds");
		
		Buyer buddhishan = new Buyer(2,"Buddhishan","adsafdafdafda");
		
		buyers.add(vidushan);
		buyers.add(buddhishan);
	}
	
	public static List<Buyer> retriveAllBuyers(){
		return buyers;
	}
	
	public static Buyer retrieveSpecificBuyer(int buyerId) {
		for (Buyer buyer : buyers) {
			if (buyer.get_buyer_id() == buyerId) {
				return buyer;
			}
		}
		return null;
	} 
}
