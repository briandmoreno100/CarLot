/*
 * A basic GUI that allows you to add cars to a CarLot and removed them once sold.
 * 
 *author Brian Moreno 
 * 
 */

import java.awt.event.ActionEvent;

import javax.swing.*;

public class CarLotGui {
	// Line 1 on the GUI
	private CarLot dontWreckem;
	private JLabel newCarID;
	private JTextField newCarIDField;
	private JLabel newCarMileage;
	private JTextField newCarMileageField;
	private JLabel mpg;
	private JTextField mpgField;
	private JLabel soldCarID;
	private JTextField soldCarIDField;
	
	//Line 2 on the GUI
	private JLabel newCarCost;
	private JTextField newCarCostField;
	private JLabel newCarPrice;
	private JTextField newCarPriceField;
	private JButton recordSale;
	
	//Line 3 on the GUI
	private JButton makeNewCar;
	
	//Line 4 on the GUI
	private JLabel bestMPG;
	private JLabel highestMileage;
	private JLabel fleetavg;
	private JLabel profit;
	
	//Line 5 on the GUI
	private JTextArea asEntered;
	
	//Line 6 on the GUI
	private JTextArea byMPG;
	
	
	
	public CarLotGui() {
		WidgetViewer fun = new WidgetViewer();
		
		//Line 1 Instantiation.  This creates the first line of JLabels and JTextField.
		dontWreckem = new CarLot();
		newCarID = new JLabel("New Car ID");
		newCarIDField = new JTextField();
		newCarMileage = new JLabel("New Car Mileage");
		newCarMileageField = new JTextField();
		mpg = new JLabel("MPG");
		mpgField = new JTextField();
		soldCarID = new JLabel("Sold Car ID");
		soldCarIDField = new JTextField();
		
		fun.add(newCarID, 30, 10, 120, 30);
		fun.add(newCarIDField, 135, 10, 120, 30);
		fun.add(newCarMileage, 300, 10, 120, 30);
		fun.add(newCarMileageField, 405, 10, 120, 30);
		fun.add(mpg, 570, 10, 120, 30);
		fun.add(mpgField, 675, 10, 120, 30);
		fun.add(soldCarID, 840, 10, 120, 30);
		fun.add(soldCarIDField, 945, 10, 120, 30);
		
		//Line 2 Instantiation.  This creates the second line of JLabels, JTextFields and JButton.
		newCarCost = new JLabel("New Car Cost");
		newCarCostField = new JTextField();
		newCarPrice = new JLabel("New Car Price");
		newCarPriceField = new JTextField();
		recordSale = new JButton("Press to Record Sale");
		
		fun.add(newCarCost, 30, 50, 120, 30);
		fun.add(newCarCostField, 135, 50, 120, 30);
		fun.add(newCarPrice, 300, 50, 120, 30);
		fun.add(newCarPriceField, 405, 50, 120, 30);
		fun.add(recordSale, 835, 50, 200, 30);
		
		//Line 3 Instantiation.This creates the third line of JButton.
		makeNewCar = new JButton("Make New Car");
		fun.add(makeNewCar, 25, 90, 150, 30);
		
		//Line 4 Instantiation.This creates the fourth line of JLabels and JTextField.
		bestMPG = new JLabel("Best MPG: NONE");
		highestMileage = new JLabel("Highest Mileage: None");
		fleetavg = new JLabel("Fleet AVG MPG: 1.0");
		profit = new JLabel("Profit: 0");
		
		fun.add(bestMPG, 30, 130, 250, 30);
		fun.add(highestMileage, 250, 130, 250, 30);
		fun.add(fleetavg, 570, 130, 200, 30);
		fun.add(profit, 840, 130, 200, 30);
		
		//Line 5 Instantiation. This creates the fifth line of JTextArea.
		asEntered = new JTextArea("Car Lot as Entered\n");
		fun.add(asEntered, 30, 170, 840, 200);
		
		//Line 6 Instantiation.This creates the sixth line of JTextArea.
		byMPG = new JTextArea("Car Lot by MPG\n");
		fun.add(byMPG, 30, 410, 840, 200);
		
		//Adding the Event Handler.
		ButtonEventHandler action = new ButtonEventHandler();
		makeNewCar.addActionListener(action);
		recordSale.addActionListener(action);
		newCarIDField.addActionListener(action);
		newCarMileageField.addActionListener(action);
		mpgField.addActionListener(action);
		newCarCostField.addActionListener(action);
		newCarPriceField.addActionListener(action);
		soldCarIDField.addActionListener(action);
	}
		
