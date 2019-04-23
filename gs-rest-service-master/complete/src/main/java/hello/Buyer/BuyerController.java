package hello.Buyer;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import hello.Buyer.BuyerService;

import hello.Greeting;

@RestController
public class BuyerController {
	
//	@Autowired 
//	BuyerService buyerService;
	
//	@GetMapping("/buyers/")
//	public List<Buyer> retriveDetailsForBuyers(@PathVariable String buyers) {
//		//return BuyerService.retriveAllBuyers();
//	}

	@RequestMapping("/testBuyer")
    public List<Buyer> TestBuyer(@RequestParam(value="name", defaultValue="World") String name) {
//		List<Buyer> buyers = new ArrayList<Buyer>();
//		buyers.add(new Buyer(1, "Name1", "Des1"));
//		buyers.add(new Buyer(2, "Name2", "Des2"));
//		buyers.add(new Buyer(3, "Name3", "Des3"));
//		
//        //return new Bu(12, "tesfdsfdfting");
//        return buyers; 
		return BuyerService.retriveAllBuyers();
    }
}
		