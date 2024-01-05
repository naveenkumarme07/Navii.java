

public class Dayy14 {
    static int countOccur(String name, char characterToCount) {
        int count = 0;

        for (int i = 0; i < name.length(); i++) {
            if (name.charAt(i) == characterToCount) {
                count++;
            }
        }

        return count;
    }
     
    public void reverse(){
    	String nm="naveeenkumar";
    	String rv="";
    	for ( int i=  nm.length()-1; i>0;i--) {
    		rv=rv+nm.charAt(i);
    	
    }
    	System.out.println(rv);
    	
    }
    public static void main(String[] args) {
        String name = "naveeen kumaar";
        char characterToCount = 'e';

        int result = countOccur(name, characterToCount);
        System.out.println(result);
        
        Dayy14 obj =new Dayy14();
        obj.reverse();
       
  	  }
  	  
  	  
    }
  
        
    

