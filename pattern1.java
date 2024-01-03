

public class pattern1 {
	static void Triangle(){
		int n=8;
		for(int i=1;i<=n;i++){
			for(int j=1;j<=n;j++){
				System.out.print("*");
			}
			System.out.println();
		}
	}
	
	static void RightTriangle(){
		 int n=5;
         for(int i=1;i<=n;i++){
         	for(int j=1;j<=i;j++){
         		System.out.print("*");
         	}
         	System.out.println();
         }
		
	}
	
	static void Numbers(){
		int n=8;
		for(int i=0;i<=8;i++){
			for(int j=0;j<=8;j++){
				System.out.print(i+1 +" ");
			}
			System.out.println();
		}
	}
	
	static void Numbers1(){
		int n=8;
		for(int i=0;i<=8;i++){
			for(int j=0;j<=8;j++){
				System.out.print(j+1 +" ");
			}
			System.out.println();
		}
	}
	
	
	
	static void Sqare(){
		int n=8;
		for(int i=0;i<=8;i++){
			for(int j=0;j<=8;j++){
				if(i==0||i==8||j==0||j==8){
					System.out.print("*");
					
				}
				else{
					System.out.print(" ");
					
				}
			}
			System.out.println();
		}
	}
	
	
	static void leftTriangle(){
		 int n=5;
        for(int i=1;i<=n;i++){
        	for(int j=i;j<=n;j++){
        		System.out.print("*");
        	}
        	System.out.println();
        }
		
	}
	static void N(){
		int n=8;
		for(int i=0;i<=8;i++){
			for(int j=0;j<=8;j++){
				if(j==0||j==8||j==i){
					System.out.print("*");
					
				}
				else{
					System.out.print(" ");
					
				}
			}
			System.out.println();
		}
	}


	public static void main(String[] args) {
		pattern1.Triangle();
		
		System.out.println("-----------------------------------------------------------");
		
		pattern1 .RightTriangle(); 
		
		System.out.println("..................................................");
		
		pattern1.Numbers();
		
		
		System.out.println("--------------------------------------------------");
		
		pattern1.Numbers1();
		
		System.out.println("///////////////////////////////////////");
		
		pattern1.Sqare();
		
		System.out.println("-------------------------------------------");
		
		pattern1.leftTriangle();
		
		System.out.println("-------------------------------------------");

		pattern1.N();
		
		System.out.println("-------------------------------------------");

		
            
	}
       
}