		//Creates Event Handler.
		class ButtonEventHandler extends WidgetViewerActionEvent {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				Object pressed = e.getSource();
				//Creating a new car and inputing it into the "Car Lot" JTextfields
				if(makeNewCar == pressed) {
					Car car = new Car();
					car.setIdentifier(newCarIDField.getText());
					car.setMiles(Integer.parseInt(newCarMileageField.getText()));
					car.setMPG(Double.parseDouble(mpgField.getText()));
					car.setCost(Integer.parseInt(newCarCostField.getText()));
					car.setPrice(Integer.parseInt(newCarPriceField.getText()));
					dontWreckem.add(car);
					
					//Clearing the JTextFields after JButton is clicked or enter is pushed.
					newCarIDField.setText("");
					newCarMileageField.setText("");
					mpgField.setText("");
					newCarCostField.setText("");
					newCarPriceField.setText("");
					
					//Placing updated values into line 4
					bestMPG.setText("Best MPG: " + dontWreckem.getCarBestMPG().getIdentifier()
							+ " " + dontWreckem.getCarBestMPG().getMPG());
					highestMileage.setText("Highest Mileage: " + dontWreckem.getHighestMilageCar());
					fleetavg.setText("Fleet AVG MPG: " + dontWreckem.getCarAverageMPG());
					
					//Placing updated values into line 5
					asEntered.setText("Car Lot as Entered\n" + "Car Lot \n" + dontWreckem.toString() + "\n");
					
					//Placing updated values into line 6
					byMPG.setText("Car Lot by MPG\n" + dontWreckem.getSortedByMPG());
				}
				if (recordSale == pressed) {
					Car car = new Car();
					//Getting the text from soldCarIDField and removing the car from the car lot
					dontWreckem.find(soldCarIDField.getText()).setSold(true);
					//dontWreckem.find(soldCarIDField.getText());
					profit.setText("Profit: " + Integer.toString(dontWreckem.find(soldCarIDField.getText()).getProfit()));
					
					dontWreckem.remove(dontWreckem.find(soldCarIDField.getText()));
					
					if (dontWreckem.size() != 0) {
						//Placing updated values into line 4
						bestMPG.setText("Best MPG: " + dontWreckem.getCarBestMPG().getIdentifier()
							+ " " + dontWreckem.getCarBestMPG().getMPG());
						highestMileage.setText("Highest Mileage: " + dontWreckem.getHighestMilageCar());
						fleetavg.setText("Fleet AVG MPG: " + dontWreckem.getCarAverageMPG());
					
						//Placing updated values into line 5
						asEntered.setText("Car Lot as Entered\n" + "Car Lot \n" + dontWreckem.toString() + "\n");
					
						//Placing updated values into line 6
						byMPG.setText("Car Lot by MPG\n" + dontWreckem.getSortedByMPG());
					
						//Clearing the JTextFields after JButton is clicked or enter is pushed.
						soldCarIDField.setText("");
						
						
					}
					else {
						bestMPG.setText("Best MPG: 0");
						highestMileage.setText("Highest Mileage: 0");
						fleetavg.setText("Fleet AVG MPG: 0");
					
						//Placing updated values into line 5
						asEntered.setText("Car Lot as Entered\n");
						
						//Placing updated values into line 6
						byMPG.setText("Car Lot by MPG\n");
						
						//Clearing the JTextFields after JButton is clicked or enter is pushed.
						soldCarIDField.setText("");
					}
					
				}
		}
	}
}
