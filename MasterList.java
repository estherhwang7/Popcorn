import java.util.*;

public class MasterList {
    private ArrayList <PopcornOrder> orders;
    
    public MasterList()
    {
        orders = new ArrayList <PopcornOrder>();
    }

    public void addOrder(PopcornOrder p)
    {
        orders.add(p);
    }

    public int getTotalOrders()
    {
        int sum = 0;
        for (int i = 0; i<orders.size(); i++)
        {
            sum += orders.get(i).getNumOrdered();
        }
        return sum;
    }

    public int removeVariety(String var)
    {
        int num = 0;
        for (int i = orders.size() -1; i>=0; i--)
        {
            if ((orders.get(i).getVariety()).equals(var))
            {
                num += orders.get(i).getNumOrdered();
                orders.remove(orders.get(i));
            }
        }
        return num;
    }

    
}
