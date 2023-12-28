

public class OppoPhone {
	    static String brand = "Oppo";
	    static String founder = " unk";
	    static int numofdisplayes = 3;

	    String model;
	    int storageCapacity;
	    int displaySize;
	    boolean is4GSupported;
	    
	    OppoPhone(String model, int storageCapacity, int displaySize, boolean is4GSupported) {
	        this.model = model;
	        this.storageCapacity = storageCapacity;
	        this.displaySize = displaySize;
	        this.is4GSupported = is4GSupported;
	
}
	    public void displayPhoneInfo() {
	        System.out.println("Brand: " + brand);
	        System.out.println("Model: " + model);
	        System.out.println("Storage Capacity: " + storageCapacity );
	        System.out.println("Display Size: " + displaySize + " inches");
	        System.out.println("4G Supported: " + (is4GSupported ? "Yes" : "No"));
	        System.out.println("Founder: " + founder);
	        System.out.println("Number of Displays: " + numofdisplayes);
	    }
}