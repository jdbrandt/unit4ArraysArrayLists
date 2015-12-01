public class ArrayOps
{
    public static void main()
    {
        double[] arr = {8, 4, 6, 21, 7, 9, 18, 2, 100};
        System.out.println(arr.length);
        System.out.println(arr[0]);
        System.out.println(arr[arr.length-1]);
        System.out.println(arr[arr.length-1]); //They evaluate to the same thing
        for (int i = 0; i<arr.length; i++)
        {
            System.out.println(arr[i]+"");
        }
        for (int i = 0; i<arr.length; i++)
        {
            System.out.println(i+": "+arr[i]);
        }
        for (int i = arr.length-1; i < 0; i--)
        {
            System.out.println(i+": "+arr[i]);
        }
        for (double i: arr)
        {
            System.out.println(i+"");
        }
    
    }
}