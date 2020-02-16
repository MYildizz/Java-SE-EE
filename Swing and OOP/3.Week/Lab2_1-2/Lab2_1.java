//Author Murat
package lab2_1;

public class Lab2_1 {

    
    public static void main(String[] args) {
  
        Book b1 =new Book();
        Book b2=new Book("The java tutorial");
        Book b3=new Book("Accounting Principles",2005,135.8);
        Book b4=new Book("Algorithms in C",2008,45.5);
        
        
        
        b1.display();
        b2.display();
        b3.display();
        b4.display();
        
    
}
}