//Laura Maisenhelder, CS576, Chess game for testing

import java.util.*;
import java.util.Scanner;


public class boardtest
{ 
		//move the piece to a new space on the board
		public static void setPiece(Pieces p, Pieces[][] b)
		{
			b[p.loc_x][p.loc_y] = p;
		}
			
		//print current board
		public static void printBoard(Pieces[][] game)
		{
			int count = 0;
			System.out.println();
			System.out.println();
			System.out.println("Here is the current game board:");
			System.out.println("-------------------------------");
			for( int i = 0; i < game.length; i++)
			{
				System.out.println();
				for(int j=0; j<game.length; j++)
				{
					count += 1;
					System.out.print(game[i][j]);
				}
			}
		}
			
		//release space (call if space is open)
		public static void release(Pieces p, Pieces[][]b)
		{
			b[p.loc_x][p.loc_y] = null;
		}
		
		//letter axis to number
		public static int toNumber(String s)
		{	int x_int = 0;
			switch(s)
			{
				case "a": x_int = 0; 
							break;
				case "b": x_int = 1;
							break;
				case "c": x_int = 2; 
							break;
				case "d": x_int = 3; 
							break;
				case "e": x_int = 4; 
							break;
				case "f": x_int = 5; 
							break;
				case "g": x_int = 6; 
							break;
				case "h": x_int = 7; 
							break;
				default: System.out.println("second character must be a letter a - h");
			}
			return x_int;
		}
		
		
		
		
/*		public void checkmate_check(Pieces p, Pieces[][] b)
	  {     
	        p.setX(null);
			p.setY(null);
			p.setPiece(board);
			int count = 0;

			for( int i = 0; i < b.length; i++)
			{

				for(int j=0; j < b.length; j++)
				{
					if(b[i][j] != null)
					{
						if(this.type == "king")
						{
							char letter_x = toLetter(i);
							this_king = Character.toString(letter_x) + Integer.toString(j);
						}
					}	
					count += 1;
				}
			}
			
			for( int i = 0; i < b.length; i++)
			{

				for(int j=0; j < b.length; j++)
				{
					if(b[i][j] != null)
					{
						Pieces check_test = b[i][j];
						check_test.possibleMoves(b);
						for(String m : Moves)
						{
							if(m.equals(this_king))
							{
								System.out.println("King is in check");
							}
						}
					}	
					count += 1;
				}
			}
		}
	*/		
//************************************************************************************************************************************	
//MAIN METHOD
	public static void main(String[] args)
	{ 
		Pieces[][] board = new Pieces[8][8];
		ArrayList<String> PiecesOnBoard = new ArrayList<String>();

		
	//Prompt for white piece positions	
		System.out.println("Enter the white piece positions in format like Pa2 for Pawn to a2, separate multiple pieces with commas, no spaces: ");
		Scanner wscan = new Scanner(System.in);
		String white_start = wscan.nextLine();
		String[] wStart = new String[8];
		wStart = white_start.split(","); //split input for each piece
		for(int i= 0; i < wStart.length; i++)
		{  
			//PiecesOnBoard.add(wStart[i]);
			String wtype = wStart[i].substring(0,1); //get first letter for piece type
			
			String xAxis = wStart[i].substring(1,2); //change letter into int for x axis
			int x = toNumber(xAxis);
			
			int yAxis = Integer.parseInt(wStart[i].substring(2)); //get y axis
			
			switch(wtype) //create pieces
			{
				case "P": Pawn p = new Pawn("white",x,yAxis);
						  setPiece(p,board);  
						  p.setX(x);
						  p.setY(yAxis);
						  break;
				case "R": Rook r = new Rook("white",x,yAxis);
						  setPiece(r,board);
						  r.setX(x);
						  r.setY(yAxis);
						  break;
				case "B": Bishop b = new Bishop("white",x,yAxis);
						  setPiece(b,board);
						  b.setX(x);
						  b.setY(yAxis);
						  break;
				case "N": Knight n = new Knight("white",x,yAxis);
						  setPiece(n,board);
						  n.setX(x);
						  n.setY(yAxis);
						  break;
				case "Q": Queen q = new Queen("white",x,yAxis);
						  setPiece(q,board);
						  q.setX(x);
						  q.setY(yAxis);
						  break;
				case "K": King k = new King("white",x,yAxis);
						  setPiece(k,board);	
						  k.setX(x);
						  k.setY(yAxis);
				default: System.out.println("First letter must be P,R,B,N,Q or K");
			}		
		} 
	printBoard(board);	
	System.out.println();
	System.out.println();

	
	//Prompt for black piece positions	
		System.out.println("Enter the black piece positions: ");
		Scanner bscan = new Scanner(System.in);
		String black_start = bscan.nextLine();
		String[] bStart = new String[8];
		bStart = black_start.split(","); //split input for each piece
		for(int i= 0; i < bStart.length; i++)
		{   
	       // PiecesOnBoard.add(bStart[i]);
			String btype = bStart[i].substring(0,1); //get first letter for piece type
			
			String xAxis = bStart[i].substring(1,2); //change letter into int for x axis
			int x = toNumber(xAxis);
			
			int yAxis = Integer.parseInt(bStart[i].substring(2)); //get y axis
			
			switch(btype) //create pieces
			{
				case "P": Pawn p = new Pawn("black",x,yAxis);
						  setPiece(p,board);
						  p.setX(x);
						  p.setY(yAxis);
						  break;
				case "R": Rook r = new Rook("white",x,yAxis);
						  setPiece(r,board);
						  r.setX(x);
						  r.setY(yAxis);
						  break;
				case "B": Bishop b = new Bishop("white",x,yAxis);
						  setPiece(b,board);
						  b.setX(x);
						  b.setY(yAxis);
						  break;
				case "N": Knight n = new Knight("black",x,yAxis);
						  setPiece(n,board);
						  n.setX(x);
						  n.setY(yAxis);
						  break;
				case "Q": Queen q = new Queen("white",x,yAxis);
						  setPiece(q,board);
						  q.setX(x);
						  q.setY(yAxis);
						  break;
				case "K": King k = new King("white",x,yAxis);
						  setPiece(k,board);	
						  k.setX(x);
						  k.setY(yAxis);
				default: System.out.println("First letter must be P,R,B,N,Q or K");
			}		
		} 
		


		printBoard(board);
		
	//Prompt for position of piece to be moved
		System.out.println();
		System.out.println();
		System.out.println("Enter the piece to move: ");
		Scanner p_scan = new Scanner(System.in);
		String p_move = p_scan.nextLine();	
		
		//print board	
	printBoard(board);	
	System.out.println();
	System.out.println();
	
		for(int i= 0; i < p_move.length(); i++)
		{
			String ptype = p_move.substring(0,1); //get first letter for piece type
			
			String pAxis = p_move.substring(1,2); //change letter into int for x axis
			int x = toNumber(pAxis);
			
			int yAxis = Integer.parseInt(p_move.substring(2)); //get y axis
			
			switch(ptype) //create piece
			{
				case "P": Pawn p = new Pawn("white",x,yAxis);
						  setPiece(p,board);  
						  p.setX(x);
						  p.setY(yAxis);
						  System.out.println("Legal moves for " + p_move + ": " );
						  p.possibleMoves(board);
/*						  for(Integer xs : p.Xs)
						  {
							  for(Integer ys : p.Ys)
							  { p.setX(xs);
							    p.setY(ys);
								setPiece(p,board);
								p.checkmate_check(board);
							  }
						  }
*/						 break;
				case "R": Rook r = new Rook("white",x,yAxis);
						  setPiece(r,board);
						  r.setX(x);
						  r.setY(yAxis);
						  System.out.println("Legal moves for " + p_move + ": " );
						  r.possibleMoves(board);
						  break; 
				case "B": Bishop b = new Bishop("white",x,yAxis);
						  setPiece(b,board);
						  b.setX(x);
						  b.setY(yAxis);
						  System.out.println("Legal moves for " + p_move + ": " );
						  b.possibleMoves(board);
						  break;
				case "N": Knight n = new Knight("white",x,yAxis);
						  setPiece(n,board);
						  n.setX(x);
						  n.setY(yAxis);
						  System.out.println("Legal moves for " + p_move + ": " );
						  n.possibleMoves(board);
						  break;
			case "Q": Queen q = new Queen("white",x,yAxis);
						  setPiece(q,board);
						  q.setX(x);
						  q.setY(yAxis);
						  System.out.println("Legal moves for " + p_move + ": " );
						  q.possibleMoves(board);
						  break;
				case "K": King k = new King("white",x,yAxis);
						  setPiece(k,board);	
						  k.setX(x);
						  k.setY(yAxis);
						  System.out.println("Legal moves for " + p_move + ": " );
						  k.possibleMoves(board);
						  break; 
				default: System.out.println("First letter must be P,R,B,N,Q or K");
			}		
		
		}
		
		
	

	/*
	This doesn't account for which color is going which direction, move for Pawn would have to be taken in context of whichever way board is facing
	didn't build in ability to capture opposing pieces, just to look for empty spaces
	only made one kind of Bishop, because didn't build in how to mark if input is saying black spaces bishop or white spaces bishop
	didn't build in stopping when reaching a blocked space, array of possibleMoves continues on other side of piece (should this have been switch case?)
	don't know why possible moves prints three times
	doesn't account for it piece being tested is white or black, due to time restrictions just made it recreate the piece as a white piece in that board space
	doesn't account for if king is in check (this was my first ever attempt at a chess game and I built what I could figure out in the time I had) - see checkmate_check() attempt in Pieces.java
*/
	}
	}
	
	