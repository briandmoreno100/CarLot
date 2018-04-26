/*
 * 
 * author Brian Moreno
 */
public class Room {

	private int area; 
	
	public Room (int area) {
		this.area = area;
	}
	public int getSquareFeet () {
		return area;
	}
	public int getCapacity () {
		return area / 9;
	}
	public String toString() {
		return "The square feet is " + getSquareFeet() + " and the capacity is " + getCapacity();
	}
}
