
package lab4_1;

//@Author Murat

import java.util.Scanner;


public class Cargo {

    
    public static void main(String[] args) 
    {
          Scanner num1=new Scanner(System.in);
          Scanner num2=new Scanner(System.in);
          Scanner num3=new Scanner(System.in);
          Scanner num4=new Scanner(System.in);
          
          
          LuggageList luggageList=new LuggageList();
          
          
          String name,capacity="",search;
          double Capacity;
          int weight=0,id;
          boolean x;
            
          
          for(int i=0;i<5;i++)
          {
              System.out.println("Luggage no "+(i+1)+" : ");
              System.out.println("Belongs to: ");
              name=num1.nextLine();
              System.out.println("Enter weight in kilos: ");
              weight=num2.nextInt();
              System.out.println("Enter capacity like width:Height:Length");
              capacity=num3.nextLine();
              String[] full=capacity.split(":");
              Capacity=Double.parseDouble(full[0])*Double.parseDouble(full[1])*Double.parseDouble(full[2]);
              
              
              
              Luggage luggage=new Luggage(name,weight,Capacity/1000);
              
              x=luggageList.addLuggage(luggage);
              
          }
           //----------------------------------
          luggageList.display();
          
          
          //------------------------------------
          
          System.out.println("Which luggage would you like to delete?");
          System.out.println("Enter an ID : ");
          
          id=num1.nextInt();
          
          luggageList.removeLuggage(id);
          
          //------------------------------------
          System.out.println("---------------------");
          System.out.println("Whose luggage would you like search?");
          search=num4.nextLine();
          luggageList.getLuggage(search);
          System.out.println("---------------------");
          //------------------------------------
          
          luggageList.getHighestCapacityLuggage();
          
          
        
    }
    
}
