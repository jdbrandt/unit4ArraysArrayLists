public class Array2D
{
    final int COUNTRIES = 7;
    final int MEDALS = 3;
    int[][] counts =  {
            {1,0,1},
            {1,1,0},
            {0,0,1},
            {1,0,0},
            {0,1,1},
            {0,1,1},
            {1,1,0}
        };
    
    public Array2D()
    {
        
    }
    
    public void displayElements()
    {
        for (int i = 0; i < counts.length; i++)
        {
            for (int j = 0; j < counts[i].length; j++)
            {
                System.out.print(counts[i][j]);
            }
            System.out.println("");
        }
    }
    
    public int totalMedalsForCountry(int index)
    {
        int sum = 0;
        for (int i:counts[index])
        {
            sum+=i;
        }
        return sum;
    }
        
    public int totalMedals(int medalIndex)
    {
        int total = 0;
        for (int[] i : counts)
        {
            total+=i[medalIndex];
        }
        return total;
    }
    
}
