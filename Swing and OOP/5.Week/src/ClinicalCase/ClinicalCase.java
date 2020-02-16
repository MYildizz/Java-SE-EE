
package ClinicalCase;


public class ClinicalCase 
{
    private String pratient_id;
    private String ptaient_name;
    private String patient_surname;
    private int age;
    private String gender;

    public ClinicalCase(String pratient_id, String ptaient_name, String patient_surname, int age, String gender)
    {
        this.pratient_id = pratient_id;
        this.ptaient_name = ptaient_name;
        this.patient_surname = patient_surname;
        this.age = age;
        this.gender = gender;
    }

    public String getPratient_id() {
        return pratient_id;
    }

    @Override
    public String toString() 
    {
        return "\nPatient id=" + pratient_id + "\nPatient Name=" + ptaient_name + "\nPatient Surname=" + patient_surname + "\nage=" + age + "\nGender=" + gender;
    }
    
    
    
    
}
