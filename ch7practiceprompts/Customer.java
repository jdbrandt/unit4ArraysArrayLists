import java.util.ArrayList;

public class Customer
{
    private ArrayList<Double> sales;
    private String name;
    
    public Customer()
    {
        this.name = "";
        this.sales = new ArrayList<Double>();
    }
    
    public Customer(String name, double sale)
    {
        this.sales = new ArrayList<Double>();
        this.sales.add(new Double(sale));
        this.name = name;
    }
    
    public String getName()
    {
        return this.name;
    }
    
    public ArrayList<Double> getSales()
    {
        return this.sales;
    }
    
    public void addSale(double amount)
    {
        sales.add(new Double(amount));
    }
}