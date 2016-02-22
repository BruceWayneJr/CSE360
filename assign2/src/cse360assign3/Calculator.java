package cse360assign3;
/** Arithmetic Calculator with a memory for history of operations
 * @author Naveen Kumar
 * @version Feb 22, 2016
 * 
 */
public class Calculator {

	private int total;
	private String history="0"; 
	
	/** Initializes the total variable
	 * @param total has the result of the arithmetic operations
	 */
	public Calculator () {
		total = 0;     // not needed - included for clarity
	}
	
	/** Returns the current total
	 * 
	 * @param total has the result of the arithmetic operations
	 */
	public int getTotal () {
		return total;
	}
	
	/** Addition operation is performed on the current total
	 * 
	 * @param value is added to the existing total
	 */
	public void add (int value) {
		total = total+value;
		history = history + " + " + value;		
	}
	
	/** Subtraction is performed on the current total
	 * 
	 * @param value is subtracted from the total
	 */
	public void subtract (int value) {
		total = total-value;
		history = history + " - " + value;
		
	}
	
	/** Multiplication is performed on the current total
	 * 
	 * @param value is multiplied with the total
	 */
	public void multiply (int value) {
		total = total*value;
		history = history + " * " + value;
		
	}
	
	/** Division is performed on the current total
	 * Returns 0 when the divisor is 0
	 * 
	 * @param value is the divisor
	 * @param total is the dividend
	 * 
	 */
	public void divide (int value) {
		if(value == 0)
			total=0;
		else
		total = total/value;
		history = history + " / " + value;
		
	}
	
	/** Returns the history of operations performed in this calculator 
	 * 
	 * @param history contains the history of all the operations performed
	 */
	public String getHistory () {
		return history;
	}
}