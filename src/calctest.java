import static org.junit.Assert.*;

import java.util.Random;

import org.junit.Rule;
import org.junit.Test;
//import org.junit.contrib.java.lang.system.ExpectedSystemExit;

public class calctest {
	AdvancedCalculatorOperations ACO = new AdvancedCalculatorOperations();
	CalculatorGUI CGUI = new CalculatorGUI(); 
//	CalculatorBasicOperationsInterface CBOI = new CalculatorBasicOperationsInterface();
	Random rng = new Random();
	double firstRandomNumber = 0.0; //firstRandomNumber
	double secondRandomNumber = 0.0; //secondRandomNumber
	double negativeFirstRandomNumber = 0.0; //negativeFirstRandomNumber
	double negativeSecondRandomNumber = 0.0; //negativeSecondRandomNumber
	double zero = 0.0;
	
	
	//AdvancedCalculatorOperations tests
	@Test
	public void powTest() {
		for(int i = 0; i<50; i++){
			firstRandomNumber = rng.nextDouble() * 10;
			secondRandomNumber = rng.nextDouble() * 10;
			negativeFirstRandomNumber=-rng.nextDouble() * 10;
			negativeSecondRandomNumber=-rng.nextDouble() * 10;
			
			assertEquals((ACO.pow(firstRandomNumber, secondRandomNumber)), Math.pow(firstRandomNumber, secondRandomNumber) , 0);
			assertEquals((ACO.pow(negativeFirstRandomNumber, negativeSecondRandomNumber)), Math.pow(negativeFirstRandomNumber, negativeSecondRandomNumber) , 0);
			assertEquals((ACO.pow(zero, zero)), Math.pow(zero, zero) , 0);
		}
	}
	@Test
	public void sqrtTest() {
		for(int i = 0; i<50; i++){
			firstRandomNumber = rng.nextDouble() * 10;
			//srn = rng.nextDouble() * 10;
			negativeFirstRandomNumber=-rng.nextDouble() * 10;
			//nsrn=-rng.nextDouble() * 10;
			
			assertEquals((ACO.sqrt(firstRandomNumber)), Math.sqrt(firstRandomNumber) , 0);
			assertEquals((ACO.sqrt(negativeFirstRandomNumber)), Math.sqrt(negativeFirstRandomNumber) , 0);
			assertEquals((ACO.sqrt(zero)), Math.sqrt(zero) , 0);

		}
	}
	@Test
	public void squareTest() {
		for(int i = 0; i<50; i++){
			firstRandomNumber = rng.nextDouble() * 10;
			//srn = rng.nextDouble() * 10;
			negativeFirstRandomNumber=-rng.nextDouble() * 10;
			//nsrn=-rng.nextDouble() * 10;
			
			assertEquals((ACO.square(firstRandomNumber)), firstRandomNumber*firstRandomNumber , 0);
			assertEquals((ACO.square(negativeFirstRandomNumber)), negativeFirstRandomNumber*negativeFirstRandomNumber , 0);
			assertEquals((ACO.square(zero)), zero*zero , 0);
		}
	}
	@Test
	public void cubeTest() {
		for(int i = 0; i<50; i++){
			firstRandomNumber = rng.nextDouble() * 10;
			//srn = rng.nextDouble() * 10;
			negativeFirstRandomNumber=-rng.nextDouble() * 10;
			//nsrn=-rng.nextDouble() * 10;
			
			assertEquals((ACO.cube(firstRandomNumber)), firstRandomNumber*firstRandomNumber*firstRandomNumber , 0);
			assertEquals((ACO.cube(negativeFirstRandomNumber)), negativeFirstRandomNumber*negativeFirstRandomNumber*negativeFirstRandomNumber , 0);
			assertEquals((ACO.cube(zero)), zero*zero*zero , 0);
		}
	}
	@Test
	public void logTest() {
		for(int i = 0; i<50; i++){
			firstRandomNumber = rng.nextDouble() * 10;
			//srn = rng.nextDouble() * 10;
			negativeFirstRandomNumber=-rng.nextDouble() * 10;
			//nsrn=-rng.nextDouble() * 10;
			
			assertEquals((ACO.log(firstRandomNumber)), Math.log(firstRandomNumber) , 0);
			assertEquals((ACO.log(negativeFirstRandomNumber)), Math.log(negativeFirstRandomNumber) , 0);
			assertEquals((ACO.log(zero)), Math.log(zero) , 0);
		}
	}
	@Test
	public void absoluteTest() {
		for(int i = 0; i<50; i++){
			firstRandomNumber = rng.nextDouble() * 10;
			//srn = rng.nextDouble() * 10;
			negativeFirstRandomNumber=-rng.nextDouble() * 10;
			//nsrn=-rng.nextDouble() * 10;
			
			assertEquals((ACO.absolute(firstRandomNumber)), Math.abs(firstRandomNumber) , 0);
			assertEquals((ACO.absolute(negativeFirstRandomNumber)), Math.abs(negativeFirstRandomNumber) , 0);
			assertEquals((ACO.absolute(zero)), Math.abs(zero) , 0);
		}
	}
	//AdvancedCalculatorOperations tests ends
	//CalculatorBasicOperationsInterface test
	@Test
	public void additionTest() {
		for(int i = 0; i<50; i++){
			firstRandomNumber = rng.nextDouble() * 10;
			secondRandomNumber = rng.nextDouble() * 10;
			negativeFirstRandomNumber=-rng.nextDouble() * 10;
			negativeSecondRandomNumber=-rng.nextDouble() * 10;
			
			assertEquals((ACO.add(firstRandomNumber, secondRandomNumber)), firstRandomNumber + secondRandomNumber , 0);
			assertEquals((ACO.add(negativeFirstRandomNumber, negativeSecondRandomNumber)), negativeFirstRandomNumber + negativeSecondRandomNumber , 0);
			assertEquals((ACO.add(zero, zero)), zero + zero , 0);
		}
	}
	@Test
	public void subtractionTest() {
		for(int i = 0; i<50; i++){
			firstRandomNumber = rng.nextDouble() * 10;
			secondRandomNumber = rng.nextDouble() * 10;
			negativeFirstRandomNumber=-rng.nextDouble() * 10;
			negativeSecondRandomNumber=-rng.nextDouble() * 10;
			
			assertEquals((ACO.subtract(firstRandomNumber, secondRandomNumber)), firstRandomNumber - secondRandomNumber , 0);
			assertEquals((ACO.subtract(negativeFirstRandomNumber, negativeSecondRandomNumber)), negativeFirstRandomNumber - negativeSecondRandomNumber , 0);
			assertEquals((ACO.subtract(zero, zero)), zero - zero , 0);
		}
	}
	@Test
	public void multiplicationTest() {
		for(int i = 0; i<50; i++){
			firstRandomNumber = rng.nextDouble() * 10;
			secondRandomNumber = rng.nextDouble() * 10;
			negativeFirstRandomNumber=-rng.nextDouble() * 10;
			negativeSecondRandomNumber=-rng.nextDouble() * 10;
			
			assertEquals((ACO.multiply(firstRandomNumber, secondRandomNumber)), firstRandomNumber * secondRandomNumber , 0);
			assertEquals((ACO.multiply(negativeFirstRandomNumber, negativeSecondRandomNumber)), negativeFirstRandomNumber * negativeSecondRandomNumber , 0);
			assertEquals((ACO.multiply(zero, zero)), zero * zero , 0);
		}
	}
	@Test
	public void divisionTest() {
		for(int i = 0; i<50; i++){
			firstRandomNumber = rng.nextDouble() * 10;
			secondRandomNumber = rng.nextDouble() * 10;
			negativeFirstRandomNumber=-rng.nextDouble() * 10;
			negativeSecondRandomNumber=-rng.nextDouble() * 10;
			
			assertEquals((ACO.division(firstRandomNumber, secondRandomNumber)), firstRandomNumber / secondRandomNumber , 0);
			assertEquals((ACO.division(negativeFirstRandomNumber, negativeSecondRandomNumber)), negativeFirstRandomNumber / negativeSecondRandomNumber , 0);
			assertEquals((ACO.division(zero, zero)), zero / zero , 0);
			
		}
	}
	//CalculatorBasicOperationsInterface test ends
	//maintest
	@Test
	public void mainTest() {
		for(int i = 0; i<50; i++){
			Main main = new Main();
			Main.main(null);
		}
	}
	//getters and setters Tests
	@Test
	public void gettersAndSettersTest() {
		for(int i = 0; i<50; i++){
			firstRandomNumber = rng.nextDouble() * 10;
			secondRandomNumber = rng.nextDouble() * 10;
			negativeFirstRandomNumber=-rng.nextDouble() * 10;
			negativeSecondRandomNumber=-rng.nextDouble() * 10;
			
			CGUI.setInput1(firstRandomNumber);
			CGUI.setInput2(secondRandomNumber);
			
			assertEquals(CGUI.getInput1(), firstRandomNumber, 0);
			assertEquals(CGUI.getInput2(), secondRandomNumber, 0);
						
			CGUI.setInput1(negativeFirstRandomNumber);
			CGUI.setInput2(negativeSecondRandomNumber);
			
			assertEquals(CGUI.getInput1(), negativeFirstRandomNumber, 0);
			assertEquals(CGUI.getInput2(), negativeSecondRandomNumber, 0);
			
			CGUI.setInput1(zero);
			CGUI.setInput2(zero);
			
			assertEquals(CGUI.getInput1(), zero, 0);
			assertEquals(CGUI.getInput2(), zero, 0);
			
		}
	}
	//getters and setters Tests ends
	//actionPerformed test
	
