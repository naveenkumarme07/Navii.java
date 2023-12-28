

public class Laptap {
	
	    static String brand = "sony";
	    static String operatingSystem = "Windows";
	    static int totalLaptops = 0;

	    String model;
	    double screenSize;
	    boolean isTouchscreen;

	    public Laptap(String model, double screenSize, boolean isTouchscreen) {
	        this.model = model;
	        this.screenSize = screenSize;
	        this.isTouchscreen = isTouchscreen;
	    }

	    public void displayDetails() {
	        System.out.println("Model: " + model);
	        System.out.println("Screen Size: " + screenSize + " inches");
	        System.out.println("Touchscreen: " + (isTouchscreen ? "Yes" : "No"));
	        System.out.println("Brand: " + brand);
	        System.out.println("Operating System: " + operatingSystem);
	        System.out.println("Total Laptops: " + totalLaptops);
	        System.out.println("----------------------------");

}
}	
