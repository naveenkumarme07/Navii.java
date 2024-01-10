package Working;

public class Domestic extends Animals{

	int Lifespan;
	String foodType;
	
	void eating(){
		
	}
	void sleeping(){
		
	}
	
	
	class cow extends Domestic{
		String colourOfMilk;
		int numOfLegs;
		
		void walking(){
			System.out.println();
		}
	}
	   void takingOxygen(){
		   
	   }
	   
	   class Dog extends Domestic{
		   int colour;
			String gender;
			
			void jumping(){
				System.out.println();
			}
			

		    void bark() {
		        System.out.println("bow bow");
		    }
	   }
}
