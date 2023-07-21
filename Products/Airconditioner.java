/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Products;

/**
 *
 * @author phatt
 */
public class Airconditioner extends Product{

 private   int power;

    public Airconditioner(int power, String code, String name, String brand, int price, int Quantity) {
        super(code, name, brand, price, Quantity);
        this.power = power;
    }

    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }
    public void printinfo(){
        System.out.println( code+"-"+name+"-"+brand+"-"+price+"-"+Quantity+"-"+power);
    
    }
    public String toString(){
    return code+"-"+name+"-"+brand+"-"+price+"-"+Quantity+"-"+power;
    
    }
}
