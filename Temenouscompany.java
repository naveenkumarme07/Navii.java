

public class Temenouscompany {

        static int numofworking = 8;
        static String founder="rama";
        static String uniform="green";
        
        int numofemp;
        int salary;
        String magaername;
        int numofflore;
        
        Temenouscompany(int numofemp, int salary, String managername, int numofflore) {
            this.numofemp = numofemp;
            this.salary = salary;
            this.magaername = managername;
            this.numofflore = numofflore;
     }
     public void printValues() {
         System.out.println("Static Variables:");
         System.out.println("Number of working hours: " + numofworking);
         System.out.println("Founder: " + founder);
         System.out.println("Uniform: " + uniform);

         System.out.println("Non-Static Variables:");
         System.out.println("Number of Employees: " + numofemp);
         System.out.println("Salary: salary" + salary);
         System.out.println("Manager Name: " + magaername);
         System.out.println("Number of Floors: " + numofflore);
     }
        

    public static void main(String[] args) {
    	Temenouscompany myCompany = new Temenouscompany(100, 50000, "bob", 5);
    	Temenouscompany myCompany2 = new Temenouscompany(90, 89000, "navi", 8);

    	 myCompany.printValues();
    	 
    	 Temenouscompany.numofworking=8;
    	 Temenouscompany myCompany3= new Temenouscompany(100, 50000, "bob", 5);


    }

    
    }

