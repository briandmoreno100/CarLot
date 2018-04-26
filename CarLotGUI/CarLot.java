/*
 * Class to make a CarLot object.
 * 
 *author Brian Moreno 
 * 
 */

import java.util.ArrayList;
public class CarLot extends ArrayList<Car> {
	
	CarLot() {
		
	}
	public boolean add(Car carToAdd) {
		if (super.add(carToAdd)){
			return true;
		}
		else {
			return false;
		}
	}
	public Car find(String carId) {
		for (int i = 0; i < super.size(); i++) {
			if ((super.get(i).getIdentifier().equalsIgnoreCase(carId))) {
				return super.get(i);
			}
		}
		return null;
	}
	public Car get(int position) {
		if (position > super.size()) {
			return null;
		}
		return super.get(position);
	}
	public double getCarAverageMPG() {
		double sum = 0;
		if (super.size() < 1) {
			return -1;
		}
		for (int i = 0; i < super.size(); i++) {
			sum += super.get(i).getMPG();
		}
		return sum / super.size();
		
	}
	public Car getCarBestMPG() {
		
		Car bestMPG = null;
		for (int i = 0; i < super.size(); i++) {
			if(bestMPG == null || super.get(i).getMPG() > bestMPG.getMPG() ) {
				bestMPG = super.get(i);
			}
		}
		return bestMPG;
	}
	public int size() {
		return super.size();
	}
	public String toString() { 
		return super.toString();   // + "\n" + " < Car with highest mileage > " + getCarHighestMilage() + "\n" + " < Total mileage of all the cars on the lot > " + getTotalMiles();
	}
	public Car getCarHighestMilage() {
		Car highestMileage = null;
		for (int i = 0; i < super.size(); i++) {
			if(highestMileage == null || super.get(i).getMilage() > highestMileage.getMilage() ) {
				highestMileage = super.get(i);
			}
		}
		return highestMileage;
	}
	public String getHighestMilageCar() {
		Car highestMileage = null;
		for (int i = 0; i < super.size(); i++) {
			if(highestMileage == null || super.get(i).getMilage() > highestMileage.getMilage() ) {
				highestMileage = super.get(i);
			}
		}
		return highestMileage.getIdentifier() + " " + highestMileage.getMilage();
	}
	public int getTotalMiles() {
		int sum = 0;
		if (super.size() < 1) {
			return -1;
		}
		for (int i = 0; i < super.size(); i++) {
			sum += super.get(i).getMilage();
		}
		return sum;
	}
	public ArrayList<Car> getSortedByMPG() {
		ArrayList<Car> maxMPG = new ArrayList<Car> (this);
		
		for (int i = 0; i < maxMPG.size(); i++) {
			double currentMax = maxMPG.get(i).getMPG();
			int currentMaxIndex = i;
			
		    for (int j = i + 1; j < maxMPG.size(); j++) {
		    		if (currentMax < maxMPG.get(j).getMPG()) {
		          currentMax = maxMPG.get(j).getMPG();
		          currentMaxIndex = j;
		        	}
		    }
		    if (currentMaxIndex != i) { 
		    		Car temp = maxMPG.get(i);
		    		maxMPG.set(i, maxMPG.get(currentMaxIndex));
		    		maxMPG.set(currentMaxIndex, temp);
		    		currentMax = maxMPG.get(i).getMPG();
		      }    
		}
		return maxMPG;
	}
}
