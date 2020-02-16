


public abstract class Electronics implements IElectronics{
    protected String brand;
    protected double price;
    protected int guarantee;

    public Electronics(String brand, double price, int guarantee)
    {
        this.brand = brand;
        this.price = price;
        this.guarantee = guarantee;
    }

    @Override
    public String toString()
    {
        return("\nBrand: "+brand+"\nPrice: "+price+" TL"+"\nGuarantee: "+guarantee+" years");
    }
}