public class ArrayOps2
{
    private int[] values;
    public ArrayOps2(int[] initialValues)
    {
        values = initialValues;
    }
    
    public void swapFirstAndLast()
    {
        int temp = values[0];
        values[0] = values[values.length-1];
        values[values.length-1] = temp;
    }
    
    public void shiftRight()
    {
        int temp = values[values.length-1];
        for (int i = 0; i < values.length; i++)
        {
            values[i+1] = values[i];
        }
        values[0] = temp;
    }
    
    public void replaceEven()
    {
        for (int i = 0; i < values.length; i++)
        {
            if (values[i]%2==0)
            {
                values[i]=0;
            }
        }
    }
    
    public void replaceLarge()
    {
        int[] temp = new int[values.length];
        for (int i = 1; i < values.length-1; i++)
        {
            if (values[i-1] > values[i+1])
            {
                temp[i] = values[i-1];
            }
            
            else if (values[i+1]>values[i-1])
            {
                temp[i] = values[i+1];
            }
        }
        values = temp;
    }
    
    
    public void removeMiddle()
    {
        int[] temp;
        if (values.length%2==0)
        {
            temp = new int[values.length-2];
            int tempCurrentSize = 0;
            for (int i = 0; i < values.length; i++)
            {
                if (values.length/(float)i !=2  &&  values.length/(i+1) !=2)
                {
                    temp[tempCurrentSize] = values[i];
                    tempCurrentSize++;
                }
            }
        }
        else
        {
            temp = new int[values.length-1];
            int tempCurrentSize = 0;
            for (int i = 0; i < values.length; i++)
            {
                if (values.length-1/2f == i)
                {
                    temp[tempCurrentSize] = values[i];
                    tempCurrentSize++;
                }
            }
        }                
        values = temp;
    }
    
    
    public void evenToFront()
    {
        int evenCount = 0;
        for (int i : values)
        {
            if (i%2==0)
            {
                evenCount++;
            }
        }
        int oddCount = values.length-evenCount;
        
        int[] evens = new int[evenCount];
        int evensCurrentSize = 0;
        
        int[] odds = new int[oddCount];
        int oddsCurrentSize = 0;
        
        for (int i : values)
        {
            if (i%2==0)
            {
                evens[evensCurrentSize] = i;
                evensCurrentSize++;
            }
            else
            {
                odds[oddsCurrentSize] = i;
                oddsCurrentSize++;
            }
        }
        
        int[] temp = new int[values.length];
        int tempCurrentSize = 0;
        
        for (int i : evens)
        {
            temp[tempCurrentSize] = i;
        }
        for (int i : odds)
        {
            temp[tempCurrentSize] = i;
        }
        
        values = temp;
    }
    
    
    public int secondLargest()
    {
        int largest;
        int secondLargest;
        if (values[0] > values[1])
        {
            largest = values[0];
            secondLargest = values[1];
        }
        else
        {
            largest = values[1];
            secondLargest = values[0];
        }
        
            
        
        for (int i : values)
        {
            if (i >= largest)
            {
                largest = i;
            }
            
            else if (i >= secondLargest)
            {
                secondLargest = i;
            }
        }
        
        
        return secondLargest;
    }
    
    public boolean isSorted()
    {
        int prevValue = values[0];
        
        for (int i : values)
        {
            if (i < prevValue)
            {
                return false;
            }
            prevValue = i;
        }
        return true;
    }
    
    
    public boolean isAdjDups()
    {
        int prevValue = values[0];
        boolean tripWire = false;
        for (int i : values)
        {
            if (i == prevValue)
            {
                if (values[0] == i)
                {
                    if (values[0] == values[1])
                    {
                        return true;
                    }
                    tripWire = true;
                    break;
                }
                return true;
            }
            prevValue = i;
        }
        if (tripWire==true)
        {
            isAdjDups();
        }
        
        return false;
        
    }
    
    
    public boolean isDups()
    {
        int[] temp = new int[values.length];
        int tempCurrentSize = 0;
        
        for (int i : values)
        {
            for (int j : temp)
            {
                if (i==j)
                {
                    return true;
                }
            }
            temp[tempCurrentSize] = i;
            tempCurrentSize++;
        }
        
        return false;
    }
    
}

   
            
                
                        
    
    
    
    
    
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
                
        