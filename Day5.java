
public class Day5{
	  public static void main(String[] args) {
		                                       // downcasting type   

  byte smallervalve = 10;
  short y = smallervalve;
 System.out.println("smallervalve;" +smallervalve);
 
   short largerbyte=1000;
   int y1=largerbyte;
  System.out.println("largerbyte" +largerbyte);
  
  int num1=100009;
  long num2=num1;
  System.out.println("num2:"+num2);
  
  long num3 =261656518;
 float num4=num3;
  System.out.println(num4);
  
 float num5=156.897f;
 double num7=num5;
 System.out.println(num7);
                                               // upcasting
  char num9='n';
  byte num11=(byte) num9;
  System.out.println(num9);
  
  int largerValue = 1000;
    short smallerValue = (short) largerValue; 
    System.out.println(smallerValue);
    
  long longValue = 123456789L;
  int intValue = (int) longValue; 
  System.out.println("Int value: " + intValue);

  double doubleValue = 123.456;
  float floatValue = (float) doubleValue;
  System.out.println("Float value: " + floatValue);

  int asciiValue = 65;
  char charValue = (char) asciiValue; 
  System.out.println("Char value: " + charValue);

  boolean booleanValue = true;
  System.out.println("Boolean value: " + booleanValue);
  
}
}

  
  
  
  
  
  
  


