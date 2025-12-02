package Activity;

public class Car {
	 String color;
	 String transmission;
	 int make;
	 int tyres;
	 int doors;
	 
	 Car()
	 {
		 tyres = 4;
		  doors = 4;
	 }
	
		 void displayCharacteristics()
		 {
			 System.out.println("colour of the car is" + color);
			 System.out.println("make of the car is" + make);
			 System.out.println("transmission of the car is" + transmission);
			 System.out.println("doors of the car is is" + doors);
			 System.out.println("tyres of the car is is" + tyres);
		 }
		 public void accelerate() {
				System.out.println("Car is moving forward.");
			    }
				
			    public void brake() {
				System.out.println("Car has stopped.");
			    }
		 
	 

}
