
	public class Flower {
	    String color;
	    String fragrance;
	    String name;
	    boolean isBlossomed;

	    void smell(){
	    	
	    }

	    void blossom() {
	        System.out.println("The " + name + " is blossoming.");

     }
	           void Growing(){
	        	   System.out.println();
	           }
	           
	           

	           void pollinate() {
	               System.out.println("Pollinating the ");
	           }
	           
	           

class Rose extends Flower {
    int thornCount;
    boolean hasScent;

   

    void prickle() {
        System.out.println("Be careful! The rose has " + thornCount + " thorns.");
    }
     }
	 void growingPetals(){
		 System.out.println();
	 }
	 
	 
	 public class Lily extends Flower {
		    boolean isElegant;
		    int petalCount;
		    
	}
	 
	 void gracefullyBloom() {
		 System.out.println("gracefulll");
	 }
	 void shedPetal() {
		 System.out.println("+++++++++++");
	 }
	}
	
	
	