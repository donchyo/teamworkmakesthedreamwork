import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Color;
import java.awt.TextField;
import javax.swing.JTextField;

public class CalculatorGUI extends JFrame implements ActionListener{

	public JButton additionButton = new JButton();
	public JButton subtractionButton = new JButton();
	public JButton multiplicationButton = new JButton();
	public JButton divisionButton = new JButton();
	public JButton powButton = new JButton();
	public JButton sqrtButton = new JButton();
	public JButton squareButton = new JButton();
	public JButton cubeButton = new JButton();
	public JButton logButton = new JButton();
	public JButton absoluteButton = new JButton();
	public JButton exitButton = new JButton();
	public JButton clearButton = new JButton();

	public JTextField resultWindow = new JTextField();
	public JTextField input1Window = new JTextField();
	public JTextField input2Window = new JTextField();

	public JLabel input1WindowText = new JLabel();
	public JLabel input2WindowText = new JLabel();
	public JLabel resultWindowText = new JLabel();

	AdvancedCalculatorOperations ACO = new AdvancedCalculatorOperations();

	private double input1 = 0.0;
	private double input2 = 0.0;
	private double result = 0.0;

	public double getInput1() {
		return input1;
	}

	public void setInput1(double input1) {
		this.input1 = input1;
	}

	public double getInput2() {
		return input2;
	}

	public void setInput2(double input2) {
		this.input2 = input2;
	}

	public CalculatorGUI(){
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		createUI();
		addActionListeners();

	}

	private void createButtons(){

		exitButton.setText("Exit");
		exitButton.setBounds(10, 190, 210, 50);
		getContentPane().add(exitButton);

		clearButton.setText("Clear input");
		clearButton.setBounds(755, 25, 210, 23);
		getContentPane().add(clearButton);

		additionButton.setText("+");
		additionButton.setBounds(450, 25, 100, 50);
		getContentPane().add(additionButton);

		subtractionButton.setText("-");
		subtractionButton.setBounds(450, 80, 100, 50);
		getContentPane().add(subtractionButton);

		multiplicationButton.setText("*");
		multiplicationButton.setBounds(450, 135, 100, 50);
		getContentPane().add(multiplicationButton);

		divisionButton.setText("/");
		divisionButton.setBounds(450, 190, 100, 50);
		getContentPane().add(divisionButton);

		powButton.setText("<html><center>X<sup>Y</sup></center></html>"); 
		powButton.setBounds(10, 80, 210, 50);
		getContentPane().add(powButton);

		sqrtButton.setText("<html><center>\u221A x</center></html>"); //todo
		sqrtButton.setBounds(10, 25, 210, 50);
		getContentPane().add(sqrtButton);


		squareButton.setText("<html><center>X<sup>2</sup></center></html>"); 
		squareButton.setBounds(10, 135, 210, 50);
		getContentPane().add(squareButton);

		cubeButton.setText("<html><center>X<sup>3</sup></center></html>");
		cubeButton.setBounds(230, 80, 210, 50);
		getContentPane().add(cubeButton);

		logButton.setText("LOG");
		logButton.setBounds(230, 135, 210, 50);
		getContentPane().add(logButton);

		absoluteButton.setText("Absolute"); 
		absoluteButton.setBounds(230, 25, 210, 50);
		getContentPane().add(absoluteButton);
	}
	public void createLabels(){
		resultWindow.setBackground(Color.WHITE);
		resultWindow.setForeground(Color.BLACK);
		resultWindow.setBounds(755, 179, 193, 36);
		resultWindow.setText("");
		getContentPane().add(resultWindow);

		input1Window.setEditable(true);
		input1Window.setBackground(Color.WHITE);
		input1Window.setForeground(Color.BLACK);
		input1Window.setBounds(735, 55, 240, 36);
		input1Window.setText("");
		getContentPane().add(input1Window);

		input2Window.setEditable(true);
		input2Window.setBackground(Color.WHITE);
		input2Window.setForeground(Color.BLACK);
		input2Window.setBounds(734, 100, 240, 36);
		input2Window.setText("");
		getContentPane().add(input2Window);

		resultWindowText.setBounds(560, 85, 240, 65);
		resultWindowText.setText("Enter your second value here:");
		getContentPane().add(resultWindowText);

		input1WindowText.setBounds(560, 55, 240, 36);
		input1WindowText.setText("Enter your first value here:");
		getContentPane().add(input1WindowText);

		input2WindowText.setBounds(706, 165, 39, 65);
		input2WindowText.setText("Result:");
		getContentPane().add(input2WindowText);


	}


