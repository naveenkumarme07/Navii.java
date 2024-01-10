package Working;

public class Devise {
	    String brand;
	     int year;
	     double price;
     String Founder;
     
     
     public void turnOn() {
         System.out.println("The device is turning on.");
     }

     public void turnOff() {
         System.out.println("The device is turning off.");
     }
     
           void Heating(){
          System.out.println("heating device");
           }
           void playigsongs(){
        	   System.out.println("songs...............");
           }
           
           
           class Mobile extends Devise{
        	   int Disply;
        	   int Ram;
        	   
        	   
        public void makeCall(String phoneNumber) {
       System.out.println("Calling " );
        }
        void Flashon(){
        	
        }
      }
            class Laptap extends Devise{
            	int size;
            	int batterypicup;
            	
            	
          public void runProgram(String programName) {
            System.out.println("Running " );
         	    }

   	    public void connectToWiFi(String networkName) {
   	    	System.out.println("Connecting to WiFi network: " );
            	    }
   	
       }
 }




