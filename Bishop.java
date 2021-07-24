//Program: Bishop.java
//Purpose: Class to represent Bishops
//Author: Laura Maisenhelder
//Date: 7/5/2018
import java.util.ArrayList;
public class Bishop extends Pieces
{
	  public Bishop(String color, int x, int y)
	{
		super(color,x,y);
		this.setType("bishop"); 
	}


	//move piece on board
	public void possibleMoves(Pieces[][] b)
	{ String mycolor = this.getColor();
	try
	{
			
		int x_1 = this.loc_x;
		int x_2 = this.loc_x;
		int y_1 = this.loc_y;
		int y_2 = this.loc_y;
		
		if(x_1 < 7) //if x not at one end of board yet, look for available spaces
		{  
		do
		{
			x_1 = x_1 + 1;
			y_1 = y_1 + 1;

			//if space is open, print coordinates
			                                                  
			if((b[x_1][y_1] == null) || ((b[x_1][y_1] != null) && !(mycolor.equals(b[x_1][y_1].getColor()))))
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
			                      
			if((b[x_2][y_2] == null) || ((b[x_2][y_2] != null) && !(mycolor.equals(b[x_2][y_2].getColor()))))
				{   
					char letter_x = toLetter(x_2);
					String next = Character.toString(letter_x) + Integer.toString(y_2)+" ";
					Moves.add(next);
				}
		}
		while(x_2 > 0 && y_2 > 0);
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

		
		  
