package marcin._3e.calculate;

public class Calculation {

	public double getValue() {
		return value;
	}

	public void setValue(double value) {
		this.value = value;
	}

	private double value;

	public void add(double val1, double val2) {
		this.value = val1 + val2;
	}

	public void div(double val1, double val2) {
		if (val2 == 0) {
			this.value = 0;
			return;
		}

		this.value = val1 / val2;
	}

}
