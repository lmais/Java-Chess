//Program: Knight.java
//Purpose: Class to represent Knights
//Author: Laura Maisenhelder
//Date: 7/5/2018

import java.util.ArrayList;
public class Knight extends Pieces
{
	  private String color;
	  private String type;
	  public ArrayList<String> Moves = new ArrayList<String>();		  
	  
	public Knight(String color, int x, int y)
	{
		super(color,x,y);
		this.type = "knight"; 
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
		
		if(x_1 < 5) //if x not at one end of board yet, look for available spaces
		{  
		do
		{
			x_1 = x_1 + 1;
			y_1 = y_1 + 2;

			//if space is open, print coordinates
			if(b[x_1][y_1] == null || b[x_1][y_1].getColor() != this.color)
				{   
					char letter_x = toLetter(x_1);
					String next = Character.toString(letter_x) + Integer.toString(y_1)+" ";
					Moves.add(next);
				}
				
		}
		while(x_1 < 5 && y_1 < 5);
		}
		
		if (x_2 > 1)
		{  
		do
		{
			x_2 = x_2 - 1;
			y_2 = y_2 - 2;

			//if space is open, print coordinates
			if(b[x_2][y_2] == null || b[x_2][y_2].getColor() != this.color)
				{   
					char letter_x = toLetter(x_2);
					String next = Character.toString(letter_x) + Integer.toString(y_2)+" ";
					Moves.add(next);
				}
		}
		while(x_2 > 1 && y_2 > 1);
		}			
		
		if(y_3 < 5) //if x not at one end of board yet, look for available spaces
		{  
		do
		{
			x_3 = x_3 - 1;
			y_3 = y_3 + 2;

			//if space is open, print coordinates
			if(b[x_3][y_3] == null || b[x_3][y_3].getColor() != this.color)
				{   
					char letter_x = toLetter(x_3);
					String next = Character.toString(letter_x) + Integer.toString(y_3)+" ";
					Moves.add(next);
				}
				
		}
		while(x_3 < 5 && y_3 < 5);
		}
		
		if (y_4 > 1)
		{  
		do
		{
			x_4 = x_4 + 1;
			y_4 = y_4 - 2;

			//if space is open, print coordinates
			if(b[x_4][y_4] == null || b[x_4][y_4].getColor() != this.color)
				{   
					char letter_x = toLetter(x_4);
					String next = Character.toString(letter_x) + Integer.toString(y_4)+" ";
					Moves.add(next);
				}
		}
		while(x_4 > 1 && y_4 > 1);
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