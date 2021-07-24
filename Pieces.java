//Program: Pieces
//Purpose: Abstract class to represent chess pieces
//Author: Laura Maisenhelder
//Date: 7/5/2018
import java.util.ArrayList;
import java.util.*;
abstract public class Pieces
{ 
	  //declare variables
	  public String this_king;
	  private String color;
	  private String type;
	  public int loc_x = 0;  //x is up/down
	  public int loc_y = 0;  //y is left/right
	  public char letter;
	  char[] Letters = new char[]{'a','b','c','d','e','f','g','h'};
	  public ArrayList<String> Moves = new ArrayList<String>();		  
	  //constructor
	  
	  public Pieces(String color, int x, int y)
	  {
		 this.color = color;
		 this.loc_x = x;
		 this.loc_y = y-1;
	  }
	  
	  //accessors
	  public String getColor()
	  {
		  return color;
	  }
	  
	  public String getType()
	  {
		  return type;
	  }

	  
	  //mutators
	  public void setColor(String theColor)
	  {
		  color = theColor;
	  }
	  
	  public void setType(String theType)
	  {
		  type = theType;
	  }

	public void setX(int x)
	{
		this.loc_x = x;
	}

	 
	public void setY(int y)
	{
		this.loc_y = y;
	}
	
	  public char toLetter(int x)
	  {
		  letter = Letters[x];
		  return letter;
	  }
	  
	  public abstract void possibleMoves(Pieces[][] b);
	  
	  
    
		  
}

	