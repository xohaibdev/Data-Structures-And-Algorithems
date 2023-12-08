public class Patterns{
    public static void main(String[] args)
    {
        //pattern1(5);
        //pattern2(5);
        //pattern3(5);
        //pattern4(5);
        // pattern5(5);
        // triangle(5);
        pattern6(5);
    }

    public static void pattern6(int numRows)
    {

        /*


    * 
   * * 
  * * * 
 * * * * 
* * * * * 
 * * * * 
  * * * 
   * * 
    * 
    
    */
        for(int row = 1; row <= 2 * numRows - 1; row++)
        {
            int requiredCols = row <= numRows ? row : 2 * numRows - row ;
            int requiredSpaces = row <= numRows ? numRows - row : numRows - requiredCols ;

            for(int space = 1; space <= requiredSpaces; space++)
            {
                System.out.print(" ");
            }
            for(int col = 1; col <= requiredCols;  col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void triangle(int numRows)
    {
        /*


    * 
   * * 
  * * * 
 * * * * 
* * * * * 

*/
        for(int row = 1; row <= numRows; row++)
        {
            for(int space = 1; space <= numRows - row; space++)
            {
                System.out.print(" ");
            }
            for(int col = 1; col <= row;  col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
    public static void pattern5(int n){
        /*
    *
   **
  ***
 ****
*****
 ****
  ***
   **
    *
        */
       
        for(int row = 1; row <= 2*n; row++)
        {
            
            int requiredCols = row <= n ? row : 2 * n - row;
            int requiredSpaces = n - requiredCols;  


           for(int space = 0; space < requiredSpaces; space++)
            {
                System.out.print(" ");
            }

            for(int col = 1; col <= requiredCols; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }

    public static void pattern4(int n){
        /*
            *
            **
            ***
            ****
            ****
            ***
            **
            *
        */
        for(int row = 1; row <= 2*n-1; row++)
        {
            int requiredCols = 0;
            if(row<=n)
            {
                requiredCols = row;
            } else{
                requiredCols = 2*n-row+1;
            }
            for(int col = 1; col < requiredCols; col++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
    }
    
    public static void pattern3(int n){
        /*

        * 
        * * 
        * * * 
        * * * * 
        * * * * * 
        
        */
        for(int row = 1; row <= n; row++)
        {
            for(int col = 1; col <= row; col++)
            {
                System.out.print(col);
            }
            System.out.println();
        }
    }

    public static void pattern1(int n){
        /*

        * 
        * * 
        * * * 
        * * * * 
        * * * * * 
        
        */
        for(int row = 1; row <= n; row++)
        {
            for(int col = 1; col <= row; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    public static void pattern2(int n){
        /*
            * * * * * 
            * * * * 
            * * * 
            * * 
            * 
        */
        for(int row = 1; row <= n; row++)
        {
            for(int col = 1; col <= n-row+1; col++)
            {
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}