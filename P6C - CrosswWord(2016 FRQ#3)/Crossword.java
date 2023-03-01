 

public class Crossword
   {
   private Square[][] puzzle;
   
   public Crossword()
      {
      puzzle = new Square[5][5];  
      for(int row = 0; row < puzzle.length; row++ )
         {
         for( int col = 0; col < puzzle[0].length; col++ )
            {
            puzzle[row][col] = new Square( true, 0 );    
            } // end inner for
         } // end outer for
         
         
      } // end zero-arg constructor
   
   public Crossword( boolean[][] blackSquares )
      {
         int x = blackSquares.length;
         int y = blackSquares[0].length;
          puzzle = new Square[x][y]; 
          int counter = 1;
          for(int r = 0; r<puzzle.length; r++)
          {
              for(int c = 0; c<puzzle[0].length; c++)
              {
                  if(blackSquares[r][c] == true)
                  {
                      
                      puzzle[r][c] = new Square(true, 0);
                      //counter++;
                    }
                    else
                    {
                        if(toBeLabeled(r, c, blackSquares) == true)
                      {
                          puzzle[r][c] = new Square(false, counter);
                          counter++;
                        }
                        else
                        {
                            puzzle[r][c] = new Square(false, 0);
                        }
                        //puzzle[r][c] = new Square(false, counter);
                        
                    }
                }
            }
      // to be completed in Part (b)
      
      
      
      } // end one-arg constructor 
       
   private boolean toBeLabeled( int r, int c, boolean[][] blackSquares )
      {
          if(blackSquares[r][c] == false)
          {
              if(r == 0)
              return true;
              else if(c == 0)
              return true;
              else if(r > 0)
              {
                  if(blackSquares[r-1][c] == true)
                  {
                      return true;
                    }
                    if(c>0)
                    {
                        if(c==blackSquares[0].length-1)
                        return false;
                        else if(blackSquares[r][c-1] == true)
                        return true;
                    }

                }
              
                
            }
        
        
      return false;    
      } // end method toBeLabeled
      
   public String toString()
      {
      String output = new String();
      
      for( int row = 0; row < puzzle.length; row++ )
         {
         for( int col = 0; col < puzzle[0].length; col++ )
            {
            if( puzzle[row][col].getIsBlack() == true )
               {
               output += (char)(9608) + "\t";   // 9608 adds a black square
               } 
            else
               {
                   if(puzzle[row][col].getNum() == 0)
                   {
                       output += (char)(8192) +"\t";
                    }
                    else
                    {
                        output += puzzle[row][col].getNum() + "\t"; //prints number of square
                    }
                   
               
               } // end else 
            } // end inner for
         output += "\n";      
         } // end outer for
      return output;  
      } // end method toString()
   } // end class Crossword
   