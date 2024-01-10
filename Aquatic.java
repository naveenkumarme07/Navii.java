package Working;

public class Aquatic extends Birds {
	   int depth;
	    boolean hasFins; 
	    void swim() {
	        System.out.println("The aquatic organism is swimming ");
	    }

	    void explore() {
	        System.out.println("The aquatic organism is exploring its underwater surroundings.");
	    }
	    
	    
	    class Swan extends Aquatic{
	    	 boolean gracefulSwimmer;  
	    	    int neckLength;           
	    	    void swim() {
	    	        System.out.println("Swan is swimming gracefully.");
	    	    }

	    	    void flyGracefully() {
	    	        System.out.println("Swan is flying gracefully with its long neck.");
	    	    }
	    	
	    }
	    public class Gull extends Aquatic {

	        boolean scavenger;   
	        String featherColor;  
	        void scavenge() {
	            System.out.println("Gull is scavenging for food.");
	        }

	        void makeDistinctCall() {
	            System.out.println("Gull is making its distinct call.");
	        }
	    }

}
