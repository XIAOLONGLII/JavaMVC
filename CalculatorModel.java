package caculator;

//methods are here, add or subtract
public class CalculatorModel
{
	private int calculationValue;
	private int calculationValue1;
	
	public void addTwoNumbers( int firstNumber, int secondNumber)
	{
		calculationValue = firstNumber + secondNumber;
	}
	public void subtractTwoNumbers( int firstNumber, int secondNumber)
	{
		calculationValue1 = firstNumber - secondNumber;
	}
	
	public int getCalculationValue()
	{
		return calculationValue;
	}

	public int getCalculationValue1()
	{
		return calculationValue1;
	}
}
