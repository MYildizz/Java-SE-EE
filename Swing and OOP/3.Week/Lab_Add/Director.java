//Author Murat
package q4;


public class Director
{
    String Name;
    int numberOfFilms;
    int oscars;
    String info;

    public Director() {
        this.Name = "Alejandro Gonzalez Inarritu";
        this.numberOfFilms = 16;
        this.oscars = 7;
        this.info = "is well known with the movies like:Birdman,The Revenant";
    }

    public Director(String Name, int numberOfFilms, int oscars,String info) {
        this.Name = Name;
        this.numberOfFilms = numberOfFilms;
        this.oscars = oscars;
        this.info=info;
    }

    public String getName() {
        return Name;
    }

    public void setName(String Name) {
        this.Name = Name;
    }

    public int getNumberOfFilms() {
        return numberOfFilms;
    }

    public int getOscars() {
        return oscars;
    }

    public String getInfo() {
        return info;
    }
    public int earnings()
    {
        
    int os=this.numberOfFilms;
    int fi=this.oscars;
    double result=fi/os;
    int money=1;
    
    
    if (result <5)
    {
        money=10000000 ;
        
    }
    else if (result >=5 && result <10 )
    {
    money=5000000 ;
    }
    else if (result >=10 && result <15)
    {
        money=1000000;
    }
    else if(result >=15)
    {
        money=500000 ;
    }
    else
    {
        money=0;
    }
    return money;
    
      }
    
    public void display()
    {
        System.out.println("Director Information:");
        System.out.println("_____________________");
        System.out.println("Name :"+getName());
        System.out.println("Number of films:"+getNumberOfFilms());
        System.out.println("Oscar Winds and Nominees:"+getOscars());
        
        System.out.println(this.getName()+ ""+this.getInfo()+" Earns "+this.earnings()+" $ Per film");
    }
    
    
    
  }
