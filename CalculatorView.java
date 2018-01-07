package caculator;


import java.awt.event.ActionListener;

import javax.swing.*;

public class CalculatorView extends JFrame
{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private JTextField firstNumber = new JTextField(10);
	private JLabel additionLabel = new JLabel("+");
	private JTextField secondNumber = new JTextField(10);
	private JButton calculateButton = new JButton	("=");
	private JTextField calSolution = new JTextField(10);
	
	
	
	private JTextField firstNumber1 = new JTextField(10);
	private JLabel additionLabel1 = new JLabel("-");
	private JTextField secondNumber1 = new JTextField(10);
	private JButton calculateButton1 = new JButton	("=");
	private JTextField calSolution1 = new JTextField(10);
	
	CalculatorView()
	{
		JPanel calcPanel = new JPanel();
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(600,200);
		calcPanel.add(firstNumber);
		calcPanel.add(additionLabel);
		calcPanel.add(secondNumber);
		calcPanel.add(calculateButton);
		calcPanel.add(calSolution);
		
		
		calcPanel.add(firstNumber1);
		calcPanel.add(additionLabel1);
		calcPanel.add(secondNumber1);
		calcPanel.add(calculateButton1);
		calcPanel.add(calSolution1);
	
		
		
		this.add(calcPanel);
		
	}
	//Add
	public int getFirstNumber()
	{
		return Integer.parseInt(firstNumber.getText());
	}
	public int getSecondNumber()
	{
		return Integer.parseInt(secondNumber.getText());
	}
	public int getCalcSolution()
	{
		return Integer.parseInt(calSolution.getText());
	}
	
	public void setCalcSolution(int solution)
	{
		calSolution.setText(Integer.toString(solution));
	}
	void addCalculationLisener(ActionListener listenerForCalcButton)
	{
		 calculateButton.addActionListener(listenerForCalcButton);
	}
	
	
	//Subtract
	
	public int getFirstNumber1()
	{
		return Integer.parseInt(firstNumber1.getText());
	}
	public int getSecondNumber1()
	{
		return Integer.parseInt(secondNumber1.getText());
	}
	public int getCalcSolution1()
	{
		return Integer.parseInt(calSolution1.getText());
	}
	
	public void setCalcSolution1(int solution1)
	{
		calSolution1.setText(Integer.toString(solution1));
	}
	
	void subtractCalculationLisener(ActionListener listenerForCalcButton1)
	{
		 calculateButton1.addActionListener(listenerForCalcButton1);
	}
	
	
	
	
	
	
	void displayErrorMessage(String errorMeessage)
	{
		JOptionPane.showMessageDialog(this, errorMeessage);
	}
	


}
