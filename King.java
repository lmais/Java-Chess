//Program: King.java
//Purpose: Class to represent Kings
//Author: Laura Maisenhelder
//Date: 7/5/2018

import java.util.ArrayList;
public class King extends Pieces
{
	  private String color;
	  private String type;
	  public ArrayList<String> Moves = new ArrayList<String>();	
	  
	public King(String color, int x, int y)
	{
		super(color,x,y);
		this.type = "king"; 
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
			x_1 = x_1 + 1;

			//if space is open, print coordinates
			if(b[x_1][this.loc_y] == null || b[x_1][this.loc_y].getColor() != this.color)
				{   
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
		
		if (y_1 < 7) //if y not at one end of board yet, look for available spaces
		{  
			y_1 = y_1 + 1;

			//if space is open, print coordinates
			if(b[this.loc_x][y_1] == null  || b[this.loc_x][y_1].getColor() != this.color)
				{   
					char letter_x = toLetter(this.loc_x);
					String next = Character.toString(letter_x) + Integer.toString(y_1)+" ";
					Moves.add(next);
				}
		}
		
		if (y_2 > 0)
		{  
			y_2 = y_2 - 1;

			//if space is open, print coordinates
			if(b[this.loc_x][y_2] == null || b[this.loc_x][y_2].getColor() != this.color)
				{   
					char letter_x = toLetter(this.loc_x);
					String next = Character.toString(letter_x) + Integer.toString(y_2)+" ";
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