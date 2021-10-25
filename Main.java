package game;
import java.util.Scanner;
import java.util.Random;
public class Main {

	static int userInput;	
	 static int computerInput; 
	static int computerScore ;
	 static int userScore ;
	
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
		int count = 0;
        System.out.println(" Instructions are given below:\n Type 0,1,2 or R,P,S \n 0: for Rock \n 1: for Paper \n 2: for Scissors \n" );	
		
		System.out.println("Enter  a number of round you want to play with computer ");
		int noOfTurns= sc.nextInt();
        for (int i=1 ;i<= noOfTurns; i++)
        {
        	System.out.println("Round " + i);
        	System.out.println("UserScore : " + userScore + " ComputerScore: " + computerScore);
            game();	
        	count++;
        }
		if (count == noOfTurns)
		{
			System.out.println("Game Over ");
			System.out.println("All "+ noOfTurns + " rounds were completed :");
	        System.out.println("Final Score:" + "UserScore: " + userScore  + " ComputerScore:" + computerScore  );
	        if (userScore > computerScore)
	        {
	        	System.out.println("User Win This Game "  );
	        }
	        else if(userScore < computerScore)
	        {
	        
	        System.out.println(" Computer Win This Game");
	        	
	        }
	        
	        else
	        {
	        	System.out.println("Draw! Try More Round");
	        }
	        	
		}
	
		
	}
	
	public  static void  userInput()
	
	{

     	    Random rand = new Random();
   	        computerInput =  rand.nextInt(3);
		    Scanner sc= new Scanner(System.in);
	        System.out.println("Enter a number here as instruct in above\n");
	       try
	       {
	        userInput = sc.nextInt();
	        
	       }
	       catch (Exception e)
	       {
	    	   System.out.println(" Read the instrucctuons properly \n Programs Terminated");
	    	   System.exit(0);
	       }
		
	}
	
     public static void game()
    
     {
          userInput();
     
        
        if (userInput == computerInput)
        {
         System.out.println("Draw between Computer and User\n");
        	
        }
        
        else if (userInput == 0 && computerInput == 2 )
        {
         
            System.out.println("UserInput = Rock  & computerInput = Scissors\n" );
        	System.out.println("User Won\n");
            userScore++;      	
        }
        
        else if (userInput == 1 && computerInput == 0)
        {
        	   System.out.println("UserInput = Paper  & computerInput = Rock\n" );
           	   System.out.println("User Won\n");
           	  userScore++;
        }
        
        else if (userInput == 2 && computerInput == 1)
        {

     	   System.out.println("UserInput = Scissors   & computerInput = Paper\n" );
        	   System.out.println("User Won\n");
        	   userScore++;
        }
       
        	
        	
         else if (userInput == 2 && computerInput == 0)
        	
          {
               System.out.println("UserInput = Scisors & computerInput = Rock\n");
               System.out.println("Computer Won\n");  
               computerScore++;
          }
        
         else if (userInput == 0 && computerInput == 1)
         {
        	 System.out.println("UserInput = Rock & computerInput = Paper\n");
             System.out.println("Computer Won\n");   
             computerScore++;
         }
         
         else if (userInput == 1  && computerInput == 2)
         {
        	 System.out.println("UserInput = Paper & computerInput = Scissors\n");
        	 System.out.println("Computer Win\n");
        	 computerScore++;
         }
        
         else
         {
        	 System.out.println("Check your input Properly \n Read the instruction properly!!!\n");
         }
}
}