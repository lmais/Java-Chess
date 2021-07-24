//Program: Queen.java
//Purpose: Class to represent Queens
//Author: Laura Maisenhelder
//Date: 7/5/2018

import java.util.ArrayList;
public class Queen extends Pieces
{
	  private String color;
	  private String type;
	  public ArrayList<String> Moves = new ArrayList<String>();	
	  
	public Queen(String color, int x, int y)
	{
		super(color,x,y);
		this.type = "queen"; 
	}

	//move piece on board
	public void possibleMoves(Pieces[][] b)
	{
	try
	{
			
		int x_1 = this.loc_x;
		int x_2 = this.loc_x;
		int y_1 = this.loc_y;
		int y_2 = this.loc_y;
		int x_3 = this.loc_x;
		int x_4 = this.loc_x;
		int y_3 = this.loc_y;
		int y_4 = this.loc_y;
		
		if(x_1 < 7) //if x not at one end of board yet, look for available spaces
		{  
		do
		{
			x_1 = x_1 + 1;
			y_1 = y_1 + 1;

			//if space is open, print coordinates
			if(b[x_1][y_1] == null || b[x_1][y_1].getColor() != this.color)
				{   
					char letter_x = toLetter(x_1);
					String next = Character.toString(letter_x) + Integer.toString(y_1)+" ";
					Moves.add(next);
				}
				
		}
		while(x_1 < 7 && y_1 < 7);
		}
		
		if (x_2 > 0)
		{  
		do
		{
			x_2 = x_2 - 1;
			y_2 = y_2 - 1;

			//if space is open, print coordinates
			if(b[x_2][y_2] == null || b[x_2][y_2].getColor() != this.color)
				{   
					char letter_x = toLetter(x_2);
					String next = Character.toString(letter_x) + Integer.toString(y_2)+" ";
					Moves.add(next);
				}
		}
		while(x_2 > 0 && y_2 > 0);
		}	
		
		
		if(x_3 < 7) //if x not at one end of board yet, look for available spaces
		{  
			do
			{
			x_3 = x_3 + 1;

			//if space is open, print coordinates
			if(b[x_3][this.loc_y] == null || b[x_3][this.loc_y].getColor() != this.color)
				{   
					char letter_x = toLetter(x_3);
					String next = Character.toString(letter_x) + Integer.toString(this.loc_y)+" ";
					Moves.add(next);
				}
			else
			{
					break;
			}
			
			}
			while(x_3 < 7);
			

		}	
		
		if (x_4 > 0)
		{  
			do
			{
			x_4 = x_4 - 1;

			//if space is open, print coordinates
			if(b[x_4][this.loc_y] == null || b[x_4][this.loc_y].getColor() != this.color)
				{   
					char letter_x = toLetter(x_4);
					String next = Character.toString(letter_x) + Integer.toString(this.loc_y)+" ";
					Moves.add(next);
				}
			else
			{
					break;
			}
			}
			while(x_4 > 0);	
		}			
		
		if (y_3 < 7) //if y not at one end of board yet, look for available spaces
		{  
			do
			{
			y_3 = y_3 + 1;

			//if space is open, print coordinates
			if(b[this.loc_x][y_3] == null || b[this.loc_x][y_3].getColor() != this.color)
				{   
					char letter_x = toLetter(this.loc_x);
					String next = Character.toString(letter_x) + Integer.toString(y_3)+" ";
					Moves.add(next);
				}
			else
			{
					break;
			}
			}
			while(y_3 < 7);
		}
		
		if (y_4 > 0)
		{  
			do
			{
			y_4 = y_4 - 1;

			//if space is open, print coordinates
			if(b[this.loc_x][y_4] == null || b[this.loc_x][y_4].getColor() != this.color)
				{   
					char letter_x = toLetter(this.loc_x);
					String next = Character.toString(letter_x) + Integer.toString(y_4)+" ";
					Moves.add(next);
				}
			else
			{
					break;
			}
			}
			while(y_4 > 0);	
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