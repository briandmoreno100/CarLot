/*
 * 
 * author Brian Moreno
 */
public class Classroom extends Room{

	private int chairs;
	
	public Classroom(int area) {
		super(area);
	}
	public Classroom(int area, int chairs) {
		super(area);
		this.chairs = chairs;
	}
	public int getChairs() {
		return chairs;
	}
	public void setChairs(int chairs) {
		this.chairs = chairs;
	}
	public int getCapacity() {
		
		return chairs;
	}
	public String toString() {
		return "The square feet is " + getSquareFeet() + " and the capacity is " + getCapacity();
	}
	
}
