 package abc;

public class Snake_Ladder_Uc7
{
	public static final int IS_SAFE=0;
 	public static final int IS_LADDER=1;
 	public static void main(String[] args){
 		//variable
 		 int startPosition_A=0;
 		 int startPosition_B=0;
 		 while(true){		
 			// Starting position before Die Roll of Player A and B
 			System.out.println("Starting position of A : "+startPosition_A);
 			System.out.println("Starting position of B: "+startPosition_B);
 			
 			//Random funtion to get Number between 1 and 6
 		    int DieRolls_A=(int)Math.floor((Math.random()*6 +1));
 		    int DieRolls_B=(int)Math.floor((Math.random()*6 +1));
 		    
 		    
 		    System.out.println("Player 1 get : "+DieRolls_A);
 		    System.out.println("Player 2 get : "+DieRolls_B);
             
 		    //Random to check for option
 		    int checkOption_A =(int)Math.floor(Math.random()*3);
 		    int checkOption_B =(int)Math.floor(Math.random()*3);
 		    
 		   
 		    System.out.println("Check for option for 1st player : "
 		    + checkOption_A);
 		    System.out.println("Check for option for 2ND player : "
 		    + checkOption_B);
 		    switch(checkOption_A){
 			     case IS_SAFE:
 			          break;
 			      
 			     case IS_LADDER:{
 				      if(startPosition_A+DieRolls_A<=100)
 				         {	 
 			                 startPosition_A=startPosition_A+DieRolls_A;
 				         }
 				       //PLAYER 1  GET LADDER SO PLAY AGAIN
 				       while(true)
 				       {
 				    	    int  DieRolls=(int)Math.floor((Math.random()*6 +1));
 				    	    int  checkOption =(int)Math.floor(Math.random()*3);
 				             if(checkOption==0)
 	 			                   break;
 				             else if(checkOption==1)
 				               {
 				        	 
 	 				               if(startPosition_A+DieRolls<=100)
 	 				                {	 
 	 			                        startPosition_A=startPosition_A+DieRolls;
 	 				                 }
 				                }
 				             else
 				              {
 				        	       if(startPosition_A-DieRolls<0)
	 	 				    	       startPosition_A=0;
	 	 			  	           else
	 	 					           startPosition_A=startPosition_A-DieRolls;
 				                break;
 				              }
 	 			        }
 				       break;
 			      }
 			     default:{
 				    if(startPosition_A-DieRolls_A<0)
 				    	startPosition_A=0;
 			  	    else
 					   startPosition_A=startPosition_A-DieRolls_A;
 			     }
 			}
 		    switch(checkOption_B){
                 case IS_SAFE:
 			           break;
 			     case IS_LADDER:{
 				       if(startPosition_B+DieRolls_B<=100){	 
 			            startPosition_B=startPosition_B+DieRolls_B;
 				       }
 				       //PLAYER B GET A LADDER SO PLAY AGAIN
 				       while(true){
				    	   int DieRolls=(int)Math.floor((Math.random()*6 +1));
				    	   int checkOption=(int)Math.floor(Math.random()*3);
				           if(checkOption==0)
	 			                break;
				           else if(checkOption==1) {
	 				            if(startPosition_B+DieRolls<=100){	 
	 			                    startPosition_B=startPosition_B+DieRolls;
	 				             }
				            }
				           else{
				        	    if(startPosition_B-DieRolls<0)
 	 				    	        startPosition_B=0;
 	 			  	            else
 	 					            startPosition_B=startPosition_B-DieRolls;
				             break;
				           }
	 			       }
 			       break;
 			     }
 			    default:{
 				    if(startPosition_B-DieRolls_B<0)
 				    	startPosition_B=0;
 			  	    else
 					   startPosition_B=startPosition_B-DieRolls_B;
 			     }
 			}
 		    if(startPosition_A==100 ||startPosition_B==100)
 		      break;
 		    
 		  }
 		  if(startPosition_A==100&&startPosition_B==100)
 			  System.out.println("Match is tie");
 		  else if(startPosition_A==100 && startPosition_B!=100)
 			  System.out.println("Player 1st win the match");
 		  else 
 			  System.out.println("Player 2nd win the match");
 	   
 	 }
}
