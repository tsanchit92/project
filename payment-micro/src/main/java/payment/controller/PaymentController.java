package payment.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import payment.model.PaytmDetailPojo;

@RestController
public class PaymentController {

	@Autowired
	private PaytmDetailPojo paytmDetailPojo;
	@Autowired
	private Environment env;
	
	@GetMapping("/")
	public String home() {
		return "home";
	}
}
