/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uri1010;

import java.text.DecimalFormat;
import java.util.Scanner;

/**
 *
 * @author Anderson
 */
public class Uri1010 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cod1,cod2,num1,num2;
        float val1,val2, total;
        String s, a[];
        Scanner scan = new Scanner(System.in);
        DecimalFormat dt = new DecimalFormat("#.00");
        s = scan.nextLine();
        a = s.split(" ");
        num1 = Integer.parseInt(a[1].trim());
        val1 = Float.parseFloat(a[2].trim());
        s = scan.nextLine();
        a = s.split(" ");
        num2 = Integer.parseInt(a[1].trim());
        val2 = Float.parseFloat(a[2].trim());
        total = num1*val1 + num2*val2;
        a = dt.format(total).split(",");
        System.out.println("VALOR A PAGAR: R$ "+a[0]+"."+a[1] +"\n");
    }
    
}
