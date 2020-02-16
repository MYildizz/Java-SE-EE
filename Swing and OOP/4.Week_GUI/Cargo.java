
package lab_4;

//@Author murat;

import java.util.Scanner;

public class Cargo {

  
    public static void main(String[] args) 
    {
        Scanner scan1=new Scanner(System.in);
        Scanner scan2=new Scanner(System.in);
        Scanner scan3=new Scanner(System.in);
        Scanner scan4=new Scanner(System.in);
        Scanner scan5=new Scanner(System.in);
        
        int no,weight;
        String name,capacity="";
        double Capacity;
        boolean x;
        LuggageList luggageList=new LuggageList();
        
        for(int i=0;i<5;i++)
        {
            System.out.println("Luggage no  "+(i+1)+" :");
            
            
            System.out.println("Belongs to ");
            name=scan2.nextLine();
            
            System.out.println("Enter weight in kilos ");
            weight=scan3.nextInt();
            
            System.out.println("Enter capacity like Width:Height:Lenght");
            capacity=scan4.nextLine();
            
            String[] full=capacity.split(":");
            Capacity=Double.parseDouble(full[0])*Double.parseDouble(full[1])*Double.parseDouble(full[2]);
            
            Luggage luggage=new Luggage(name,weight,Capacity/1000);
            
            
            x= luggageList.addLuggage(luggage);
            
        }
        //--------------------------
        System.out.println("-------------------------");
        luggageList.display();
        
        //--------------------------
        System.out.println("-------------------------");
        System.out.println("Which would you like to delete ?");
        System.out.println("Enter an ID : ");
        no=scan5.nextInt();
        
        luggageList.removeLuggage(no);
        
        //--------------------------
        System.out.println("-------------------------");
        System.out.println("Whose would you like to search ?");
        name=scan2.nextLine();
        luggageList.getLuggage(name);
        
        //----------------------------
        
        System.out.println("-------------------------");
        
        luggageList.getHishestCpacityLuggage();
        
        System.out.println("-------------------------");
        
        
    }
    
}
