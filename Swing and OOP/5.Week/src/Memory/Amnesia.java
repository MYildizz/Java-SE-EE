
package Memory;

import ClinicalCase.ClinicalCase;


public class Amnesia extends MemoryDeficit
{
    private String amnesia_type;
    private String cause;
    private String location;
    private ClinicalCase clin;
    private static int getTotalAmnesia=0;
    
    
    public Amnesia(String deficit_id, String memory_loss,String type,String cause,String brain_location,String id,String name,String surname,int age,String gender)
    {
        
        super(deficit_id, memory_loss);
        this.amnesia_type=type;
        this.cause=cause;
        this.location=brain_location;
        this.clin=new ClinicalCase(id,name,surname,age,gender);
        getTotalAmnesia++;
        
        
    }

    public static int getGetTotalAmnesia() {
        return getTotalAmnesia;
    }

    @Override
    public String toString()
    {
        return super.toString()+clin.toString()+ "\namnesia_type=" + amnesia_type + "\ncause=" + cause + "\nlocation=" + location+"\n\n";
    }
    
    
    
}
