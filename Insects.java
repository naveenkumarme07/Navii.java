package Working;

public class Insects extends LivingOrganism{
	 String species;
     int numLungs;
     
     void flying(){
    	 
     }
     void MakeSound(){
    	 
    	 
     }
     
     class Ladybug extends Insects{
    	 int numSpots;  
         boolean isRed; 
         
         void crawl() {
        	 
         }
         void spreadWings() {
             
         }

     }    
     
     class cockroach extends Insects{
    	 boolean canFly;  
         int numLegs;  
         
         void scurry() {
        	 System.out.println("scurry...........");
         }
         }

         void hideInCracks() {
        	 System.out.println("hidden cracks.............");
        	 
        	
     }
         

}