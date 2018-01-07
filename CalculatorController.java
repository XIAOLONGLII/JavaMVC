package caculator;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CalculatorController
{
	private CalculatorView theView;
	private CalculatorModel theModel;
	
	public CalculatorController(CalculatorView theView, CalculatorModel theModel)
	{
		this.theView = theView;
		this.theModel = theModel;
		
		this.theView.addCalculationLisener(new CalculateListener());
		
		this.theView.subtractCalculationLisener(new CalculateListener1());
	}
	
	class CalculateListener implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			// TODO Auto-generated method stub
			int firstNumber , secondNumber  = 0;
			try
			{
				firstNumber = theView.getFirstNumber();
				secondNumber = theView.getSecondNumber();
				theModel.addTwoNumbers(firstNumber, secondNumber);
				theView.setCalcSolution(theModel.getCalculationValue());
				
				//theModel.subtractTwoNumbers(firstNumber, secondNumber);
				//theView.setCalcSolution(theModel.getCalculationValue());
				
			}
			catch(NumberFormatException ex)
			{
				theView.displayErrorMessage("You need to enter 2 integers ");
			}
			
		}
		
	}
	
	class CalculateListener1 implements ActionListener
	{

		@Override
		public void actionPerformed(ActionEvent e) {
			int firstNumber1 , secondNumber1  = 0;
			try
			{
				firstNumber1 = theView.getFirstNumber1();
				secondNumber1 = theView.getSecondNumber1();
				
				theModel.subtractTwoNumbers(firstNumber1, secondNumber1);
				theView.setCalcSolution1(theModel.getCalculationValue1());
				
			}
			catch(NumberFormatException ex)
			{
				theView.displayErrorMessage("You need to enter 2 integers ");
			}
			
		}
	
	}

}
