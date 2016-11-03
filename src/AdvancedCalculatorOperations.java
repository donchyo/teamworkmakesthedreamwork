
public class AdvancedCalculatorOperations implements CalculatorBasicOperationsInterface {
	
	public double pow(double var1, double var2){
		return Math.pow(var1, var2);
	}
	public double sqrt(double var1){
		return Math.sqrt(var1);
	}
	public double square (double var1){
		return var1*var1;
	}
	public double cube (double var1){
		return var1*var1*var1;
	}
	public double log (double var1){
		return Math.log(var1);
	}
	public double absolute (double var1){
		return Math.abs(var1);
	}
	public double add(double var1, double var2) {
		return var1+var2;
	}
	public double subtract(double var1, double var2) {
		return var1-var2;
	}
	public double multiply(double var1, double var2) {
		return var1*var2;
	}
	public double division(double var1, double var2) {
		return var1/var2;
		
	}
	
}

