/*
 * basic Calculator
 * 
 * author Brian Moreno
 */
public class AverageCalculator {

	private int sum;
	private int count;
	
	
	AverageCalculator() {
		sum = 0;
		count = 0;
	}
	
	public void add(int newNum) {
		sum += newNum;
		count++;
	}
	
	public int getSum() {
		return sum;
	}
	
	public int getCount() {
		return count;
	}
	
	public double getAverage() {
		double average;
		if (count < 0) {
			return 0;
		}
		else {
			average = (double) sum / count;
		}
		
		return average;
	}
	
	
}
