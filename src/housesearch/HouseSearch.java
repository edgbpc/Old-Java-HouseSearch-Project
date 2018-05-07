package houseproject;

import java.util.InputMismatchException;
import java.util.Scanner;


interface Customizable{
	
	void changeBeds(int x);
	
	void changeBaths(double y);
	
	void changeArea(double z);
	
}

abstract class House implements Cloneable, Comparable<House>, Customizable {
	int Template_basic_rate;
	double area = 2999;
	int num_Beds;
	double num_Baths;
	boolean customized = true;
	int extraBeds;
	double extraBaths;
	
	public abstract double getCost();
	
	@Override
	public int compareTo(House myHouse) {
		int match = 0;
		if (myHouse.num_Beds == num_Beds){
			if (myHouse.num_Baths == num_Baths)
					match = 1;
		}else{
					match = 0;
	}
	
	return match;
}
	
	
	@Override
	public House clone() throws CloneNotSupportedException {
		return (House) super.clone();
	}
	
	
	@Override
	public String toString(){
		String style = this.getClass().getSimpleName();
 		double cost = this.getCost();
		//System.out.println(styleChosen);
		return style + " with " + this.num_Beds + " bedrooms and " + this.num_Baths + " baths and total square feet of " + area + ".  Design cost: " + cost;
		
	}

	@Override
	public void changeBeds(int x){
		this.num_Beds = x;
	}
	
	@Override
	public void changeBaths(double y){
		this.num_Baths = y;
	}
	
	@Override 
	public void changeArea(double z){
		this.area = z;
		
	}
	
	public void setextraBeds(House defaultHouse, House myHouse){
		this.extraBeds = myHouse.num_Beds - defaultHouse.num_Beds;
	}
			
	public void setextraBaths(House defaultHouse, House myHouse){
		this.extraBaths = myHouse.num_Beds - defaultHouse.num_Beds;
	}

	public House[] changeStyle(House myHouse, int changeStyleSelection) throws CloneNotSupportedException{
		House tempHouse;
		tempHouse = myHouse.clone();
		
		House defaultHouse = null;
		
		House[] HouseList = new House[2];
		
		switch (changeStyleSelection) {
			
			case 1:
				defaultHouse = new Traditional();
				myHouse = defaultHouse.clone();
				break; 
			
			case 2:
				defaultHouse = new Modern();
				myHouse = defaultHouse.clone();
				break;
		
			case 3:
				defaultHouse = new European();
				myHouse = defaultHouse.clone();
				break;
		
			case 4:
				defaultHouse = new Southwest();
				myHouse = defaultHouse.clone();
				break;
				
			case 5:
				defaultHouse = new Mountain();
				myHouse = defaultHouse.clone();
				break;
			
			case 6:
				defaultHouse = new Victorian();
				myHouse = defaultHouse.clone();
				break;
			
			case 7:
				defaultHouse = new Country();
				myHouse = defaultHouse.clone();
				break;
			
		default:
			HouseSearch.errorExit();
	
				
		}
		 
		myHouse.num_Beds = tempHouse.num_Beds;
		myHouse.num_Baths = tempHouse.num_Baths;
		myHouse.area = tempHouse.area;
		HouseList[0] = defaultHouse; 
		HouseList[1] = myHouse;
			 
		return HouseList;
	}
}


class Traditional extends House {
	int Template_basic_rate = 3300;
	
	Traditional(){
		num_Beds = 3;
		num_Baths = 2;
	}

		@Override
	public double getCost() {
					
		double multiplier = 1;
		double tax;
			
//		if (this.customized == false){
//			return Template_basic_rate;
//		}
//		else {
		
		if (this.area >= 3000){
			multiplier = 1.5;
		}
		
		tax = ((Template_basic_rate * multiplier) + (800*extraBeds) + (500*extraBaths)) * .05;	
		return (Template_basic_rate * multiplier) + (800*extraBeds) + (500*extraBaths) + tax;
//		}
	}
}

class Modern extends House {
	int Template_basic_rate = 4200;
	
	Modern(){
	num_Beds = 2;
	num_Baths = 1.5;
	}
	
	@Override
	public double getCost() {
		double multiplier = 1;
		double tax;
			
//		if (this.customized == false){
//			return Template_basic_rate;
//		}
//		else {
		
		if (this.area >= 3000){
			multiplier = 1.5;
		}
		
		tax = ((Template_basic_rate * multiplier) + (800*extraBeds) + (500*extraBaths)) * .05;	
		return (Template_basic_rate * multiplier) + (800*extraBeds) + (500*extraBaths) + tax;
//		}
	}
}


class European extends House {
	int Template_basic_rate = 4700;
	
