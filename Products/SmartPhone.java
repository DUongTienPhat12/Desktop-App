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
public class SmartPhone extends Product{
       
 
   
     private   String size;
     private   String RAM;
     private  String CPU;
    public SmartPhone(String size, String RAM, String CPU, String code, String name, String brand, int price, int Quantity) {
        super(code, name, brand, price, Quantity);
        this.size = size;
        this.RAM = RAM;
        this.CPU = CPU;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String Size) {
        this.size = size;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    public String getCPU() {
        return CPU;
    }

    public void setCPU(String CPU) {
        this.CPU = CPU;
    }
    public void printinfo(){
        System.out.println( code + "-" + name+"-"+brand+"-"+price+"-"+Quantity+"-"+CPU+"-"+RAM+"-"+size);
    }
    public String toString(){
    return code + "-" + name+"-"+brand+"-"+price+"-"+Quantity+"-"+CPU+"-"+RAM+"-"+size;
    
    }
}
