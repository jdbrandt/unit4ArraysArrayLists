import java.util.*;

public class MagicSquares
{
    int[] listNums;
    int[][] magicSquare;
    public MagicSquares()
    {
        listNums = new int[] {16, 3, 2, 13, 5, 10, 11, 8, 9, 6, 7, 12, 4, 15, 14, 1};
        magicSquare = new int[4][4];
        for (int i = 0; i < 16; i++)
        {
            magicSquare[i/4][i%4] = listNums[i];
        }
    }
    
    public void foo()
    {
        
        
        int[] allNums = new int[] {1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 1, 12, 13, 14, 15, 16}; 
        Scanner s = new Scanner(System.in);
        System.out.println("");
        /*
        for (int i = 0; i < 16; i++)
        {
        listNums[i] = s.nextInt();
        }
         */
        for(int[] arr : magicSquare)
        {
            for (int i : arr)
            {
                for (int j = 0; j<allNums.length; j++)
                {
                    if (i==allNums[j])
                    {
                        allNums[j] = 0;
                    }
                }
            }
        }

        boolean isMagic = true;

        for (int i: allNums)
        {
            if (i!=0)
            {
                isMagic = false;
            }
        }
        int sum = sumRow(0);
        if ((sum == sumRow(1)) && (sum == sumRow(2)) && (sum == sumRow(3)) && (sum == sumCol(0)) && (sum == sumCol(1)) && (sum == sumCol(2)) && (sum == sumCol(3)) && (sum == sumDiagonal(true)) && (sum == sumDiagonal(false)))
        {
            System.out.println(isMagic);
        }
        else
        {
            System.out.println("false");
        }
    }

    public int sumRow(int row)
    {
        int sum = 0;
        for (int i : magicSquare[row])
        {
            sum+=i;
        }
        return sum;
    }
    
    public int sumCol(int col)
    {
        int sum = 0;
        for (int[] arr : magicSquare)
        {
            sum+=arr[col];
        }
        return sum;
    }
    /*
     * @param direction is positive if major, negative if minor
     */
    public int sumDiagonal(boolean direction)
    {
        int sum = 0;
        if (direction)
        {
            for (int i = 0; i < 4; i++)
            {
                sum+=magicSquare[i][i];
            }
        }
        else
        {
            for (int i = 0; i < 4; i++)
            {
                sum+=magicSquare[i][3-i];
            }
        }
        return sum;
    }
            
}
