//Author Murat
package lab2_1;


public class Book {
    
    String title;
    int publishYear;
    double price;

    public Book() 
    {
        this.title = "NoBookTitle";
        this.publishYear = 0;
        this.price = 0.0;
    }
    
        public Book(String title, int publishYear, double price)
        {
            
        this.title = title;
        this.publishYear = publishYear;
        this.price = price;
        
        }

    public Book(String title, int publishYear) 
    {
        
        this.title = title;
        this.publishYear = publishYear;
        
    }

    public Book(String title)
    {
        
        this.title = title;
        
    }
    
     public void display()
    {
        
        System.out.println(this.title+" , "+this.publishYear+" , "+this.price );
        
        
    }
    
    
    
}