	European(){
		num_Beds = 2;
		num_Baths = 2;
	}
	
	
	@Override
	public double getCost() {
		double multiplier = 1;
		double tax;
			
//		if (this.customized == false){
//			return Template_basic_rate;
//		}
//		else {
		
		if (this.area >= 3000){
			multiplier = 1.5;
		}
		
		tax = ((Template_basic_rate * multiplier) + (800*extraBeds) + (500*extraBaths)) * .05;
		return (Template_basic_rate * multiplier) + (800*extraBeds) + (500*extraBaths) + tax;
//		}
	}
}

class Southwest extends House {
	int Template_basic_rate = 3600;
	
	Southwest(){
		num_Beds = 3;
		num_Baths = 2;
	}
	
	

	@Override
	public double getCost() {
		double multiplier = 1;
		double tax;
			
//		if (this.customized == false){
//			return Template_basic_rate;
//		}
//		else {
		
		if (this.area >= 3000){
			multiplier = 1.5;
		}
		
		tax = ((Template_basic_rate * multiplier) + (800*extraBeds) + (500*extraBaths)) * .05;	
		return (Template_basic_rate * multiplier) + (800*extraBeds) + (500*extraBaths) + tax;
//		}
	}
}

class Mountain extends House {
	int Template_basic_rate = 3500;
	
	Mountain(){
		num_Beds = 3;
		num_Baths = 2;
	}
	
	

	@Override
	public double getCost() {
		double multiplier = 1;
		double tax;
			
//		if (this.customized == false){
//			return Template_basic_rate;
//		}
//		else {
		
		if (this.area >= 3000){
			multiplier = 1.5;
		}
		
		
		tax = ((Template_basic_rate * multiplier) + (800*extraBeds) + (500*extraBaths)) * .05;
		return (Template_basic_rate * multiplier) + (800*extraBeds) + (500*extraBaths) + tax;	
		
	}
}

class Victorian extends House {
	int Template_basic_rate = 3200;
	
	Victorian(){
		num_Beds = 3;
		num_Baths = 2.5;
	}
	
	

	@Override
	public double getCost() {
		double multiplier = 1;
		double tax = 0;
			
	//	if (this.customized == false){
	//		return Template_basic_rate;
//		}
	//	else {
		
		if (this.area >= 3000){
			multiplier = 1.5;
		}
		
		tax = ((Template_basic_rate * multiplier) + (800*extraBeds) + (500*extraBaths)) * .05;	
		return (Template_basic_rate * multiplier) + (800*extraBeds) + (500*extraBaths) + tax;
		
	}
}

class Country extends House {
	int Template_basic_rate = 3000;

	Country (){
		num_Beds = 3;
		num_Baths = 3;
	}
	
	
	@Override
	public double getCost() {
		double multiplier = 1;
		double tax;
			
//		if (this.customized == false){
//			return Template_basic_rate;
//		}
//		else {
		
		if (this.area >= 3000){
			multiplier = 1.5;
		}
		
		tax = ((Template_basic_rate * multiplier) + (800*extraBeds) + (500*extraBaths)) * .05; 	
		return (Template_basic_rate * multiplier) + (800*extraBeds) + (500*extraBaths) + tax;
	//	}
	}

}


public class HouseSearch {

