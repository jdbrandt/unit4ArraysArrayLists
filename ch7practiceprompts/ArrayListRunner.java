import java.util.ArrayList;

public class ArrayListRunner
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        System.out.println(names);

        String[] temp = new String[] {"Alice", "Bob", "Connie", "David", "Edward", "Fran", "Gomez", "Harry"};
        for (String i : temp)
        {
            names.add(i);
        }

        System.out.println(names.get(0));
        System.out.println(names.get(names.size()-1));
        System.out.println(names.size());
        System.out.println(names.get(names.size()-1));
        names.set(0, "Alice B. Toklas");
        names.add(names.indexOf("David")+1, "Douglas");
        
        for (String i : names)
        {
            System.out.print(i+", ");
        }
        
        ArrayList<String> names2 = new ArrayList<String>(names);
        names.remove(0);
        System.out.println(names);
        System.out.println(names);
    }
} 