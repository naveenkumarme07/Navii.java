
public class AirConditioner {
	 String brand;
     int powerConsumption;
    String color;
    double price;
     boolean isItDualClimate;
	int Warrantry;
	
	 AirConditioner(String brand, int  powerConsumption, String color,  double price, boolean isItDualClimate,int Warrantry) {
	 this(brand, powerConsumption,color,price,isItDualClimate);
	 this.Warrantry=Warrantry;
	System.out.println("numbr of 6 parameter");
	}
	 AirConditioner(String brand, int  powerConsumption, String color, double price, boolean isItDualClimate) {
		 this(brand, powerConsumption,color,price);
		 this.price=price;
			System.out.println("numbr of 5 parameter");

	 }
    AirConditioner(String brand, int powerConsumption, String color,double price) {
    	this(brand,powerConsumption, color);
    	this.price=price;
    	System.out.println("numbr of 4 parameter");

		 
	 } AirConditioner(String brand, int powerConsumption,String color) {
		 this(brand,powerConsumption);
		 this.color=color;
			System.out.println("numbr of 3 parameter");

	 
     }
    AirConditioner(String brand, int powerConsumption) {
		 this(brand);
	 this.brand=brand;
		System.out.println("numbr of 2 parameter");

	 }
    AirConditioner(String brand){
    	System.out.println("numbr of 1 parameter");

    	
	 
    }
    AirConditioner(){
    	System.out.println("numbr of 0 parameter");

    	
    }
   

	public void printacdetailsAc(){
		
		System.err.println("brandNamr:"+ brand);
		System.err.println("powerconsumtion:"+);
		System.err.println("colour:"+color);
		System.err.println("price:"+price);
		System.err.println("isDualClimate"+isItDualClimate);

     }

	
	public static void main(String[] args) {
		 String brand;
	     int powerConsumption;
	    String color;
	    double price;
	     boolean isItDualClimate;
		int Warrantry;
		
		AirConditioner ac1=new AirConditioner("cooler",52,"red",256,true,2);
		AirConditioner ac2=new AirConditioner("cooler",52,"treem",256,true,2);
		AirConditioner ac3=new AirConditioner("cooler",52,"green",256,true,2);
		AirConditioner ac4=new AirConditioner("cooler",52,"yellow",5698,true,2);
		AirConditioner ac5=new AirConditioner("cooler",52,"red",568,false,2);
		//AirConditioner ac6=new AirConditioner();
		//AirConditioner ac7=new AirConditioner();
		
		ac1.printacdetailsAc();
		ac2.printacdetailsAc();
		ac3.printacdetailsAc();
		ac4.printacdetailsAc();
		ac5.printacdetailsAc();
		
		
	}

}
