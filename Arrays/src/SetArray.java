import java.util.*;

public class SetArray {
	
	public static void main(String[] args) {

     try (
    	//Create Scanner Object
    	Scanner input = new Scanner(System.in)) {
		//Create Set Object
		Set<Integer> set = new HashSet<Integer>();
		 
		 //Initialize Variables
		 int arr[] = new int[5];
		 int x = 0, num = 0;
		 
		 //Enter while Loop
		 while (x < arr.length) {
			 
			 //Take in number from console and store as num	 
			 System.out.println("Enter number: ");
			 num = input.nextInt();
		 
			 //check if num in range 10 - 100
			 if ((num >= 10) && (num <= 100)) {
		 
				 //Add num to set and iterate while loop
				 set.add(num);
				 x++;
		 
				 //Print out the set
				 System.out.println(set);
				 System.out.println();
			 } 
		 
		 //If not in Range print Error
		 else
			 System.out.println("Number not in Range 10 - 100");
		 }
	}
	}	 
}	 