
public class Animal {
	 
     String species;
     int age;
     boolean isHungry;
	int Legs;
	
	void eating(){
		System.out.println();
		
	}
	
	void Running(){
		System.out.println();
		
	}
	void MakingSound(){
		System.out.println();
	}
	void Sleeping(){
		
	}
	
	class Dog extends Animal{
		int colour;
		String gender;
		
		void jumping(){
			System.out.println();
		}
		

	    void bark() {
	        System.out.println("bow bow");
	    }
	    class Lion extends Animal {
	        String maneColor;
	        String roarSound;

	        void roar() {
	            System.out.println("The lion roars");
	        }

	        void hunt() {
	            System.out.println("The lion is hunting.");
	        }
	    }

}
	public static void main(String[] args) {
		 
}
}
