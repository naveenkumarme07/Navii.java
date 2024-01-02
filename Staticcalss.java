

public class Staticcalss {
	 public static void Class() {
	        System.out.println("Static Method ");
	    }

	    public static void Car() {
	        System.out.println("Static Method 2");
	    }

	    public static void Phone() {
	        System.out.println("Static Method 3");
	    }

	    
	    public static void Pen(){
	    	System.out.println("Static Method 4");
	    	
	    }
	    public static void Orange(){
	    	System.out.println("Static Method 5");
	    }
	    
	    // Non-static methods
	    public void Laptap() {
	        System.out.println("Non-Static Method 1");
	        
	    }
	    public void Bus() {
	        System.out.println("Non-Static Method 2");
	        
	    }
	    public void Cell() {
	        System.out.println("Non-Static Method 3");
	        
	    }
	    public void Cricket() {
	        System.out.println("Non-Static Method 4");
	        
	    }
	    public void Banglore() {
	        System.out.println("Non-Static Method 5");
	        
	    }
	    
	    
    public static void main(String[] args) {
	            
	    Staticcalss.Class();
        Staticcalss.Car();
        Staticcalss.Phone();
        Staticcalss.Pen();
        Staticcalss.Orange();
        
        
        Staticcalss instance = new Staticcalss();

        //  non-static methods using the instance
        instance.Laptap();
        instance.Bus();
        instance.Cell();
        instance.Cricket();
        instance.Banglore();

        //  static methods using the class name
        Staticcalss.Class();
        Staticcalss.Car();
        Staticcalss.Phone();
        Staticcalss.Pen();
        Staticcalss.Orange();
    }
}

