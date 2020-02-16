
package ınfoclass;

import Memory.Alzheimer;
import Memory.Amnesia;
import Memory.MemoryDeficit;
import java.util.ArrayList;



public class InfoClass 
{
    private static ArrayList<MemoryDeficit> memory =new ArrayList<MemoryDeficit>();
    
    
    public static void addMemory(MemoryDeficit def)
    {
        
        
            memory.add(def);
    }
    
    public static String getAllMemory()
    {
        return null;
    }
    
    
    public static String getAmnesia()
    {
        String All="";
        
       for (MemoryDeficit mem : memory)
       {
           if(mem instanceof Amnesia)
           {
           All+=mem.toString();
           }
       }
       
       return All;
    }
    
    public static String getAlzheimer()
    {
         String All="";
        
       for (MemoryDeficit mem : memory)
       {
           if(mem instanceof Alzheimer)
           {
                All+=mem.toString();
           }
       }
       
       return All;
    }
    
    public static String searchMemory(String id)
    {
        for (MemoryDeficit mem : memory)
       {
           if(mem.deficit_id.equals(id))
           {
                return mem.toString();
           }
       }
        return null;
    }
    
    public static String showTotalMemory()
    {
        String total="";
        int total_al=Alzheimer.getTotalAlzheimer();
        int total_am=Amnesia.getGetTotalAmnesia();
        int totall=total_al+total_am;
        
        total+="Total Deficits : "+totall+"\nTotal Amnesics :"+total_am+"\nTotal Alzheimers: "+total_al;
        
        return total;
        
        
    }
    
    public static String showImprovement()
    {
        return null;
    }
    
    
}
