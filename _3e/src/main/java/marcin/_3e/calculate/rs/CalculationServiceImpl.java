package marcin._3e.calculate.rs;

import marcin._3e.calculate.Calculation;

public class CalculationServiceImpl implements CalculationService {

	@Override
	public Calculation add(double val1, double val2) {
		Calculation calc = new Calculation();
		calc.add(val1, val2);

		return calc;

	}

	@Override
	public Calculation div(double val1, double val2) {
		Calculation calc = new Calculation();
		calc.div(val1, val2);

		return calc;
	}

}
