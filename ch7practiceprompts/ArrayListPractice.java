import java.util.ArrayList;

public class ArrayListPractice
{
    public static void main(String[] args)
    {
        ArrayList<String> words = new ArrayList<String>();
        words.add("test");
        words.add("like");
        words.add("like");
        words.add("pythonsbetterthanjava");
        words.add("like");
        System.out.println(words.toString());
        for(int i = words.size()-1;i>=0;i--)
        {
            String word = words.get(i);
            if(word.equals("like"))
            {
                words.remove(i);
            }
        }
        
    }
}