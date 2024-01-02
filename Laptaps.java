

public class Laptaps {
	static String brand ;
    static String operatingSystem;
    static int totalLaptops ;

    String model;
    double screenSize;
    boolean isTouchscreen;

    static {
        System.out.println("Static block executed.");
        totalLaptops = 100;  
        brand = "Sony";
        operatingSystem = "Windows";
    }

     Laptaps(String model, double screenSize, boolean isTouchscreen) {
        this.model = model;
        this.screenSize = screenSize;
        this.isTouchscreen = isTouchscreen;
        totalLaptops++;
    }
     void printInfo() {
         
         System.out.println("Brand: " + brand);
         System.out.println("Operating System: " + operatingSystem);
         System.out.println("Total Laptops: " + totalLaptops);

         
         System.out.println("Laptop Model: " + model);
         System.out.println("Laptop Screen Size: " + screenSize);
         System.out.println("Is Touchscreen: " + isTouchscreen);
     }
     public static void main(String[] args) {
         Laptaps lap = new Laptaps("ExampleModel", 15.6, true);

         lap.printInfo();
     }
  
}
