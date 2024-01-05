

public class builtMethods {
	
	
	       

	public static void main(String[] args) {
		
		
        ///// isEqualIgnoreCase
		
        String str1 = "naveen kumar";
        String str2 = "NAVEEN KUMAR";

        
        boolean isEqualIgnoreCase = str1.equalsIgnoreCase(str2);

        System.out.println( isEqualIgnoreCase);
        
        ////  replace
        
        String originalString = "calling, naveen, calling, mobile,calling sir!";

        String replace = originalString.replaceFirst("calling", "hey");

        System.out.println( replace);
        
        /// start and ends with
        
        String name = "Naveen Kumar";

        boolean startsWithNaveen = name.startsWith("Naveen");

        boolean endsWithKumar = name.endsWith("Kumar");

        System.out.println( name);
        System.out.println(startsWithNaveen);
        System.out.println( endsWithKumar);
        
        /// uppercase and lower case
        
        String names="naveenkumar";
        
        String uppercase  =name.toUpperCase();
        
        System.out.println(uppercase);
        
         String temple="SAIBABA";
        
        String lowercse  =name.toLowerCase();
        
        System.out.println(lowercse);
        
        
        /////valueOf
        
        char passingsysmbol = 'P';

        // Using String.valueOf(char)
        String myString = String.valueOf(passingsysmbol);

        System.out.println("Original char: " + passingsysmbol);
        System.out.println("Converted string: " + myString);
        
       
    
      ///// trimmed
		String original = "   Hello, World!   ";
        String trimmed = original.trim();

        System.out.println(trimmed );
        
        ////isemepty
        
        String name1="  ";
        String name2="";
       boolean num3= name1.isEmpty();
       boolean num4= name1.isEmpty();
       System.out.println(num3);
       System.out.println(num4);
       
        ///substring
       
       String st="hey naveen";
       
       String valvue1=st.substring(3);
       System.out.println(valvue1);  
       
       
    }
}
    
    

	


