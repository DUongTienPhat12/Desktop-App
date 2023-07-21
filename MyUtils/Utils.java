/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package MyUtils;

/**
 *
 * @author phatt
 */
import java.util.Scanner;

public class Utils {

    public static String getString(String welcome,String msg) {
        boolean check = true;
        String result = "";
        Scanner sc = new Scanner(System.in);
        do {
            System.out.println(welcome);
            result = sc.nextLine();
            if (result.isEmpty()) {
                System.out.println(msg);

            } else {
                check = false;

            }

        } while (check);
        return result;
    }

    public static String getStringreg(String welcome, String pattern, String msg,String msgreg) {

        boolean check = true;
        String result = "";
        Scanner sc = new Scanner(System.in);
        do {

            System.out.println(welcome);
            result = sc.nextLine();
            if (result.isEmpty()) {
                System.out.println(msg);

            } else if (!result.matches(pattern)) {
                System.out.println(msgreg);

            } else {
                check = false;
            }

        } while (check);
        
        return result;

    }

    public static int getInt(String welcome, int min) {

        boolean check = true;
        int number = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try {

                System.out.println(welcome);
                number = Integer.parseInt(sc.nextLine());
                if (number <= min) {
                    System.out.println("Number must be larger than " + min);

                } else {
                    check = false;

                }
            } catch (Exception e) {
                System.out.println("Input number!!!");

            }

        } while (check || number < min);
        return number;

    }

    public static float getfloat(String welcome, int min) {
        boolean check = true;
        float number = 0;
        Scanner sc = new Scanner(System.in);
        do {
            try {
                System.out.println(welcome);
                number = Float.parseFloat(sc.nextLine());
                if (number < min) {
                    System.out.println("Number must be larger than " + min);
                } else {
                    check = false;

                }

            } catch (Exception e) {

                System.out.println("Input number!!!");
            }
        } while (check || number < min);

        return number;
    }
}
