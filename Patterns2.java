

public class Patterns2 {
	
	static void Triangle(){
		
		int n=5;
		for(int i=0;i<=n;i++){
			for(int k=0;k<(n-1)-i;k++)
			{
				System.out.print(" ");
			}
			for(int j=0;j<=i;j++){
				System.out.print("* ");
			}
			System.out.println();
		}
		
	}
	
static void Trianglehallow(){
		
		int n=5;
	for(int i=0;i<=n;i++){
		for(int k=0;k<(n-1)-i;k++)
		{
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++){
			if(j==0||j==i||i==n-1){
			System.out.print("* ");
		}
			else{
	            	System.out.println("  ");
			    }
	       }
	
      }
  }


  static void numbers(){
    	 int n=5;
         for(int i=1;i<=n;i++){
        	for(int j=i;j<=n;j++){
    		System.out.print(j+1+" ");
     	}
     	System.out.println();
      }
}
  
  
  static void numberscount(){
		 int n=5;
		 int count=1;
     for(int i=1;i<=n;i++){
     	for(int j=i;j<=(2*i)-1;j++){
     		System.out.print(j);
     	}
     	System.out.println();
     }
	}
  
  static void downStar(){
 	 int n=5;
      for(int i=1;i<=n;i++){
     	for(int j=i;j<=n;j++){
 		System.out.print("* ");
  	}
  	System.out.println();
   }
}
  static void downStarnum(){
	 	 int n=5;
	      for(int i=1;i<=n;i++){
	     	for(int j=i;j<=n;j++){
	 		System.out.print(i);
	  	}
	  	System.out.println();
	   }
	}
  
  static void downStarnum1(){
	 	 int n=5;
	 	 int count=1;
	      for(int i=1;i<=n;i++){
	     	for(int j=i;j<=n;j++){
	 		System.out.print(count++ );
	  	}
	  	System.out.println();
	   }
	}
  
  static void squarenum(){
		 int n=5;
     for(int i=1;i<=n;i++){
     	for(int j=1;j<=n;j++){
     		System.out.print(i);
     	}
     	System.out.println();
     }
	}
  static void squarenum1(){
		 int n=5;
		 int count=1;
		 for(int i=1;i<=n;i++){
			 
		     	for(int j=1;j<=n;j++){
		     		
		     	System.out.print(count++ +" ");
		     	}
		     	System.out.println();
		     }
			}
  
  static void squarenum3(){
		 int n=5;
  for(int i=1;i<=n;i++){
  	for(int j=1;j<=n;j++){
  		System.out.print(j);
  	}
  	System.out.println();
  }
	}
  
  static void squarenum4(){
		 int n=5;
		 int count;
       for(int i=0;i<n;i++){
	    count=i+1;
	   for(int j=0;j<n;j++){
		System.out.print(count++);
     	}
    	System.out.println();
       }
	 }

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//Patterns2.Triangle();
		//Patterns2.Trianglehallow();
		//3rd pattern instead of * j+1 is to print num
		//Patterns2.numbers();
		//Patterns2.numberscount();
		//Patterns2.downStar();
		//Patterns2.downStarnum();
		//Patterns2.downStarnum1();
		//Patterns2.squarenum();
	    //Patterns2.squarenum1();
	   // Patterns2.squarenum3();  
	 	 Patterns2.squarenum4();  



	}
	

}
