/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b4_dkxe;

import java.util.Scanner;

/**
 *
 * @author ddtru
 */
public class Xe {
    private String chuxe, loaixe;
    private int dungtich;
    private double gt;
    
    Xe(){
        chuxe = "";
        loaixe = "";
        dungtich = 0;
        gt = 0;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap ten chu xe: ");
        chuxe = sc.nextLine();
        System.out.print("Nhap loai xe: ");
        loaixe = sc.nextLine();
        System.out.print("Nhap dung tich xe: ");
        dungtich = sc.nextInt();
        System.out.print("Nhap gia xe: ");
        gt = sc.nextDouble();
    }
    private double thue(){
        double result = 0;
        if(dungtich < 100) result = 0.01*gt;
        else if(dungtich <= 200) result  = 0.03*gt;
        else result = 0.05*gt;
        
        return result;
    }
    //toString
    @Override
    public String toString() {
        return String.format("%-20s %-15s %10d %15.2f %15.2f", chuxe, loaixe, dungtich, gt, thue());
    }
}
