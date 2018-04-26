/*
 * 
 * author Brian Moreno
 */
public class Elevator extends Room{
	
	private int currentFloor;
	
	public Elevator(int area) {
		super(area);
	}
	public void up(int floors) {
		currentFloor++;
	}
	public void down(int floors) {
		currentFloor--;
	}
	public int getFloor() {
		return currentFloor;
	}
	public String toString() {
		return "The square feet is " + getSquareFeet() + " and the capacity is " + getCapacity() + " and the floor is " + getFloor();
	}
}
