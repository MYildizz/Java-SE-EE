

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author murat
 */
public class Tv extends Electronics{
    private String type;
    private int screenSize;

    public Tv(String brand, double price, int guarantee,String type, int screenSize)
    {
        super(brand, price, guarantee);
        this.type = type;
        this.screenSize = screenSize;
    }

    @Override
    public String toString()
    {
        return("\nTV Information:\n"+super.toString()+"\nType : "+type+"\nScreen size: "+screenSize+"\"");
    }

    @Override
    public String findPromotion()
    {
        if(type.equals("LCD") && price >500)
            return ("\nYou get a free toaster!\n");
        else if(type.equals("HD") && price >800)
            return ("\nYou get a free food processor!\n");
        else
            return ("\nNo promotion.\n");
    }
}