/*
 * basic Calculator Main
 * 
 * author Brian Moreno
 */
public class AverageCalculatorMain {

	public static void main(String[] args) {
		
		AverageCalculator first = new AverageCalculator();
		first.add(2);
		
		AverageCalculator second = new AverageCalculator(); 
		second.add(2);
		second.add(3);
		second.add(4);
		
		System.out.print("First sum is: " + first.getSum());
		System.out.print("\nFirst count is: " + first.getCount());
		System.out.print("\nFirst average is: " + first.getAverage());
		System.out.print("\nSecond sum is: " + second.getSum());
		System.out.print("\nSecond count is: " + second.getCount());
		System.out.print("\nSecond average is: " + second.getAverage());
	}

}