	private void addActionListeners(){
		additionButton.addActionListener(this);
		subtractionButton.addActionListener(this);
		multiplicationButton.addActionListener(this);
		divisionButton.addActionListener(this);
		powButton.addActionListener(this);
		sqrtButton.addActionListener(this);
		squareButton.addActionListener(this);
		cubeButton.addActionListener(this);
		logButton.addActionListener(this);
		absoluteButton.addActionListener(this);
		exitButton.addActionListener(this);
		clearButton.addActionListener(this);
	}

	private void createUI(){
		setTitle("DankCalculator");
		setSize(1000, 300);
		getContentPane().setLayout(null);
		createButtons();
		createLabels();
	}
	

	public void actionPerformed(ActionEvent e) {
		try{
			if (e.getSource() == exitButton){
				
				System.exit(0);
			}
			if (e.getSource() == clearButton){
				input1Window.setText("");
				input2Window.setText("");

			}
			if (e.getSource() == additionButton){
				setInput1(Double.parseDouble(input1Window.getText()));
				setInput2(Double.parseDouble(input2Window.getText()));
				resultWindow.setText(Double.toString((ACO.add(getInput1(), getInput2()))));
			}
			if (e.getSource() == subtractionButton){
				setInput1(Double.parseDouble(input1Window.getText()));
				setInput2(Double.parseDouble(input2Window.getText()));
				resultWindow.setText(Double.toString((ACO.subtract(getInput1(), getInput2()))));
			}
			if (e.getSource() == multiplicationButton){
				setInput1(Double.parseDouble(input1Window.getText()));
				setInput2(Double.parseDouble(input2Window.getText()));
				resultWindow.setText(Double.toString((ACO.multiply(getInput1(), getInput2()))));
			}
			if (e.getSource() == divisionButton){
				setInput1(Double.parseDouble(input1Window.getText()));
				setInput2(Double.parseDouble(input2Window.getText()));
				resultWindow.setText(Double.toString((ACO.division(getInput1(), getInput2()))));
				
			}
			if (e.getSource() == powButton){
				setInput1(Double.parseDouble(input1Window.getText()));
				setInput2(Double.parseDouble(input2Window.getText()));
				resultWindow.setText(Double.toString((ACO.pow(getInput1(), getInput2()))));

			}
			if (e.getSource() == sqrtButton){
				setInput1(Double.parseDouble(input1Window.getText()));
				resultWindow.setText(Double.toString((ACO.sqrt(getInput1()))));
				if(Double.toString(getInput2()) != ""){
					input2Window.setText("Only first input is used in Sqrt operation");
				}
			}
			if (e.getSource() == squareButton){
				setInput1(Double.parseDouble(input1Window.getText()));
				resultWindow.setText(Double.toString((ACO.square(getInput1()))));
				if(Double.toString(getInput2()) != ""){
					input2Window.setText("Only first input is used in Square operation");
				}
			}
			if (e.getSource() == cubeButton){
				setInput1(Double.parseDouble(input1Window.getText()));
				resultWindow.setText(Double.toString((ACO.cube(getInput1()))));
				if(Double.toString(getInput2()) != ""){
					input2Window.setText("Only first input is used in cube operation");
				}
			}
			if (e.getSource() == logButton){
				setInput1(Double.parseDouble(input1Window.getText()));
				resultWindow.setText(Double.toString((ACO.log(getInput1()))));
				if(Double.toString(getInput2()) != ""){
					input2Window.setText("Only first input is used in log operation");
				}
			}
			if (e.getSource() == absoluteButton){
				setInput1(Double.parseDouble(input1Window.getText()));
				resultWindow.setText(Double.toString((ACO.absolute(getInput1()))));
				if(Double.toString(getInput2()) != ""){
					input2Window.setText("Only first input is used in absolute operation");
				}
			}
		}
		catch(NumberFormatException error){
			//System.out.println(error);
			input2Window.setText("Please only use numbers in the calculator");
		}
	}




}