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
public abstract class Product {
    
 protected  String code;
 protected   String name;
  protected String brand;
  protected  int price;
  protected  int Quantity;

    public Product(String code, String name, String brand, int price, int Quantity) {
        this.code = code;
        this.name = name;
        this.brand = brand;
        this.price = price;
        this.Quantity = Quantity;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getQuantity() {
        return Quantity;
    }

    public void setQuantity(int Quantity) {
        this.Quantity = Quantity;
    }
    public  void printinfo(){}
    
}

