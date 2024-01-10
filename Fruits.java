
public class Fruits {
	
	    int weight;
	    
	    String tasty;
	     String origin ;
	    String colour;
	    
	    public void slice() {
	        System.out.println("Slicing the " );
	    }
	     void Peel(){
	    	 System.out.println("peel");
	     }
	      
	    void greoeing(){
	    	System.out.println("growing fruits");
	    }
	    
	    void Falling(){
	    	
	    }
	    
	    class orange extends Fruits{
	    	String colourname;
	    	int numOfOranges;
	    	
	    	
	    	 public void eat() {
	    		 System.out.println("peoples are eating ");
	    	 }
	    	 
	    	 void squeezeForJuice(){
	    		 System.out.println("juice purpose");
	    	 }
	    	 
	    	 
	    	 class banana extends Fruits{
	    		 boolean isSweet;
	    		 String colour;
	    		 
	    		 
	    		 public void Sweetness() {
	    			 System.out.println("sweeter");
	    		 }
	    	 }
	    	 public void eat1() {
	    		 System.out.println("peoples are eating");
	    	
	    }
	    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

}
