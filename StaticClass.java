

public class StaticClass {

	public static void main(String[] args) {
		Govtschool mySchool = new Govtschool(500, "ravi", 2, 11);
		Govtschool mySchoo2 = new Govtschool(700, "madhu", 8, 5);

        mySchool.printValues();
  //.......................................................................................
        Temenouscompany myCompany = new Temenouscompany(100, 50000, "bob", 5);
    	Temenouscompany myCompany2 = new Temenouscompany(90, 89000, "navi", 8);

    	 myCompany.printValues();
    	 
    	 Temenouscompany.numofworking=8;
    	 Temenouscompany myCompany3= new Temenouscompany(100, 50000, "bob", 5);
    	 
   //.............................................................................
    	 
    	 Bus bus1 = new Bus(30, "City Express", 5, "arjun");
         Bus bus2 = new Bus(40, "iravat", 7, " Smith");
         
         bus1. displayBusValues();
         bus2.  displayBusValues();
         
           Bus.fuelnmae="petrol";
           Bus bus3 = new Bus(40, "bmtc", 5, " bob");

         bus3.displayBusValues();
         
   //..................................................................
         Orange orange1 = new Orange("Navel", 150, 10);
         Orange orange2 = new Orange("xyz", 180, 8);

         
         orange1.printOrange();
         orange1. printOrange();
         
         orange1.colour="light orabge";
         
         Orange orange6= new Orange("xyz", 200, 6);
         orange6.printOrange();
         
         
    //...............................................................................
         Cricket player1 = new Cricket("Virat Kohli", 18, true);
         Cricket player2 = new Cricket("Rohit Sharma", 45, false);

         player1.displayDetails();
         player2.displayDetails();
         
         Cricket.country="aus";
         Cricket player3 = new Cricket("Jasprit Bumrah", 25, false);
         player3.displayDetails();

         
   //..............................................................
         Toyota car = new Toyota("Camry", 2023, 25000, "Alloy");

         Toyota car1 = new Toyota("Camry", 2022, 45600, "Alloy");
         
         car.displayCarInfo();
         car1.displayCarInfo();
         
         Toyota.averageMileage=78;
         Toyota car2 = new Toyota("vellfire", 2021, 45600, "Alloy");

         
         
   //........................................................................
         Engineering eng = new Engineering("Computer Science", 100, 150, true);
         Engineering eng1 = new Engineering("mech", 56, 15, true);

         eng.displayProgramInfo();
         eng1.displayProgramInfo();
         
         Engineering.durationInYears=5;
         
         Engineering eng2 = new Engineering("civil", 56, 15, true);
    //..................................
         
         Institution xw = new Institution("Programming Course", 50, 10);
         Institution xw1 = new Institution("java Course", 85, 2);

         xw1 .displayInstitutionInfo();
         xw.displayInstitutionInfo();
         
         Institution.durationmonth=4;
         Institution xw2= new Institution("python Course", 50, 6);
    //...................................................................

         OppoPhone opp = new OppoPhone("Find X", 128, 6, true);
         OppoPhone opp1 = new OppoPhone("Reno2", 256, 6, false);

         opp.displayPhoneInfo();

         opp1.displayPhoneInfo();
         
         OppoPhone.brand=" oppupdated";
         OppoPhone opp2 = new OppoPhone("Reno2", 256, 6, false);
             opp2.displayPhoneInfo();
	}   
      

	}


