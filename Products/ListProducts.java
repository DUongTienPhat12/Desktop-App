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
import MyUtils.Utils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

public class ListProducts {

    String code;
    String name;
    String brand;
    String size;
    int power, Quantity, price;
    String RAM, CPU;
    boolean dev;
    List<Product> list = new ArrayList<>();

    public void addproduct() {
        int choice;
        
        do {
            System.out.println("Choose a product to add:");
            System.out.println("1/Add SmartPhone");
            System.out.println("2/Add TV");
            System.out.println("3/Add Airconditioner");
            System.out.println("4/Return to main menu");
            choice = Utils.getInt("Enter choice", 0);
            switch (choice) {
                case 1:
                    do{
                    code = Utils.getStringreg("Enter code:", "^SM\\d{3}$", "Code cannot be emptied!!!", "Code is wrong format<SM000>");
                    int pos  = checkcode(code);
                    if( pos >=0 ){
                        System.out.println("Code has existed!!!");
                      dev=true;  
                    }
                    else {
                    dev=false;
                            }
                    }
                    while(dev);
                    
                    name = Utils.getString("Enter name:", "Name cannot be emptied!!!");
                    brand = Utils.getString("Enter brand:", "Brand cannot be emptied!!!");
                    price = Utils.getInt("Enter price:", 0);
                    Quantity = Utils.getInt("Enter Quantity", 0);
                    RAM = Utils.getString("Enter RAM : ", "RAM cannot be emptied!!!");
                    CPU = Utils.getString("Enter CPU: ", "CPU  cannot be emptied!!!");
                    size = Utils.getString("Enter size:", "Size cannot be emptied!!!");
                    list.add(new SmartPhone(size, RAM, CPU, code, name, brand, price, Quantity));
                    System.out.println("\n-------------Added---------------\n");
                    break;
                case 2:
                    do{
                    code = Utils.getStringreg("Enter code:", "^TI\\d{3}$", "Code cannot be emptied!!!", "Code is wrong format<TI000>");
                    int ti= checkcode(code);
                 
                    if( ti >=0 ){
                        System.out.println("Code has existed!!!");
                      dev=true;  
                    }
                    else {
                    dev=false;
                            }
                    }
                    while(dev);
                    
                    name = Utils.getString("Enter name:", "Name cannot be emptied!!!");
                    brand = Utils.getString("Enter brand:", "Brand cannot be emptied!!!");
                    price = Utils.getInt("Enter price:", 0);
                    Quantity = Utils.getInt("Enter Quantity", 0);
                    size = Utils.getString("Enter size:", "Size cannot be emptied!!!");
                    list.add(new TV(size, code, name, brand, price, Quantity));
                    System.out.println("\n-------------Added---------------\n");
                    break;
                case 3:
                    do{
                    code = Utils.getStringreg("Enter code:", "^AIR\\d{3}$", "Code cannot be emptied!!!", "Code is wrong format<AIR000>");
                    int air=checkcode(code);
         
                    if(air >=0 ){
                        System.out.println("Code has existed!!!");
                      dev=true;  
                    }
                    else {
                    dev=false;
                            }
                    }
                    while(dev);
                    name = Utils.getString("Enter name:", "Name cannot be emptied!!!");
                    brand = Utils.getString("Enter brand:", "Brand cannot be emptied!!!");
                    price = Utils.getInt("Enter price:", 0);
                    Quantity = Utils.getInt("Enter Quantity", 0);
                    power = Utils.getInt("Enter power:", 0);
                    list.add(new Airconditioner(power, code, name, brand, price, Quantity));
                    System.out.println("\n-------------Added---------------\n");
                    break;
                default:
                    System.out.println("Return to main menu");
                    
                    break;
            }

        } while (choice <= 3);

    }

