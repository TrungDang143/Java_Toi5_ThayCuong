/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package b3_ptb2;

import java.util.Scanner;

/**
 *
 * @author ddtru
 */
public class B3_ptb2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int n;
        Scanner sc = new Scanner(System.in);
        System.out.print("Nhap so luon PTB2: ");
        n = sc.nextInt();
        PTB2[] m = new PTB2[n];
        for (int i = 0; i<n; i++)
        {
            System.out.println("-- Nhap thong tin PTB2 thu "+(i+1));
            m[i] = new PTB2();
            m[i].nhap();
        }
        
        System.out.println("----------------------");
        System.out.printf("\tTHONG TIN MANG %d PTB2",n);
        System.out.printf("\n%20s %25s","Phuong trinh", "Ket qua");
        for (int i = 0; i<n; i++)
        {
            m[i].tinh();
            m[i].xuat();
        }
    }
    
}
