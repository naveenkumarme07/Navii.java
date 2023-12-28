

public class Orange {
	   String variety;
	    int weight;
	    int numoforanges;
	    
	    static String tasty="sweet";
	   static  String origin = "ind";
	    static String colour="orange";
	    
	    
	    Orange(String variety, int weight, int numoforanges) {
	        this.variety = variety;
	        this.weight = weight;
	        this.numoforanges = numoforanges;
	    }
	    void printOrange(){
	    	 System.out.println("Variety: " + variety);
	         System.out.println("Weight: " + weight );
	         System.out.println("Number of Oranges: " + numoforanges);
	         System.out.println("Taste: " + tasty);
	         System.out.println("Origin: " + origin);
	         System.out.println("Color: " + colour);
	         System.out.println();

	    }

}
