public class PartialArray
{
    private int[] values;
    private int currentSize;
    
    public PartialArray()
    {
        this.values = new int[100];
        for ( this.currentSize = 0; this.currentSize < 10; this.currentSize++)
        {
            this.values[this.currentSize] = (int) Math.pow(this.currentSize, 2);
        }
    }
    
    public void remove(int pos)
    {
        if (pos <= this.currentSize)
        {
            for (int i = pos; i < currentSize; i++)
            {
                this.values[i] = this.values[i+1];
            }
            currentSize--;
        }
    }
    
    public void insert(int pos, int value)
    {
        if (this.currentSize == this.values.length || pos > this.values.length)
        {
            this.grow();
            this.insert(pos, value);
        }
        
        if (pos <= this.values.length)
        {
            if (pos < this.currentSize)
            {
                for (int i = this.currentSize; i > pos; i--)
                {
                    this.values[i] = this.values[i-1];
                }
                this.values[pos] = value;
                this.currentSize++;
            }
            else
            {
                this.values[pos] = value;
            }
        }
    }
    
    public void swap(int pos1, int pos2)
    {
        if (pos1 < currentSize && pos2 < currentSize)
        {
            int temp = this.values[pos1];
            this.values[pos1] = this.values[pos2];
            this.values[pos2] = temp;
        }
    }
    
    private void grow()
    {
        int[] temp = new int[this.values.length *2];
        for (int i = 0; i < this.currentSize; i++)
        {
            temp[i] = this.values[i];
        }
        this.values = temp;
    }
    
    public static void main(String[] args)
    {
        PartialArray partArr = new PartialArray();
        for (int i = 0; i < 15; i++)
        {
            partArr.insert((int)Math.pow(partArr.getArray()[i], 2), i);
        }
        
        partArr.insert(45, 101);
        partArr.insert(53, 102);
        
        for (int i = 0; i < 100; i++)
        {
            partArr.remove(i);
        }
        
        partArr.swap(102, 0);
        
    }

    public int[] getArray()
    {
        return this.values;
    }
    
    public int getCurrentSize()
    {
        return this.currentSize;
    }
}
