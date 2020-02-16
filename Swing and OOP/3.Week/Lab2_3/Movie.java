
package lab2_1;

// @author Murat

public class Movie {
    
    String title;
    int year;
    double rating;
    
    

    public Movie() {
        this.title = "null";
        this.year = 0;
        this.rating = 0.0;
    }

    public Movie(String title, int year, double rating) {
        this.title = title;
        this.year = year;
        this.rating = rating;
    }
    
    

    public Movie(String title, int year) {
        this.title = title;
        this.year = year;
    }

    public Movie(String title)
    {
        this.title = title;
    }
    
    public void display()
    {
        System.out.println(this.title+" , "+this.year+" , "+this.rating+" points");
    }
    
    

   
    
    
    
}
