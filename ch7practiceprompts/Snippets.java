import java.util.*;

public class Snippets
{
    public static void main(String[] args)
    {
        //boundsError();
        //unknownInputLen();
        //fillArray();
        kazakhSearch();

    }

    public static void boundsError()
    {
        double[] arr = {1, 4, 9, 16, 25};
        
        for (int i = 0; i < arr.length; i++)
        {
        arr[i] = Math.pow((i+1), 2);
        }
         
    }

    public static void unknownInputLen()
    {
        int currentSize = 0;
        System.out.println("Input values: ");
        double[] arr = new double[10];
        Scanner s = new Scanner(System.in);
        while (s.hasNextDouble())
        {
            if (currentSize < arr.length)
            {
                double foo = s.nextDouble();
                if (foo == 0d)
                {
                    break;
                }
                arr[currentSize] = foo;
                currentSize++;
            }
            else 
            {
                double[] tempArr = new double[currentSize+1];
                for (int i = 0; i < currentSize; i++)
                {
                    tempArr[i] = arr[i];
                    arr = tempArr;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }

    public static void fillArray()
    {
        int[] arr = new int[100];
        for(int i = 0; i < arr.length; i++)
        {
            arr[i] = (int)Math.pow((i+1), 2);
        }
        System.out.println( Arrays.toString(arr));
    }

    public static void kazakhSearch()
    {
        //Kazakh search is best search
        int searchValue = 100;
        int[] values = { 80, 90, 100, 120, 110 };
        int pos = 0;
        boolean found = false;
        while ( pos < values.length && !found )
        {
            if ( values[pos] == searchValue )
            {
                found = true;
            }
            else
            {
                pos++;
            }
        }

        if ( found )
        {
            System.out.println("Found at position: " + pos);
        }
        else
        {
            System.out.println("Not found");
        }

    }
}


