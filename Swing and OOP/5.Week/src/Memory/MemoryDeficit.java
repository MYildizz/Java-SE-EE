
package Memory;


public abstract class MemoryDeficit 
{
    public String deficit_id;
    public String memory_loss;
    public static int totalDeficit;

    public MemoryDeficit(String deficit_id, String memory_loss) 
    {
        this.deficit_id = deficit_id;
        this.memory_loss = memory_loss;
    }

    

    public static int getTotalDeficit()
    {
        return totalDeficit;
    }

    public String getDeficit_id() 
    {
        return deficit_id;
    }
    
    
    @Override
    public String toString() 
    {
        return "Deficit Id=" + deficit_id + "\nMemory Loss=" + memory_loss ;
    }
    
}