	public static void main(String[] args) throws CloneNotSupportedException {
		
		int styleSelection = 0;
		int num_Beds = 0;
		double num_Baths = 0;
		double area = 0;
		//int customize = 0;
		House[] HouseList = new House[2];
		boolean satisfied = false;
		int customMenuSelection = 0;
		House myHouse = null;
		
		Scanner input = new Scanner(System.in);
		
		
		// TODO Auto-generated method stub

		
		System.out.println("Thank you for choosing Midwest Design Company");
		System.out.println("Please select a house style to get started.");
	
		styleMenu();
		
		try {
			styleSelection = styleMenuSelection();
		}
		catch (InputMismatchException a){
			errorExit();
		}
		
		HouseList = styleSelect(styleSelection);
		House defaultHouse = HouseList[0];
		myHouse = HouseList[1];
	
	do {		
		customMenu();
		
		try {
			customMenuSelection = customMenuSelection();
		}
		catch (InputMismatchException a){
			errorExit();
		}
		switch (customMenuSelection){
		case 1: 
			break;
		case 2:
			System.out.println("Enter number of bed rooms");
			num_Beds = input.nextInt();
			myHouse.changeBeds(num_Beds);
			myHouse.setextraBeds(defaultHouse, myHouse);
			System.out.println("Current Selection is " + myHouse.toString());
			break;
		case 3:
			System.out.println("Enter number of bath rooms");
			num_Baths = input.nextDouble();
			myHouse.changeBaths(num_Baths);
			myHouse.setextraBaths(defaultHouse, myHouse);
			System.out.println("Current Selection is " + myHouse.toString());
			break;
		case 4:
			System.out.println("Enter desired area in square feet");
			area = input.nextDouble();
			myHouse.changeArea(area);
			System.out.println("Current Selection is " + myHouse.toString());
			break;
		case 5:
			System.out.println("Change style");
			styleMenu();
			int changeStyleSelection = 0;
			try {
				changeStyleSelection = styleMenuSelection();
			}
			catch (InputMismatchException a){
				errorExit();
			}
			HouseList = myHouse.changeStyle(myHouse, changeStyleSelection);
			defaultHouse = HouseList[0];
			myHouse = HouseList[1];
			System.out.println("Current Selection is " + myHouse.toString());
			break;
		case 6:
			satisfied = true;
			System.out.println("\tReceipt\n-----------------------");
			System.out.println(myHouse.toString());
			System.exit(0);
			
			break;
			
		default:
			System.out.println("No changes made.");
			break;
	}
		if (defaultHouse.compareTo(myHouse) == 1){
			System.out.println("Match Found\n");
		//	myHouse.customized = false;
			System.out.println("Current selection: " + myHouse.toString() + "\n");
		}
		
	//	myHouse.setextraBaths(defaultHouse, myHouse);
	//	myHouse.setextraBeds(defaultHouse, myHouse);
		
	//	System.out.println("Current selection:" + myHouse.toString() + "\n");
		
		
	} while (!satisfied);		
}

			
	
		
	
		

	
	static void customMenu(){
		System.out.println("Select preferences");
		System.out.println("1: None ");
		System.out.println("2: Enter Bedrooms");
		System.out.println("3: Enter Bathrooms");
		System.out.println("4: Enter Area");
		System.out.println("5: Change style");
		System.out.println("6: Accept design and exit.");

	
	}

	static int customMenuSelection(){
		int selection = 0;
		Scanner input = new Scanner(System.in);
		if (input.hasNextInt()){
			selection = input.nextInt();
		} else {
			System.out.println("Invalid choice.  Please select 1-6");
			customMenuSelection();
		}
		
		if ((selection >= 1) && (selection <=6)){
		return selection;
		} else {
			System.out.println("Invalid choice.  Please select 1-6");
			customMenuSelection();
		}
		return selection;
	}
	
	
	
	static void styleMenu(){
		
		System.out.println();
		System.out.println("Available Styles");
		System.out.println("-------------------");
		System.out.println("1: Traditional");
		System.out.println("2: Modern");
		System.out.println("3: European");
		System.out.println("4: Southwest");
		System.out.println("5: Mountain");
		System.out.println("6: Victorian");
		System.out.println("7: Country");
		
	}
	
	static int styleMenuSelection(){
		int selection = 0;
		Scanner input = new Scanner(System.in);
		if (input.hasNextInt()){
			selection = input.nextInt();
		} else {
			System.out.println("Invalid choice.  Please select 1-7");
			styleMenuSelection();
		}
		
		if ((selection >= 1) && (selection <=7)){
		return selection;
		} else {
			System.out.println("Invalid choice.  Please select 1-7");
			styleMenuSelection();
		}
		return selection;
		}
		
	static House[] styleSelect(int styleSelection) throws CloneNotSupportedException{
		House myHouse = null;
		House defaultHouse = null;
		
		House[] HouseList = new House[2];
		
		switch (styleSelection) {
			
			case 1:
				defaultHouse = new Traditional();
				myHouse = defaultHouse.clone();
				break; 
			
			case 2:
				defaultHouse = new Modern();
				myHouse = defaultHouse.clone();
				break;
		
			case 3:
				defaultHouse = new European();
				myHouse = defaultHouse.clone();
				break;
		
			case 4:
				defaultHouse = new Southwest();
				myHouse = defaultHouse.clone();
				break;
				
			case 5:
				defaultHouse = new Mountain();
				myHouse = defaultHouse.clone();
				break;
			
			case 6:
				defaultHouse = new Victorian();
				myHouse = defaultHouse.clone();
				break;
			
			case 7:
				defaultHouse = new Country();
				myHouse = defaultHouse.clone();
				break;
			
		default:
			System.out.println("Must enter at least style choice.");
			
	}
		HouseList[0] = defaultHouse; 
		HouseList[1] = myHouse;
		 
		return HouseList;
		 
	 };
			
	static void errorExit(){
		System.out.println("Invalid selection.  Exiting ...");
		System.exit(0);
	}
	
	
}

