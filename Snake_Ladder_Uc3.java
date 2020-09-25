package abc;

public class Snake_Ladder_Uc3 
{
	public static final int IS_SAFE=0;
	public static final int IS_LADDER=1;
	
	public static void main(String[] args)
	{
		//variable
		
		int startPosition=0;
		
		System.out.println("Starting position : "+startPosition);
		//Random to get number between 1 to 6
	    int DieRolls=(int)Math.floor((Math.random()*6 +1));  
	    
	    System.out.println("You get : "+DieRolls);
	    //Random to check for option
	    int checkOption =(int)Math.floor(Math.random()*3);   
	    System.out.println("Check for option : "+ checkOption);
	    switch(checkOption){
		    case IS_SAFE:
		         break;
		    case IS_LADDER:{
			     startPosition=startPosition+DieRolls;  
		         break;
		     }
		    default:{
				   startPosition=startPosition-DieRolls;
		     }
		}
	}

}
