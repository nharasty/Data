
/**
 * Creates a 2d table generated with values
 * 
 * @author (Nicholas Harasty) 
 * @version (4/17/17)
 */
public class TwoDDriver
{   
    /**
     * main class fills table 
     * 
     * @param args does nothing
     */
    public static void main(String[] args)
    {
        int[][] myTable = new int[10][8];

        for (int i = 0; i < myTable.length; i++)
        {
            
            for (int j = 0; j < myTable[0].length; j++)
            {
                myTable[i][j] = i * 4 + j;
      
            }
            
        }
        //System.out.println(myTable[5][2]);
        
        TwoDData dataObject = new TwoDData(myTable);
        dataObject.printTable();
        
        
        System.out.println("Sum of row at index 2: " + dataObject.sumOfRow(2));
        System.out.println("Sum of column at index 5: " + 
            dataObject.sumOfCol(5));
    }
}
