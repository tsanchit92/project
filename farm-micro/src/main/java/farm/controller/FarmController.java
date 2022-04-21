package farm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.reactive.function.client.WebClient;

import farm.model.Crop;
import farm.model.FarmModel;
import farm.model.FarmerModel;
import farm.service.FarmService;
import farmer.dto.RatingDto;

@RestController
@RequestMapping("/farm")
public class FarmController {
	@Autowired
	private WebClient.Builder webClientBuilder;

	@Autowired
	public FarmService service;

	@GetMapping("/getStarted")
	public String getStr() {
		String response = webClientBuilder.build().get().uri("http://farmer/farmer/started")
				.accept(MediaType.APPLICATION_JSON).retrieve().bodyToMono(String.class).block();

		return response;
	}

	@PostMapping("/register")
	public boolean register(@RequestBody FarmModel farmModel) {
		return service.register(farmModel);
	}

	@GetMapping("/getCrops")
	public List<Crop> getFarmers() {
		return service.getFarmers();
	}

	@DeleteMapping("/removeFarm")
	public void removeFarm(@RequestBody FarmModel farmModel) {
		service.removeDealer(farmModel);
	}

	@PostMapping("/editProfile")
	public boolean editProfile(@RequestBody FarmModel farm) {
		return service.editProfile(farm);
	}

	@PostMapping("/rateFarmer")
	public boolean rateFarmer(@RequestBody RatingDto dto) {
		return service.rateFarmer(dto);
	}

}
