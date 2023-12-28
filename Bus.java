

public class Bus {
	
	static int numdrivers=1;
	static String fuelnmae="diesel";
	static int numengiens=2;
	
	int numofseats;
	String busnames;
	int numofmirrors;
	String ownerName;
	
	
	Bus(int numofseats,String busnames ,int numofmirrors ,String ownerName)
	{
		 this.numofseats = numofseats;
	        this.busnames = busnames;
	        this.numofmirrors = numofmirrors;
	        this.ownerName = ownerName;
		
		
	}
	void displayBusValues() {
        System.out.println("Number of Seats: " + numofseats);
        System.out.println("Bus Name: " + busnames);
        System.out.println("Number of Mirrors: " + numofmirrors);
        System.out.println("Owner Name: " + ownerName);
        System.out.println("Number of Drivers: " + numdrivers);
        System.out.println("Fuel Name: " + fuelnmae);
        System.out.println("Number of Engines: " + numengiens);
        System.out.println("----------------------------");
    }
	public static void main(String[] args) {
		Bus bus1 = new Bus(30, "City Express", 5, "arjun");
        Bus bus2 = new Bus(40, "iravat", 7, " Smith");
        
        bus1. displayBusValues();
        bus2.  displayBusValues();
        

		
	}
}
