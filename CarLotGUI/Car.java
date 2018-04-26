/*
 * Class to make a Car object.
 * 
 *author Brian Moreno 
 * 
 */
public class Car {
	private String identifier;
	private int milage;
	private double mpg;
	private int cost;
	private int price;
	private boolean isSold = false;
	
	public Car(){
		identifier = "";
		milage = 0;
		mpg = 0;
		cost = 0;
		price = 0;
		
	}
	public Car(String id){
		identifier = id;
		milage = 0;
		mpg = 0;
		cost = 0;
		price = 0;
		
	}
	public Car(String id, int initialMileage, double milesPerGallon, int carsCost, int carsPrice){
		identifier = id;
		milage = initialMileage;
		mpg = milesPerGallon;
		cost = carsCost;
		price = carsPrice;
		
	}
	public void setCost(int newCost){
		this.cost = newCost;
	}
	public void setIdentifier(String newId) {
		this.identifier = newId;
	}
	public void setMiles(int newMiles) {
		this.milage = newMiles;
	}
	public void setMPG(double newMPG) {
		this.mpg = newMPG;
	}
	public void setPrice(int newPrice) {
		this.price = newPrice;
	}
	public void setSold(boolean newSold) {
		this.isSold = newSold;
	}
	public void addMiles(int milesToAdd) {
		milage += milesToAdd;
	}
	public int getCost() {
		return cost;
	}
	public String getIdentifier() {
		return identifier;
	}
	public int getMilage() {
		return milage;
	}
	public double getMPG() {
		return mpg;
	}
	public int getPrice() {
		return price;
	}
	public boolean isSold() {
		return isSold;
	}
	public int getProfit() {
		if (isSold()) {
			return price - cost;
		}
		return 0;
	}
	//Why is this different that what the right up does.
	public int compareId(Car toCompare) {
		return identifier.compareToIgnoreCase(toCompare.identifier);
	}
	public int compareMPG(Car otherCar) {
		if (otherCar.getMPG() < mpg) {
			return 1;
		}
		else if (otherCar.getMPG() > mpg) {
			return -1;
		}
		else  {
			return 0;
		}
	}
	public int compareMiles(Car otherCar) {
		if (otherCar.getMilage() < milage) {
			return 1;
		}
		else if (otherCar.getMilage() > milage) {
			return -1;
		}
		else  {
			return 0;
		}
	}
	public int comparePrice(Car otherCar) {
		if (otherCar.getPrice() < price) {
			return 1;
		}
		else if (otherCar.getPrice() > price) {
			return -1;
		}
		else  {
			return 0;
		}
	}
	public String toString() {
		if (isSold() == false) {
		String s = "Car ID = " + getIdentifier() + ": mileage = " + getMilage() + ": mpg = " 
				+ getMPG() + ": cost = " + getCost() + ": price = " + getPrice() + ": is not sold\n"; 
		return s;
		}
		else {
		String k = "Car ID = " + getIdentifier() + ": mileage = " + getMilage() + ": mpg = " 
				+ getMPG() + ": cost = " + getCost() + ": price = " + getPrice() + ": is sold" + ": profit = " + getProfit(); 
		return k;
		}
	}
}
