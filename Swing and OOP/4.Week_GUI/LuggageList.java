
package lab_4;

//@author murat

public class LuggageList 
{
    private static final int  MAX_COUNT=5;
    private static final int  MAX_KILOS=50;
    public static Luggage[] myLuggages=new Luggage[MAX_COUNT];
    private static int  total_kilo=0;
    public static int LuggageCount=0;
   // private static int i=-1;
    
    private static JFrame jframe=new JFrame();
    
    public boolean addLuggage(Luggage lug)
    {
        //i++;
    if(lug.getWeight_kilo()+total_kilo<=MAX_KILOS && LuggageCount <MAX_COUNT )
    {
        myLuggages[LuggageCount]=lug;
        total_kilo+=lug.getWeight_kilo();
        LuggageCount+=1;
    
        System.out.println("The luggages belonging to "+lug.getBelongsTo()+" is added to the list");
    
        return true;
    
    }
    else
    {
        System.out.println("Max size of (kilo or/and count is reached!) cannot add any more luggage!");
        return false;
    }
    
    }
    
    public String removeLuggage(int name)
    {
    for (int i =0;i<LuggageCount;i++)
    {
        if(myLuggages[i].getLuggage_ID()==name)
        {
        System.out.println("The Luggage belonging to: "+myLuggages[i].getBelongsTo()+" is removed");       
        myLuggages[i]=myLuggages[LuggageCount-1];
        LuggageCount--;
        display();
        return myLuggages[i].getBelongsTo();
        }
    }
    System.out.println("it can not be found!");
    return null;
    
    }
    
    public Luggage getLuggage(String name)
    {
        for(int i=0;i<LuggageCount;i++)
        {
            if(myLuggages[i].getBelongsTo().equals(name))
            {
                System.out.println("Here is the luggage you were looking for...");
                System.out.println(myLuggages[i]);
                return myLuggages[i];
            }
        }
        return null;
    }
    
    public Luggage getAll()
    {
        for(int i=0;i<LuggageCount;i++)
        {
            return myLuggages[i];
        }
        return null;
    }
    
    public String getHishestCpacityLuggage()
    {
        double max=myLuggages[0].getCapacity_lt();
        int max_id=0;
        
        for(int i=1;i<LuggageCount;i++)
        {
            if (myLuggages[i].getCapacity_lt()>max)
            {
                max=myLuggages[i].getCapacity_lt();
                max_id=i;
            }
        }
       // System.out.println("The Luggage Belonging to: "+myLuggages[max_id].getBelongsTo()+ " has the highest capacity of "+myLuggages[max_id].getCapacity_lt()+" liters.");
       return "The Luggage Belonging to: "+myLuggages[max_id].getBelongsTo()+ " has the highest capacity of "+myLuggages[max_id].getCapacity_lt()+" liters.";
    }
    
    public String display()
    {
        //System.out.println("--------------------------------");
        System.out.println("Here is a list of the luggage(using toString() method of list object)...");
        String name="";
        for(int i=0;i<LuggageCount;i++)
        {
           System.out.println(myLuggages[i]);
           name+="\n"+myLuggages[i];
            
            //return myLuggages[i].toString();
            
            
        }
        
        return name;
    }
            
    
    
}
