package hello.Buyer;

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
    public Greeting TestBuyer(@RequestParam(value="name", defaultValue="World") String name) {
        return new Greeting(12, "testing");
    }
}
		