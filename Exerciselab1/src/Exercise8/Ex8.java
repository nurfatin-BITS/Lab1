package Exercise8;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;  //import all packages needed

//import package exercise 7
import Exercise7.Calculatorweight;

public class Ex8 {

	//attribute for this class
	private String name;
	private double weight;
	
	private String getName() {
		return name;
	}
	
	private void setName(String name) {
		this.name=name;
	}
	
	private double getWeight() {
		return weight;
	}
	
	private void setWeight(double weight) {
		this.weight=weight;
	}
	
	public static void main(String[] args) {
		
		int choice;
		
		List<String> listweight = new ArrayList<String>();
		
		String name;
		double weight;
		
		Calculatorweight Wmars = new Calculatorweight();
		
		Ex8 list = new Ex8();
		Scanner w = new Scanner(System.in);
		
		System.out.println("How many list that you want to enter? ");
		choice = w.nextInt();
		w.nextLine();
		
		for(int i = 0; i<choice; i++)
		{
			System.out.println("\nPlease enter your name: "); // ask user for name
			name = w.nextLine();
			
			list.setName(name); // read name from console
			
			
		
			System.out.println("\nPlease enter your weight: (kg)"); // ask user for weight in kilograms
			weight = w.nextDouble(); // read input on console
			list.setWeight(weight);
			Wmars.setWeight(weight); // send value from attr. weight to method setWeight from class CalculateWeightOnMars
			w.nextLine();
			
			listweight.add("  "+ list.getName() + "    "+ weight + "     "+ Math.round(Wmars.getWeight() * 100.0) / 100.0);
			
		}
		
		System.out.println("\n\n--> The list of information of people's weight would be as follows: ");
		System.out.println("-------------------------");
		System.out.println(" Name    | On Earth | On Mars");
		System.out.println("-------------------------");
		
		for(int j = 0; j<listweight.size(); j++)
		{
			System.out.println( listweight.get(j) );
			System.out.println("-------------------------");
		} 
	}
}
