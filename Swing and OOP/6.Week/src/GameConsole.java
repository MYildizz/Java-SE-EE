


/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author murat
 */
public class GameConsole extends Electronics {

    private int hdd;
    private double usb;

    public GameConsole(String brand, double price, int guarantee, int hdd, double usb) {
        super(brand, price, guarantee);
        this.hdd = hdd;
        this.usb = usb;
    }

    @Override
    public String toString() {
        return ("\nGame Console Information:\n" + super.toString() + "\nHDD  : " + hdd + "GB" + "\nUSB  : " + usb);
    }

    @Override
    public String findPromotion() {
        if (hdd > 30) {
            price -= price * gameConsoleDiscount;
            return ("\nPrice after discount: " + price +"\n");
        }
        return "\nNo discount!\n";
    }
}
