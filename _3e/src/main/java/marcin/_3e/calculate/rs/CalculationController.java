package marcin._3e.calculate.rs;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import marcin._3e.calculate.Calculation;

@RequestMapping("/calculate")
@RestController
public class CalculationController {

	@Autowired
	CalculationService calculationService;

	public CalculationController(CalculationService calculationService) {
		this.calculationService = calculationService;
	}

	@PostMapping("/add/{val1}/{val2}")
	public Calculation add(@PathVariable("val1") double val1, @PathVariable("val2") double val2) {
		return this.calculationService.add(val1, val2);
	}

	@GetMapping("/div/{val1}/{val2}")
	public Calculation div(@PathVariable("val1") double val1, @PathVariable("val2") double val2) {
		return this.calculationService.div(val1, val2);
	}
}
