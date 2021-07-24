//Program: Pawn.java
//Purpose: Class to represent Pawns
//Author: Laura Maisenhelder
//Date: 7/5/2018

import java.util.ArrayList;
public class Pawn extends Pieces
{
	private String color;
	private String type;
	public ArrayList<String> Moves = new ArrayList<String>();
	public ArrayList<Integer> Xs = new ArrayList<Integer>();
	public ArrayList<Integer> Ys = new ArrayList<Integer>();

    //constructor
	public Pawn(String color, int x, int y)
	{
		super(color,x,y);
		this.type = "pawn"; 
	}

	
	//move piece on board
	public void possibleMoves(Pieces[][] b)
	{
		try{
			
		int x_1 = this.loc_x;
		int x_2 = this.loc_x;
		
		if(x_1 < 7) //if x not at one end of board yet, look for available spaces
		{  
			x_1 = x_1 + 1;

			//if space is open or opponent, print coordinates
			if(b[x_1][this.loc_y] == null || b[x_1][this.loc_y].getColor() != this.color)
				{   
					Xs.add(x_1);
					Ys.add(this.loc_y);
					char letter_x = toLetter(x_1);
					String next = Character.toString(letter_x) + Integer.toString(this.loc_y)+" ";
					Moves.add(next);
				}
		}
		
		if (x_2 > 0)
		{  
			x_2 = x_2 - 1;

			//if space is open, print coordinates
			if(b[x_2][this.loc_y] == null || b[x_2][this.loc_y].getColor() != this.color)
				{   
					char letter_x = toLetter(x_2);
					String next = Character.toString(letter_x) + Integer.toString(this.loc_y)+" ";
					Moves.add(next);
				}
		}					
		
		else
		{
			System.out.println("No available moves");
		}
	
	
		for(String m : Moves)
		{
			System.out.print(m);
		}			
			
		}
		
		catch(ArrayIndexOutOfBoundsException exception)
		{
			System.out.println("Out of bounds");
		}
	}
	

}	  






