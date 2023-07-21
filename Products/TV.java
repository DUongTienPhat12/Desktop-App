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
public class TV extends Product {
   private String size;

    public TV(String size, String code, String name, String brand, int price, int Quantity) {
        super(code, name, brand, price, Quantity);
        this.size = size;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }
    public void printinfo(){
        System.out.println( code+"-"+name+"-"+brand+"-"+price+"-"+Quantity+"-"+size);
    
    
    }
    public String toString(){
    return code+"-"+name+"-"+brand+"-"+price+"-"+Quantity+"-"+size;
    
    }
}
