package hello.Buyer;

public class Buyer {
	 	private final int buyer_id;
	    private final String buyer_name;
	    private final String buyer_discription;

	    public Buyer(int buyer_id, String buyer_name, String buyer_description) {
	        this.buyer_id = buyer_id;
	        this.buyer_name = buyer_name;
	        this.buyer_discription = buyer_description;
	    }

	    public long get_buyer_id() {
	        return buyer_id;
	    }

	    public String get_buyer_name() {
	        return buyer_name;
	    }
	    
	    public String getBuyer_discription() {
			return buyer_discription;
		}

}
