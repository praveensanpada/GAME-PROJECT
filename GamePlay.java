
package com.play.game;
import java.util.Scanner;
import java.lang.Math;
import java.util.Random;

public class GamePlay {
 
	Random rand = new Random();                          //random number generator
	Scanner in = new Scanner(System.in);                 //input 
	int player1,player2,player3,player4;                 //players
	String pl1,pl2,pl3,pl4;                              //player name
	int p1=0,p2=0,p3=0,p4=0;                             //count winning
	String arr[] = {"paper", "rock", "scissor"};         //game demo card
	
	public void play()
	{
		System.out.println("\n\n-------------------------------------------------------------------------");
		System.out.println("			ROCK PAPER SCISSOR GAME\n");
	    System.out.println("			ENTER THE NAME OF PLAYERS(4)\n");
	    System.out.print("			PLAYER FIRST:- ");
		pl1 = in.nextLine();
		System.out.print("			PLAYER SECOND:- ");
		pl2 = in.nextLine();
		System.out.print("			PLAYER THIRD:- ");
		pl3 = in.nextLine();
		System.out.print("			PLAYER FOURTH:- ");
		pl4 = in.nextLine();
		System.out.println("\n\n-------------------------------------------------------------------------");
		System.out.println("ROUND\\PLAYER	"+pl1+"		"+pl2+"		"+pl3+"		"+pl4);
		System.out.println("-------------------------------------------------------------------------");
		for(int i=1; i<=50; i++)
		{
			player1 = rand.nextInt(3); 
			player2 = rand.nextInt(3); 
			player3 = rand.nextInt(3); 
			player4 = rand.nextInt(3); 
			System.out.println(i+")		"+arr[player1]+"		"+arr[player2]+"		"+arr[player3]+"		"+arr[player4]);
		
			//----------------------------------------------- logic --------------------------------------
			if(((player1 == 0 && player2 == 1)||(player1 == 1 && player2 == 2)||(player1 == 2 && player2 == 0)) && ((player1 == 0 && player3 == 1)||(player1 == 1 && player3 == 2)||(player1 == 2 && player3 == 0)) && ((player1 == 0 && player4 == 1)||(player1 == 1 && player4 == 2)||(player1 == 2 && player4 == 0)))
			{
				p1++;
			}
			else if(((player2 == 0 && player1 == 1)||(player2 == 1 && player1 == 2)||(player2 == 2 && player1 == 0)) && ((player2 == 0 && player3 == 1)||(player2 == 1 && player3 == 2)||(player2 == 2 && player3 == 0)) && ((player2 == 0 && player4 == 1)||(player2 == 1 && player4 == 2)||(player2 == 2 && player4 == 0)))
			{
				p2++;
			}
			else if(((player3 == 0 && player1 == 1)||(player3 == 1 && player1 == 2)||(player3 == 2 && player1 == 0)) && ((player3 == 0 && player2 == 1)||(player3 == 1 && player2 == 2)||(player3 == 2 && player2 == 0)) && ((player3 == 0 && player4 == 1)||(player2 == 1 && player4 == 2)||(player3 == 2 && player4 == 0)))
			{
				p3++;
			}
			else if(((player4 == 0 && player1 == 1)||(player4 == 1 && player1 == 2)||(player4 == 2 && player1 == 0)) && ((player4 == 0 && player2 == 1)||(player4 == 1 && player2 == 2)||(player4 == 2 && player2 == 0)) && ((player4 == 0 && player3 == 1)||(player4 == 1 && player3 == 2)||(player4 == 2 && player3 == 0)))
			{
				p4++;
			}
			else{
			}
		}
			System.out.println("\n\n-------------------------------------------------------------------------");
			System.out.println("TOTAL		"+p1+"		"+p2+"		"+p3+"		"+p4);
			System.out.println("-------------------------------------------------------------------------\n\n\n");
			//-------------------------------------------- count ------------------------------------------------------------------------------------
			if((p1>p2)&&(p1>p3)&&(p1>p4))
			{
				System.out.println("			"+pl1+" WON THE GAME");
			}
			else if((p2>p1)&&(p2>p3)&&(p2>p4))
			{
				System.out.println("			"+pl2+" WON THE GAME");
			}
			else if((p3>p1)&&(p3>p2)&&(p3>p4))
			{
				System.out.println("			"+pl3+" WON THE GAME");
			}
			else if((p4>p1)&&(p4>p2)&&(p4>p3))
			{
				System.out.println("			"+pl4+" WON THE GAME");
			}
			else
			{
				System.out.println("			 MATCH DRAW");
			}	
		System.out.println("\n\n-------------------------------------------------------------------------");
	}
}