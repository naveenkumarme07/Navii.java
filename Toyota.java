

public class Toyota {
	
	 static String brandname = "Toyota";
	    static int steering = 1;
	    static int averageMileage = 25;

	    String model;
	    int year;
	    int price;
        String wheels;
        
        Toyota(String model, int year, int price, String wheels) {
            this.model = model;
            this.year = year;
            this.price = price;
            this.wheels = wheels;
        }

        // Method to display car information
        public void displayCarInfo() {
            System.out.println("Brand: " + brandname);
            System.out.println("Model: " + model);
            System.out.println("Year: " + year);
            System.out.println("Price: $" + price);
            System.out.println("Wheels: " + wheels);
            System.out.println("Steering: " + steering);
            System.out.println("Average Mileage: " + averageMileage );
        }
       
}
