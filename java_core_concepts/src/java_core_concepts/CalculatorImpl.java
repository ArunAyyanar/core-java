package java_core_concepts;

public class CalculatorImpl implements Calculator {

	/*@Override
	public double add(double n1, double n2) {
		return n1+n2;
	}

	@Override
	public double add(double n1, double n2, double n3) {
		return n1+n2+n3;
	}
*/
	@Override
	public double add(double... n) {
		double sum=0;
		for(double n1: n) {
			sum+=n1;
		}
		return sum;
	}

}
