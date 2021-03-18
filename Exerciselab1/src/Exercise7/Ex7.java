package Exercise7;

import java.util.Scanner;

public class Ex7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
				Calculatorweight Wmars = new Calculatorweight();
		
				//initialize object for display purpose
				Scanner w=new Scanner(System.in);
				
				//attribute
				double Earthweight;
				
				
				System.out.println("Please enter your weight (KG) :");
				Earthweight=w.nextDouble();
				
				Wmars.setWeight(Earthweight);
				
				System.out.println("-----> Weight on EARTH (kg) :"+ Earthweight + "kg");
				System.out.println("-----> Weight in Mars (kg) :"+ Math.round(Wmars.getWeight() * 100.0) / 100.0  + "kg");

			
		
	}

}
