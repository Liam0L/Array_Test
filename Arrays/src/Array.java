import java.util.Scanner;


public class Array 
{
	public static void main(String[] args) {
		
		try (//create scanner object.
		Scanner input = new Scanner(System.in)) {
			//Initialize Variables to zero, for cycling through array
			 int count = 0, x = 0, num =0;
			 
			 //Initialize array
			 int arr[] = new int[5];

			 //While in the array.  
			 while (x < arr.length) {
				 
				 //Take in number input from user.
			     System.out.println("Enter number: ");
			     num = input.nextInt();

			     //check if within range 10 - 100
			     if ((num >= 10) && (num <= 100)) {
			            
			        	//set duplicate variable to false and increment
			    	 	boolean duplicate = false;
			            x++;
			            
			            //Check for duplicate 
			            for (int i = 0; i < arr.length; i++) 
			             {   if (arr[i] == num)     
			                 duplicate = true;
			             }  
			        
			        //if not a duplicate insert number into the array.
			        if (!duplicate) {

			                arr[count] = num;
			                count++;
			                } 

			        //If duplicate print error message.
			        else
			        System.out.println("This is a duplicate number. Please try again\n");

			         }
			         
			         //If not in range print error message
			         else
			         System.out.println("Number must be between 10 and 100");

			     	//Print the array within the while loop
			        for (int i = 0;  i < x; i++) {
			        	
			        	if(arr[i]!=0) {
			            System.out.print(arr[i] +" ");
			        	}
			        }
			        //print new line
			        System.out.println();  
			    } //end while
		}

	  } 
} 
