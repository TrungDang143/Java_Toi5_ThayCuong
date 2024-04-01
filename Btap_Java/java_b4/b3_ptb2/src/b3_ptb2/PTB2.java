/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package b3_ptb2;

import java.util.Scanner;

/**
 *
 * @author ddtru
 */
public class PTB2 {
    private double a, b, c, x1, x2;
    private int result;
    public PTB2(){
        a = 0;
        b = 0;
        c = 0;
        x1 = 0;
        x2 = 0;
        result = 0;
    }
    public void nhap(){
        Scanner sc = new Scanner(System.in);
        do{
            System.out.print("Nhap a = ");
            a = sc.nextDouble();
        }while (a==0);
        System.out.print("Nhap b = ");
        b = sc.nextDouble();
        System.out.print("Nhap c = ");
        c = sc.nextDouble();     
    }
    public void tinh(){
        double delta = b * b - 4 * a * c;

        if (delta > 0) {
            // Phương trình có hai nghiệm phân biệt
            x1 = (-b + Math.sqrt(delta)) / (2 * a);
            x2 = (-b - Math.sqrt(delta)) / (2 * a);
            result = 2;
            
        } else if (delta == 0) {
            // Phương trình có nghiệm kép
            x1 = -b / (2 * a);
            x2 = x1;
            result = 1;
        } else {
            // Phương trình không có nghiệm thực
            result = 0;
        }
    }
    public void xuat(){
        if(result ==2)
            System.out.printf("\n%-3.2fx^2 + %-3.2fx + %-3.2f%10s = %.2f, x2 = %5.2f", a, b, c, "x1", x1, x2);
        else if(result == 1)
            System.out.printf("\n%-3.2fx^2 + %-3.2fx + %-3.2f %10s = %.2f", a, b, c,"x1", x1);        
        else System.out.printf("\n%-4.2fx^2 + %-4.2fx + %-4.2f %15s", a, b, c,"Vo No");

    }
}
