
package Memory;

import ClinicalCase.ClinicalCase;


public class Alzheimer extends MemoryDeficit 
{
    
    private String declining_area;
    private static int totalAlzheimer=0;
    private ClinicalCase clin;
    
    public Alzheimer(String deficit_id, String memory_loss,String decline,String id,String name,String surname,int age,String gender)
    {
        super(deficit_id, memory_loss);
        this.declining_area=decline;
        this.clin=new ClinicalCase(id,name,surname,age,gender);
        totalAlzheimer++;
    }

    public static int getTotalAlzheimer() {
        return totalAlzheimer;
    }

    @Override
    public String toString() {
        return super.toString()+clin.toString()+ "\ndeclining_area=" + declining_area+"\n\n" ;
    }
    
    
    
    
}
