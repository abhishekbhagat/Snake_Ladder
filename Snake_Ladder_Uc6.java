package abc;

public class Snake_Ladder_Uc6
{
	public static final int IS_SAFE=0;
	public static final int IS_LADDER=1;
	public static void main(String[] args){
		 //variable
		 int startPosition=0;
		 int CountNoOfTime=0;
		 while(true){		
			System.out.println("Starting position : "+startPosition);
		    int DieRolls=(int)Math.floor((Math.random()*6 +1));
		    System.out.println("You get : "+DieRolls);
		    //Random to check for option
		    int checkOption =(int)Math.floor(Math.random()*3); 
		    System.out.println("Check for option : "+ checkOption);
		    switch(checkOption){
			    case IS_SAFE:
			         break;
			    case IS_LADDER:{
				      if(startPosition+DieRolls<=100)
				      {	 
			            startPosition=startPosition+DieRolls;
				      }
			          break;
			     }
			    default:{
				    if(startPosition-DieRolls<0)
				    	startPosition=0;
			  	    else
					   startPosition=startPosition-DieRolls;
			     }
			}
		    CountNoOfTime++;
		    System.out.println("Postion of Player after: "+ CountNoOfTime+
		    " Die Roll ="+startPosition);
		    if(startPosition==100)
		      break;  
		 }
	  System.out.println("Total number of times the dice was played to win the game: "
	  + CountNoOfTime);
	}
}
