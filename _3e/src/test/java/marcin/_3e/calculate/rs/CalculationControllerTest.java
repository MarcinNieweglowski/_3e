package marcin._3e.calculate.rs;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentMatchers;
import org.mockito.Mockito;

public class CalculationControllerTest {

	private CalculationController controller;

	private CalculationService service;

	@BeforeEach
	public void start() {
		this.service = Mockito.mock(CalculationService.class);
		this.controller = new CalculationController(this.service);
	}

	@Test
	public void addShouldCallCalculationServiceAddMethod() throws Exception {
		this.controller.add(5d, 10d);
		Mockito.verify(this.service, Mockito.times(1)).add(ArgumentMatchers.eq(5d), ArgumentMatchers.eq(10d));
	}

	@Test
	public void divShouldCallCalculationServiceDivMethod() throws Exception {
		this.controller.div(5d, 10d);
		Mockito.verify(this.service, Mockito.times(1)).div(ArgumentMatchers.eq(5d), ArgumentMatchers.eq(10d));
	}
}
