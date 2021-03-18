package Exercise7;

public class Calculatorweight {

	private double Mweight;
	
	public double getWeight() {
		return Mweight;
	}
	
	public void setWeight(double Mweight) {
		this.Mweight=(Mweight/9.81)*3.711;
	}
}
