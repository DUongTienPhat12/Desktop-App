/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package GUI;

import MyUtils.Utils;
import Products.ListProducts;

/**
 *
 * @author phatt
 */
public class DemoProducts {
      public static void main(String[] args) {
        int choice;
        ListProducts obj = new ListProducts();
        do {
            System.out.println("1/Add a Product");
            System.out.println("2/Print out list of product");
            System.out.println("3/List of Smart Phone in Descending order of price");
            System.out.println("4/List of Tivis in Ascending order of price");
            System.out.println("5/Airconditioner in Descending order of price");
            System.out.println("6/Print information about products with the highest prices");
            System.out.println("7/Update the product information based on the code ");
            System.out.println("8/Delete an product based on the code ");
            System.out.println("9/Print the total amount of all products ");
            System.out.println("10/Exit");
            choice = Utils.getInt("Enter choice:", 0);
            switch (choice) {
                case 1:
                    obj.addproduct(); 
                    break;
                case 2:
                    obj.printlist();
                    break;
                case 3:
                    obj.sortSmartPhone();
                    break;
                case 4:
                    obj.sortTV();
                    break;
                case 5:
                    obj.sortAir();
                    break;
                case 6:
                    obj.highest();
                    break;
                case 7:
                    obj.Update();
                    break;
                case 8:
                    obj.remove();
                    break;
                case 9:
                    obj.total();
                    break;
                case 10:
                    System.out.println("Goodbye!");
                    System.exit(0);
            }

        } while (choice <= 10);

    }

}
