package marcin._3e.calculate.rs;

import org.junit.Assert;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class CalculationServiceTest {

	private CalculationService service;

	@BeforeEach
	public void setUp() throws Exception {
		this.service = new CalculationServiceImpl();
	}

	@Test
	public void addShouldAddTheValuesCorrectly() throws Exception {
		Double result = Double.valueOf(this.service.add(1d, 2d).getValue());
		Assert.assertEquals("Expected the result to be equal", Double.valueOf(3d), result);
	}

	@Test
	public void addShouldNotFailIfTheValuesAreZero() throws Exception {
		Double result = Double.valueOf(this.service.add(0d, 0d).getValue());
		Assert.assertEquals("Expected the result to be equal", Double.valueOf(0d), result);
	}

	@Test
	public void addShouldReturnTheCorrectResultForNegavitveValues() throws Exception {
		Double result = Double.valueOf(this.service.add(-5d, -5d).getValue());
		Assert.assertEquals("Expected the result to be equal", Double.valueOf(-10d), result);
	}

	@Test
	public void divShouldDivideTheValuesCorrectly() throws Exception {
		Double result = Double.valueOf(this.service.div(5d, 1d).getValue());
		Assert.assertEquals("Expected the result to be equal", Double.valueOf(5d), result);
		result = Double.valueOf(this.service.div(5d, 2d).getValue());
		Assert.assertEquals("Expected the result to be equal", Double.valueOf(2.5d), result);
	}

	@Test
	public void divShouldReturnZeroIfAtLeastOneOfTheArgumentsIsZero() throws Exception {
		Double result = Double.valueOf(this.service.div(5d, 0d).getValue());
		Assert.assertEquals("Expected the result to be equal", Double.valueOf(0d), result);
		result = Double.valueOf(this.service.div(0d, 1d).getValue());
		Assert.assertEquals("Expected the result to be equal", Double.valueOf(0d), result);
		result = Double.valueOf(this.service.div(0d, 0d).getValue());
		Assert.assertEquals("Expected the result to be equal", Double.valueOf(0d), result);
	}
}
