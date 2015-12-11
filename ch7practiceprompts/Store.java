import java.util.ArrayList;

public class Store
{
    public ArrayList<Customer> customerList;
    
    public Store()
    {
         customerList = new ArrayList<Customer>();
    }
      
    public void addSale(String customerName, double amount)
    {
        boolean hasVisitedBefore = false;
        while(!hasVisitedBefore)
        {
            for(Customer c : customerList)
            {
                if (customerName.equals(c.getName()))
                {
                    hasVisitedBefore = true;
                }
            }
        }
        if (hasVisitedBefore)
        {
            for (Customer c : customerList)
            {
                if (c.getName().equals(customerName))
                {
                    c.addSale(amount);
                }
            }
        }
        else
        {
            customerList.add(new Customer(customerName, amount));
        }
        
    }
    
    public String nameOfBestCustomer()
    {
        double bestSale = 0;
        String bestName = "";
        for (Customer c : customerList)
        {
            for (Double d : c.getSales())
            {
                if (d > new Double(d))
                {
                    bestSale = d.doubleValue();
                    bestName = c.getName();
                }
            }
        }
        return bestName;
    }
    
    public ArrayList<String> nameOfBestCustomers(int topN)
    {
        ArrayList<Double> bestSales = new ArrayList<Double>();
        ArrayList<String> bestNames = new ArrayList<String>();
        for (Customer c : customerList)
        {
            if (bestSales.size()<topN)
            {
                for (Double d : c.getSales())
                {
                    for (int i = 0; i < bestSales.size(); i++)
                    {
                        if (d.doubleValue() > bestSales.get(i))
                        {
                            bestSales.set(i, d);
                            bestNames.set(i, c.getName());
                        }
                    }   
                    if (bestSales.size()<topN)
                    {
                        break;
                    }
                }
            }
            else
            {
                for (int i = 0; i < c.getSales().size(); i++)
                {
                    for (int j = 0; j < bestSales.size(); j++)
                    {
                        if (bestSales.get(j) < c.getSales().get(i))
                        {
                            bestSales.set(j, c.getSales().get(i));
                            bestNames.set(j, c.getName());
                        }
                    }
                }
            }
        }
        return bestNames;
    }
    
    public ArrayList<Customer> getCustomerList()
    {
        return customerList;
    }
}