    public int checkcode(String prod) {
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getCode().equals(prod)) {
                return i;
            }

        }
        return -1;
    }

    public void sortSmartPhone() {

        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product t, Product t1) {
                int d = t.getPrice() - t1.getPrice();
                if (d > 0) {
                    return -1;
                }
                if (d == 0) {
                    return t.getCode().compareTo(t1.getCode());
                }
                return 1;
            }
        });

        for (Product x : list) {
            if (x instanceof SmartPhone) {
                System.out.println("SmartPhone: ");
                x.printinfo();

            }

        }

    }

    public void sortTV() {

        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product t, Product t1) {
                int d = t.getPrice() - t1.getPrice();
                if (d > 0) {
                    return 1;
                }
                if (d == 0) {
                    return t.getCode().compareTo(t1.getCode());
                }
                return -1;
            }
        });
        for (Product x : list) {
            if (x instanceof TV) {
                System.out.println("TV:");
                x.printinfo();

            }

        }
    }

    public void sortAir() {

        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product t, Product t1) {
                int d = t.getPrice() - t1.getPrice();
                if (d > 0) {
                    return -1;
                }
                if (d == 0) {
                    return t.getCode().compareTo(t1.getCode());
                }
                return 1;
            }
        });
        for (Product x : list) {
            if (x instanceof Airconditioner) {
                System.out.println("Airconditioner: ");
                x.printinfo();

            }

        }
    }

    public void printlist() {
        System.out.println(list);

    }

    public void updateSmartPhone(Product li) {
        for (Product x : list) {
            if(li instanceof SmartPhone){
                if(li.equals(x)){
                x.setName(Utils.getString("Enter name: ", "Name cannot be emptied!!!"));
                x.setBrand(Utils.getString("Enter brand: ", "Brand cannot be emptied!!!"));
                x.setPrice(Utils.getInt("Enter price: ", 0));
                x.setQuantity(Utils.getInt("Enter Quantity: ", 0));
                ((SmartPhone) x).setRAM(Utils.getString("Enter RAM: ", "RAM cannot be emptied!!!"));
                ((SmartPhone) x).setCPU(Utils.getString("Enter CPU: ", "CPU cannot be emptied!!!"));
                ((SmartPhone) x).setSize(Utils.getString("Enter size:", "Size cannot be emptied!!!"));
                 System.out.println("\n--------Updated--------\n");
                }
            }
       }

    }

    public void updateTV(Product li) {
        for (Product x : list) {
            if(li instanceof TV){
                if(li.equals(x)){
                x.setName(Utils.getString("Enter name: ", "Name cannot be emptied!!!"));
                x.setBrand(Utils.getString("Enter brand: ", "Brand cannot be emptied!!!"));
                x.setPrice(Utils.getInt("Enter price: ", 0));
                x.setQuantity(Utils.getInt("Enter Quantity: ", 0));
                ((TV) x).setSize(Utils.getString("Enter size: ", "Size cannot be emptied!!!"));
                System.out.println("\n---Updated---\n");
                }
            }

        }

    }

    public void updateAir(Product li) {
        for (Product x : list) {
            if (li instanceof Airconditioner) {
                if(li.equals(x)){
                x.setName(Utils.getString("Enter name: ", "Name cannot be emptied!!!"));
                x.setBrand(Utils.getString("Enter brand: ", "Brand cannot be emptied!!!"));
                x.setPrice(Utils.getInt("Enter price: ", 0));
                x.setQuantity(Utils.getInt("Enter Quantity: ", 0));
                ((Airconditioner) x).setPower(Utils.getInt("Enter power: ", 0));
                System.out.println("\n---Updated---\n");
                }
            }
        }
    }
    

    public void Update() {
        String prod;
        do{
        prod = Utils.getString("Enter code to Update:", "Code cannot be emptied!!!");
        int pos = checkcode(prod);
        if (pos >= 0) {
            if (list.get(pos) instanceof SmartPhone) {
                updateSmartPhone(list.get(pos));
                dev=false;
            }            
            if (list.get(pos) instanceof TV) {
                updateTV(list.get(pos));
                dev=false;
            }
            if (list.get(pos) instanceof Airconditioner) {
                updateAir(list.get(pos));
                dev=false;
            }
           
        }
        else{
            System.out.println("Code is not existed!!!");
           dev=true;
        }
        }while(dev);
    }

    public void remove() {
        String prod;
        do{
        prod = Utils.getString("Enter code:", "Code cannot be emptied!!!");
        int pos = checkcode(prod);
        if (pos >= 0) {
            list.remove(pos);
            System.out.println("\n---------Removed--------\n");
            dev=false;
        } else {
            System.out.println("Code is not existed!!!, Please enter again");
            dev=true;
        }
        }while(dev);
    }

    public void total() {
        int result1 = 0, result2 = 0, result3 = 0, sum;
        for (Product x : list) {
            
            if (x instanceof SmartPhone) {
                result1 += ((SmartPhone) x).price * ((SmartPhone) x).Quantity;
            }
            if (x instanceof TV) {
                result2 += ((TV) x).price * ((TV) x).Quantity;

            } else if (x instanceof Airconditioner) {
                result3 += ((Airconditioner) x).price * ((Airconditioner) x).Quantity;

            }

        }

        sum = result1 + result2 + result3;
        System.out.println("Total amount= " + sum);

    }

    public void highest() {

        Collections.sort(list, new Comparator<Product>() {
            @Override
            public int compare(Product t, Product t1) {
                int d= t.getPrice()-t1.getPrice();
                if(d>0) return -1;
                if(d==0) return t.getCode().compareTo(t1.getCode());
                return 1;
            }
        });
        
        for(Product x : list)
        {
            if(list.get(0).getPrice() == x.getPrice())
            {
                
                System.out.println(x);
            }
            else{
                list.get(0);
            }
        }
      
              
            
    }

}
