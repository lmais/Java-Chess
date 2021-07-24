//Program: Rook.java
//Purpose: Class to represent Rooks
//Author: Laura Maisenhelder
//Date: 7/5/2018

import java.util.ArrayList;
public class Rook extends Pieces
{
	  private String color;
	  private String type;
	  public ArrayList<String> Moves = new ArrayList<String>();	
	 
	//constructor
	public Rook(String color, int x, int y)
	{
		super(color,x,y);
		this.type = "rook"; 
	}



	//move piece on board
	public void possibleMoves(Pieces[][] b)
	{
		try{
			
		int x_1 = this.loc_x;
		int x_2 = this.loc_x;
		int y_1 = this.loc_y;
		int y_2 = this.loc_y;
		
		if(x_1 < 7) //if x not at one end of board yet, look for available spaces
		{  
			do
			{
			x_1 = x_1 + 1;

			//if space is open, print coordinates
			if(b[x_1][this.loc_y] == null || b[x_1][this.loc_y].getColor() != this.color)
				{   
					char letter_x = toLetter(x_1);
					String next = Character.toString(letter_x) + Integer.toString(this.loc_y)+" ";
					Moves.add(next);
				}
			else
			{
					break;
			}
			
			}
			while(x_1 < 7);
			

		}	
		
		if (x_2 > 0)
		{  
			do
			{
			x_2 = x_2 - 1;

			//if space is open, print coordinates
			if(b[x_2][this.loc_y] == null || b[x_2][this.loc_y].getColor() != this.color)
				{   
					char letter_x = toLetter(x_2);
					String next = Character.toString(letter_x) + Integer.toString(this.loc_y)+" ";
					Moves.add(next);
				}
			else
			{
					break;
			}
			}
			while(x_2 > 0);	
		}			
		
		if (y_1 < 7) //if y not at one end of board yet, look for available spaces
		{  
			do
			{
			y_1 = y_1 + 1;

			//if space is open, print coordinates
			if(b[this.loc_x][y_1] == null || b[this.loc_x][y_1].getColor() != this.color)
				{   
					char letter_x = toLetter(this.loc_x);
					String next = Character.toString(letter_x) + Integer.toString(y_1)+" ";
					Moves.add(next);
				}
			else
			{
					break;
			}
			}
			while(y_1 < 7);
		}
		
		if (y_2 > 0)
		{  
			do
			{
			y_2 = y_2 - 1;

			//if space is open, print coordinates
			if(b[this.loc_x][y_2] == null || b[this.loc_x][y_2].getColor() != this.color)
				{   
					char letter_x = toLetter(this.loc_x);
					String next = Character.toString(letter_x) + Integer.toString(y_2)+" ";
					Moves.add(next);
				}
			else
			{
					break;
			}
			}
			while(y_2 > 0);	
		}
		
/*		else
		{
			System.out.println("No available moves");
		}
*/		
		
		
		
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