	@Test
	public void actionPerformedTest() {
		for(int i = 0; i<5; i++){ //todo
			String firstRandomNumber = String.valueOf(rng.nextDouble() * 10);
			String secondRandomNumber = String.valueOf(rng.nextDouble() * 10);
			
			negativeFirstRandomNumber=-rng.nextDouble() * 10;
			negativeSecondRandomNumber=-rng.nextDouble() * 10;
			
			
			CGUI.input1Window.setText(firstRandomNumber);
			CGUI.input2Window.setText(secondRandomNumber);
			
			CGUI.additionButton.doClick();
			CGUI.subtractionButton.doClick();
			CGUI.multiplicationButton.doClick();
			CGUI.divisionButton.doClick();
			CGUI.powButton.doClick();
			CGUI.sqrtButton.doClick();
			CGUI.squareButton.doClick();
			CGUI.cubeButton.doClick();
			CGUI.logButton.doClick();
			CGUI.absoluteButton.doClick();
			CGUI.cubeButton.doClick();
			CGUI.clearButton.doClick();
		//	CGUI.exitButton.doClick();
			
			CGUI.input1Window.setText("as");
			CGUI.input2Window.setText("as");
			CGUI.cubeButton.doClick();


//			additionButton.addActionListener(this);
//			subtractionButton.addActionListener(this);
//			multiplicationButton.addActionListener(this);
//			divisionButton.addActionListener(this);
//			powButton.addActionListener(this);
//			sqrtButton.addActionListener(this);
//			squareButton.addActionListener(this);
//			cubeButton.addActionListener(this);
//			logButton.addActionListener(this);
//			absoluteButton.addActionListener(this);
//			exitButton.addActionListener(this);
//			clearButton.addActionListener(this);	
	
		}
		
	}

}
