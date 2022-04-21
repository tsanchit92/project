package farmer.controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import farmer.dto.CropDto;
import farmer.dto.FarmerDto;
import farmer.dto.RatingDto;
import farmer.model.Address;
import farmer.model.BankAccountDeatil;
import farmer.model.Crop;
import farmer.model.FarmerModel;
import farmer.service.FarmerService;

@RestController
@RequestMapping("/farmer")
public class FarmerController {

	@Autowired
	public FarmerService farmerService;
	
	@GetMapping("/started")
	public String start()
	{
		return "started";
	}

	@GetMapping("/getCrops")
	public List<Crop> getFarmerCrops() {
		return farmerService.getFarmerCrops();
	}

	@DeleteMapping("/deletefarmer")
	public void deleteFarmer(@RequestBody FarmerDto farmerDto) {
		farmerService.removeFamer(farmerDto);
	}

	@PostMapping("/register")
	public boolean register(@RequestBody FarmerDto farmerModel) {
		return farmerService.register(farmerModel);
	}

	@PostMapping("/addCrop")
	public boolean addCrop(@RequestBody CropDto crop) {
		return farmerService.addCrop(crop);
	}

	@DeleteMapping("/removeCrop")
	public Boolean removeCrop(@RequestBody CropDto cropdto) {
		return farmerService.removeCrop(cropdto);
	}

	@PostMapping("/rating")
	public boolean rateFarmer(@RequestBody RatingDto dto) {
	 return	farmerService.rateFarmer(dto);
	}
	
	@PutMapping("/editProfile")
	public boolean editProfile(FarmerDto dto)
	{
		return farmerService.editProfile(dto);
	}
	
	@GetMapping("/getAddress/{id}")
	public Optional<Address> getAddress(@PathVariable String id)
	{
		return farmerService.getAddress(id);
	}

	@GetMapping("/getbankDetails/{id}")
	public Optional<BankAccountDeatil> getbaknDetails(@PathVariable String id)
	{
		return farmerService.getbankDetails(id);
	}
}
