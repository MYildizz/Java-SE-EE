
package lab4_1;

//@Author Murat

public class LuggageList 
{
    private static final int MAX_COUNT=5;
    private static final int MAX_KILOS=50;
    private static Luggage[] myLuggages=new Luggage[MAX_COUNT];
    private static int total_kilo;
    private static int  total_LuggageCount=0;
    private static int count=-1;
    
    public boolean addLuggage(Luggage Lug)
    {
        count++;
        if(total_LuggageCount<MAX_COUNT && Lug.getWeight_kilo()<=MAX_KILOS)
        {
              total_kilo+=Lug.getWeight_kilo();
              myLuggages[count]=Lug;
              total_LuggageCount+=1;
              System.out.println("Error: Max size of (kilo or/and count) is reached! Cannot add any more luggage!");
              return true;
        }
        else
        {
             System.out.println(" System.out.println(\"The Luggage belonging to: \"+name+\"Added to the list.\");");
             return false;
        }
              
    }
    
    public  boolean removeLuggage(int ID)
    {
        
         for(int i=0;i<total_LuggageCount;i++)
         {
            if ( myLuggages[i].getLuggage_ID()==ID)
            {
             
            myLuggages[i]=myLuggages[total_LuggageCount-1];
            total_LuggageCount-=1;
            System.out.println("The Luggage belonging to: "+myLuggages[i].getBelongsTo()+" removed!");
            display();
            
            return true;
         
            }
         }
         return false;
    
    }
    public Luggage getLuggage(String belong)
    {
         for(int i=0;i<total_LuggageCount;i++)
         {
            if ( myLuggages[i].getBelongsTo().equals(belong))
            {
                System.out.println("Here is the luggage you where looking for...");
                System.out.println(myLuggages[i]);  
                return myLuggages[i];
            }
         }
         return null;
    }
    
    public Luggage getAll()
    {
        for(int i=0;i<total_LuggageCount;i++)
             return myLuggages[i];
    
    return null;
    }
    
    public Luggage getHighestCapacityLuggage()
    {
        double highest=myLuggages[0].getCapacity_lt();
        int highestIndex=0;
    
        for(int i =0;i<total_LuggageCount;i++)
            {
              if(myLuggages[i].getCapacity_lt()>=highest)
              {
               highest=myLuggages[i].getCapacity_lt();
               highestIndex=i;
              }
        
             }
    
        System.out.println("The luggage belonging to :"+myLuggages[highestIndex].getBelongsTo()+"has the highest capacity of "+myLuggages[highestIndex].getCapacity_lt()+"liters..");
        System.out.println("-----------------------");
        return  myLuggages[highestIndex];
    
    }
    
    public void display()
    {
         System.out.println("\n------------------------");
         System.out.println("Here is a list of the luggages (using toString() method of list object)...");
         for(int i=0;i<total_LuggageCount;i++)
            {
                System.out.println(myLuggages[i]);
            }
    }
    
    
}
