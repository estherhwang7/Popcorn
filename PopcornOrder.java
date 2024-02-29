public class PopcornOrder {
    private String variety;
    private int numOrdered;

    public PopcornOrder(String v, int n)
    {
        variety = v;
        numOrdered = n;
    }

    public String getVariety()
    {
        return variety;
    }
    
    public int getNumOrdered()
    {
        return numOrdered;
    }

    
    public String toString()
    {
        
        if (numOrdered != 0)
            return("Variety: "+ variety + "Number Ordered: "+ numOrdered);
        else
        return("There are no popcorn orderes for the MasterList.");

    }
}
