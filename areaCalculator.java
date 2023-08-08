import java.util.Scanner;

public class triangle {

	public static void main(String[] args) {
		
		System.out.println("Activity 1.1");
		System.out.println("Program by: Chelsea Kate M. Lipnica");
		System.out.println("BSIT 2 - 1");
		
		
		Scanner user = new Scanner(System.in);
		int input;
		
		do {
		
		System.out.println("-----------------------------------------");   
       	System.out.println("Enter base: ");
       	double base= user.nextDouble();

      		System.out.println("Enter height: ");
      		double height= user.nextDouble();

    		double area=(base*height)/2;
    	
    		System.out.println("The area is: " + area); 
    		System.out.println("-----------------------------------------");
    	
    		System.out.println("Compute again? type 1 for yes, 0 for no. ");
    	
    		input = user.nextInt();
   	
		} while(input == 1);
		
		System.out.println("-----------------------------------------");
		System.out.println("End of program");
		System.out.println("Thank you for using my program!");
	}

}